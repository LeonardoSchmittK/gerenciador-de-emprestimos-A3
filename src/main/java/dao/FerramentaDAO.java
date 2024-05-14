
package dao;

import java.sql.*;
import model.Ferramenta;
import java.util.ArrayList;


public class FerramentaDAO {
    
    public ArrayList<Ferramenta> FerramentaLista = new ArrayList<>();

    public ArrayList<Ferramenta> getFerramentaLista(){
        FerramentaLista.clear();
        
        try{
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_alunos");
            while (res.next()) {

                String nome = res.getString("nome");
                String marca = res.getString("marca");
                int custo = res.getInt("custo");

                Ferramenta objeto = new Ferramenta(nome, marca, custo);

                FerramentaLista.add(objeto);
            }
            stmt.close();

        }catch(SQLException Erro){
            System.out.println("Erro: " + Erro);
        }
        return FerramentaLista;
    }
    
    public void setFerramentaLista(){
        this.FerramentaLista = FerramentaLista;
    }
    


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
