package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Emprestimo;

public class EmprestimoDAO {
    
    public ArrayList<Emprestimo> EmprestimoList = new ArrayList<>();

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
