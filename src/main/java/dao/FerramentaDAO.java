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
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_alunos");
            while (res.next()) {

            String nome = res.getString("nome");
            String marca = res.getString("marca");
            int custo = res.getInt("custo");

            Ferramenta ObjetoFerramenta = new Ferramenta(nome, marca, custo);

            FerramentaLista.add(ObjetoFerramenta);
        }
            stmt.close();

        }catch(SQLException Erro){
            System.out.println("Erro: " + Erro);
        }
        return FerramentaLista;
    }
    /**
     * Define a lista de ferramentas.
     * 
     * @param FerramentaLista ArrayList contendo objetos Ferramenta
     */
    public void setFerramentaLista(ArrayList<Ferramenta> FerramentaLista){
        this.FerramentaLista = FerramentaLista;
    }
   
}
