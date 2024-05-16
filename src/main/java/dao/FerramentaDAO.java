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
            Statement stmt = this.getConexao().createStatement();
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
    /**
     * Estabelece uma conexão com o banco de dados.
     * 
     * @return Connection objeto representando a conexão com o banco de dados
     */
    // conexao com banco de dados // senha "Dgllm2024!"
     public Connection getConexao() {
        Connection connection = null; //instância da conexão
        
        try {

        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);

        String server = "localhost";
            
        String database = "emprestimoFerramentas"; // nome do database
        String url = "jdbc:mysql://" + server + ":3306/"
                + database + "?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "Dgllm2024!"; // senha do banco de dados

        connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }
            return connection;
        } catch (ClassNotFoundException e) { //Driver não encontrado
            System.out.println("O driver nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }
     
    
}
