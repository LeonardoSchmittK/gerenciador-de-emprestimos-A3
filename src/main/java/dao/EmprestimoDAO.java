package dao;

import java.sql.PreparedStatement;
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

    // id e nome

    public boolean InsertEmprestimoDb(Emprestimo objeto){
        String sql = "INSERT INTO tb_emprestimo(id, nome) VALUES(?, ?)";
        try {
            PreparedStatement stmt = ConexaoDao.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());

            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao inserir emprestimo no banco de dados:" + erro);
            throw new RuntimeException(erro);
        }
    }

    public boolean deleteEmprestimoBd(int id) {
        try {
            Statement stmt = ConexaoDao.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_emprestimo WHERE id = " + id);
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao remover emprestimo: " + erro);
        }
        return true;
    }

    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = ConexaoDao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_emprestimo");
            res.next();
            maiorID = res.getInt("id");

            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao resgatar maior id de emprestimo: " + ex);
        }

        return maiorID;
    }

    public boolean updateAmigoBd(Emprestimo objeto) {
        String sql = "UPDATE tb_emprestimo set nome = ? WHERE id = ?";
        try {
            PreparedStatement stmt = ConexaoDao.getConexao().prepareStatement(sql);
            stmt.setString(1, objeto.getNome());
            stmt.setInt(3, objeto.getId());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao atualizar emprestimo:" + erro);
            throw new RuntimeException(erro);
        }
    }

}
