package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDao {
    
    // conexao com o banco de dados cujo schema é emprestimoFerramentas e senha workbench é "Dgllm2024!"
    public static Connection getConexao() {
        Connection connection = null; //instância da conexão
        try {

            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost";
            String database = "emprestimoFerramentas";
            String url = "jdbc:mysql://" + server + ":3306/"
                    + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "Dgllm2024!";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Status: DB CONECTADO!!");
            } else {
                System.out.println("Status: DB NÃO CONECTADO!!");
            }
            return connection;
        } catch (ClassNotFoundException e) { //Driver não encontrado
            System.out.println("O driver SQL nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar-se ao banco de dados...");
            return null;
        }
    }
    
}
