package dao;

import java.sql.*;
import java.util.ArrayList;
import model.Amigo;

public class AmigoDAO {

    public ArrayList<Amigo> AmigoLista = new ArrayList<>();

    public ArrayList<Amigo> getAmigoLista(){
        AmigoLista.clear();

        try{
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_alunos");
            while (res.next()) {

                String nome = res.getString("nome");
                int telefone = res.getInt("marca");

                Amigo ObjetoAmigo = new Amigo(nome, telefone);

                AmigoLista.add(objeto);
            }
            stmt.close();

        }catch(SQLException Erro){
            System.out.println("Erro: " + Erro);
        }
        return AmigoLista;
    }
    
    public void setAmigoLista(){
        this.AmigoLista = AmigoLista;
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
