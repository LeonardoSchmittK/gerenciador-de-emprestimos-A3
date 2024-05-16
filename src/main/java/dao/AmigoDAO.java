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
                int telefone = res.getInt("marca");

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

}
