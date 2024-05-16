package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Emprestimo;

public class EmprestimoDAO {
    
    public ArrayList<Emprestimo> EmprestimoLista = new ArrayList<>();

    public ArrayList<Emprestimo> getEmprestimoLista(){
        EmprestimoLista.clear();

        try{
            Statement stmt = ConexaoDao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_alunos");
            while (res.next()) {
                //To do
                /*
                String nome = res.getString("nome");
                String marca = res.getString("marca");
                int custo = res.getInt("custo");
                 */

                Emprestimo ObjetoEmprestimo = new Emprestimo();

                EmprestimoLista.add(ObjetoEmprestimo);
            }
            stmt.close();

        }catch(SQLException Erro){
            System.out.println("Erro: " + Erro);
        }
        return EmprestimoLista;
    }
    
    public void setEmprestimoLista(ArrayList<Emprestimo> EmprestimoLista){
        this.EmprestimoLista = EmprestimoLista;
    }

}
