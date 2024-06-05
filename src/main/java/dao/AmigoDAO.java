/*
    AmigoDAO
    
    Esta classe representa o Objeto de Acesso a Dados (DAO) para manipular
    operações relacionadas à entidade Amigo no banco de dados.

    Atributos:
        - AmigoLista: Um ArrayList para armazenar objetos Amigo.

    Métodos:
        - getAmigoLista(): Recupera uma lista de objetos Amigo do banco de dados.
        - setAmigoLista(ArrayList<Amigo> AmigoLista): Define a lista de Amigo.

*/
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Amigo;

public class AmigoDAO {
    // ArrayList para armazenar objetos Amigo
    public ArrayList<Amigo> AmigoLista = new ArrayList<>();
    /**
     * Recupera uma lista de objetos Amigo do banco de dados.
     * 
     * @return ArrayList<Amigo> A lista de objetos Amigo recuperados do banco de dados.
     */
    public ArrayList<Amigo> getAmigoLista(){
        // Limpa a lista existente
        AmigoLista.clear();

        try{
            // Estabelece a conexão com o banco de dados e cria uma declaração
            Statement stmt = ConexaoDao.getConexao().createStatement();
            // Executa a consulta SQL para recuperar os dados
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigo");
            // Itera pelo conjunto de resultados
            while (res.next()) {
                // Obtém os dados do resultado
                int id = res.getInt("id");
                String nome = res.getString("nome");
                String telefone = res.getString("telefone");
                 // Cria um novo objeto Amigo com os dados obtidos

                Amigo ObjetoAmigo = new Amigo(id, nome, telefone);
                // Adiciona o objeto Amigo à lista
                AmigoLista.add(ObjetoAmigo);
            }
            // Fecha a declaração
            stmt.close();

        }catch(SQLException Erro){
            System.out.println("Erro: " + Erro);
        }
        // Retorna a lista de objetos Amigo
        return AmigoLista;
    }
    /**
     * Define a lista de Amigo.
     * 
     * @param AmigoLista A lista de objetos Amigo a ser definida.
     */
    public void setAmigoLista(ArrayList<Amigo> AmigoLista){
        this.AmigoLista = AmigoLista;
    }

    public boolean insertAmigoDb(Amigo objeto) {
        String sql = "INSERT INTO tb_amigo(id, nome, telefone) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = ConexaoDao.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getTelefone());

            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao inserir amigo no banco de dados:" + erro);
            throw new RuntimeException(erro);
        }
    }

    public boolean deleteAmigoBd(int id) {
        try {
            Statement stmt = ConexaoDao.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_amigo WHERE id = " + id);
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao remover amigo: " + erro);
        }
        return true;
    }

    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = ConexaoDao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_amigo");
            res.next();
            maiorID = res.getInt("id");

            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao resgatar maior id de amigo: " + ex);
        }

        return maiorID;
    }

    public boolean updateAmigoBd(Amigo objeto) {
        String sql = "UPDATE tb_amigo set nome = ? ,telefone = ? WHERE id = ?";
        try {
            PreparedStatement stmt = ConexaoDao.getConexao().prepareStatement(sql);
             stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getTelefone());
            stmt.setInt(3, objeto.getId());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao atualizar amigo:" + erro);
            throw new RuntimeException(erro);
        }
    }
}
