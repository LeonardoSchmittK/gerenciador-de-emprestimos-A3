package model;

import java.util.ArrayList;
import dao.EmprestimoDAO;

public class Emprestimo {
    private String nomeAmigo, nomeFerramenta;
    private int idAmigo, idFerramenta, id;
    EmprestimoDAO dao;
    
    public Emprestimo(){
        this("", "", 0, 0, 0);
    }   
    
    public Emprestimo(String nomeAmigo, String nomeFerramenta, int idAmigo, int idFerramenta, int id){
        this.setNomeAmigo(nomeAmigo);;
        this.setNomeFerramenta(nomeFerramenta);;
        this.setIdAmigo(idAmigo);;
        this.setIdFerramenta(idFerramenta); 
        this.setId(id);
    }

    public ArrayList getEmprestimoList() {
        return dao.getEmprestimoLista();
    }
    
     public boolean deleteEmprestimoDb(int id) {
        dao.deleteEmprestimoBd(id);
        return true;
    }
    
    public boolean insertEmprestimoaDb(String nomeFerramenta,String nomeAmigo,  int idAmigo, int idFerramenta){
        int id = this.dao.maiorID() + 1;
        Emprestimo objeto = new Emprestimo(nomeFerramenta,nomeAmigo, idAmigo, idFerramenta, id);

        dao.InsertEmprestimoDb(objeto);
        
        return true;
    }
    
          // Edita uma ferramenta especÍfico pelo seu campo ID
    public boolean updateEmprestimoBd(String nomeFerramenta,String nomeAmigo,  int idAmigo, int idFerramenta, int id) {
        Emprestimo objeto = new Emprestimo(nomeFerramenta,nomeAmigo, idAmigo, idFerramenta, id);
        int indice = this.procuraIndice(id);
        dao.updateEmprestimoBd(objeto);
        return true;
    }

    // procura o id de objeto da lista que contem o ID enviado.
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < dao.getEmprestimoLista().size(); i++) {
            if (dao.getEmprestimoLista().get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }
    
     public void setId(int id) {
        this.id = id;
    }
     
     public int getId(){
         return this.id;
     }
    
    
     public int maiorID(){
        return dao.maiorID();
    }  

    public String getNomeAmigo() {
        return nomeAmigo;
    }

    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }

    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public void setNomeFerramenta(String nomeFerramenta) {
        this.nomeFerramenta = nomeFerramenta;
    }

    public int getIdAmigo() {
        return idAmigo;
    }

    public void setIdAmigo(int idAmigo) {
        this.idAmigo = idAmigo;
    }

    public int getIdFerramenta() {
        return idFerramenta;
    }

    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
    }
    
}
