package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Amigo;

public class AmigoDAO {

    public ArrayList<Amigo> AmigoLista = new ArrayList<>();

    public ArrayList<Amigo> getAmigoLista(){
        AmigoLista.clear();

        try{
            Statement stmt = ConexaoDao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_alunos");
            while (res.next()) {

                String nome = res.getString("nome");
                int telefone = res.getInt("telefone");

                Amigo ObjetoAmigo = new Amigo(nome, telefone);

                AmigoLista.add(ObjetoAmigo);
            }
            stmt.close();

        }catch(SQLException Erro){
            System.out.println("Erro: " + Erro);
        }
        return AmigoLista;
    }
    
    public void setAmigoLista(ArrayList<Amigo> AmigoLista){
        this.AmigoLista = AmigoLista;
    }

    public boolean insertAmigoDb(Amigo objeto) {
        String sql = "INSERT INTO tb_amigo(nome, telefone) VALUES(?,?)";
        try {
            PreparedStatement stmt = ConexaoDao.getConexao().prepareStatement(sql);
            stmt.setString(2, objeto.getNome());
            stmt.setInt(1, objeto.getTelefone());

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
            System.out.println("Erro ao resgatar maior id: " + ex);
        }

        return maiorID;
    }

    public boolean updateAmigoBd(Amigo objeto) {
        String sql = "UPDATE tb_amigo set nome = ?, telefone = ? WHERE id = ?";
        try {
            PreparedStatement stmt = ConexaoDao.getConexao().prepareStatement(sql);
            stmt.setString(1, objeto.getNome());
            stmt.setInt(2, objeto.getTelefone());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
}
