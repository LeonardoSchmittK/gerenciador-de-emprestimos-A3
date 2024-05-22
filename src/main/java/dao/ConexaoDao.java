/*
 ConexaoDao
    
 Esta classe fornece métodos para estabelecer conexão com o banco de dados MySQL.

 Métodos:
 - getConexao(): Retorna uma conexão com o banco de dados.
*/
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDao {
    
    // conexao com o banco de dados cujo schema é emprestimoFerramentas e senha workbench é "Dgllm2024!"
    // é estático para ser usado nas outras classes deste pacote sem o uso de new()
    public static Connection getConexao() {
        Connection connection = null; //instância da conexão
        try {
            // Carrega o driver JDBC do MySQL
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            // Configurações de conexão
            String server = "localhost";
            String database = "emprestimoFerramentas";
            String url = "jdbc:mysql://" + server + ":3306/"
                    + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "Dgllm2024!";
            // Estabelece a conexão
            connection = DriverManager.getConnection(url, user, password);
            // Exibe o status da conexão
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
            // Erro ao conectar-se ao banco de dados
            System.out.println("Não foi possível conectar-se ao banco de dados...");
            return null;
        }
    }
    
}
