/*
 EmprestimoDAO
    
 Esta classe representa o Objeto de Acesso a Dados (DAO) para lidar
 com operações relacionadas à entidade Emprestimo no banco de dados.

 Atributos:
 - EmprestimoLista: Um ArrayList para armazenar objetos Emprestimo.

 Métodos:
  - getEmprestimoLista(): Recupera uma lista de objetos Emprestimo do banco de dados.
  - setEmprestimoLista(ArrayList<Emprestimo> EmprestimoLista): Define a lista de Emprestimo.

*/
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Emprestimo;

public class EmprestimoDAO {
    // ArrayList para armazenar objetos Emprestimo
    public ArrayList<Emprestimo> EmprestimoLista = new ArrayList<>();
    /**
     * Recupera uma lista de objetos Emprestimo do banco de dados.
     * 
     * @return ArrayList<Emprestimo> A lista de objetos Emprestimo recuperados do banco de dados.
     */
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
    /**
     * Define a lista de Emprestimo.
     * 
     * @param EmprestimoLista A lista de objetos Emprestimo a ser definida.
     */
    public void setEmprestimoLista(ArrayList<Emprestimo> EmprestimoLista){
        this.EmprestimoLista = EmprestimoLista;
    }

}
