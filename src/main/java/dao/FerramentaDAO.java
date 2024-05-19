/**
 * A classe FerramentaDAO fornece métodos para acessar e manipular dados
 * relacionados a ferramentas em um banco de dados.
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import model.Ferramenta;

/**
 * Lista de ferramentas recuperadas do banco de dados.
 */
public class FerramentaDAO {

    public ArrayList<Ferramenta> FerramentaLista = new ArrayList<>();

    /**
     * Recupera a lista de ferramentas do banco de dados.
     *
     * @return ArrayList contendo objetos Ferramenta
     */
    public ArrayList<Ferramenta> getFerramentaLista(){
        FerramentaLista.clear();
        
            try{
            Statement stmt = ConexaoDao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramenta");
            while (res.next()) {
            int id = res.getInt("id");
            String nome = res.getString("nome");
            String marca = res.getString("marca");
            int custo = res.getInt("custo");

            Ferramenta ObjetoFerramenta = new Ferramenta(id,nome, marca, custo);

            FerramentaLista.add(ObjetoFerramenta);
        }
            stmt.close();

        }catch(SQLException Erro){
            System.out.println("Erro ao carregar lista de ferramentas: " + Erro);
        }
            
        return FerramentaLista;
    }

    /**
     * Define a lista de ferramentas.
     *
     * @param FerramentaLista ArrayList contendo objetos Ferramenta
     */
    public void setFerramentaLista(ArrayList<Ferramenta> FerramentaLista) {
        this.FerramentaLista = FerramentaLista;
    }

    public boolean insertFerramentaDb(Ferramenta objeto) {
        String sql = "INSERT INTO tb_ferramenta(id,nome,marca,custo) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = ConexaoDao.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getMarca());
            stmt.setDouble(4, objeto.getCusto());

            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao inserir ferramenta no banco de dados:" + erro);
            throw new RuntimeException(erro);
        }
    }

    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = ConexaoDao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_ferramenta");
            res.next();
            maiorID = res.getInt("id");

            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao resgatar maior id: " + ex);
        }

        return maiorID;
    }

}
