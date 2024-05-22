package model;

import java.util.ArrayList;
import dao.EmprestimoDAO;

public class Emprestimo {
     int id;
    int ferramentaId;
    String nomeFerramenta;
    int amigoId;
    String nomeAmigo;
    EmprestimoDAO dao;
    
    
    public Emprestimo(){
        this(0,0,"",0,"");
        this.setDao(new EmprestimoDAO());
    }
    
    
    public Emprestimo(int id, int ferramentaId, String nomeFerramenta, int amigoId, String nomeAmigo){
        this.setId(id);
        this.setFerramentaId(ferramentaId);
        this.setNomeFerramenta(nomeFerramenta);
        this.setAmigoId(amigoId);
        this.setNomeAmigo(nomeAmigo);
    }
    
     public boolean insertEmprestimoDb(int ferramentaId, String nomeFerramenta, int amigoId, String nomeAmigo){
        int id = this.dao.maiorID() + 1;
        Emprestimo objeto = new Emprestimo(id,ferramentaId,nomeFerramenta,amigoId,nomeAmigo);

        dao.insertEmprestimoDb(objeto);
        
        return true;
    }
     
      public boolean updateEmprestimoBd(int id, int ferramentaId, String nomeFerramenta, int amigoId, String nomeAmigo) {
        Emprestimo objeto = new Emprestimo(id, ferramentaId, nomeFerramenta, amigoId,nomeAmigo);
        int indice = this.procuraIndice(id);
        dao.updateEmprestimoBd(objeto);
        return true;
    }
      
       private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < dao.getEmprestimoLista().size(); i++) {
            if (dao.getEmprestimoLista().get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }
    
     public ArrayList getListaEmprestimos() {
        return dao.getEmprestimoLista();
    }

     public boolean deleteFerramentaDb(int id) {
        dao.deleteEmprestimoBd(id);
        return true;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFerramentaId() {
        return ferramentaId;
    }

    public void setFerramentaId(int ferramentaId) {
        this.ferramentaId = ferramentaId;
    }

    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public void setNomeFerramenta(String nomeFerramenta) {
        this.nomeFerramenta = nomeFerramenta;
    }

    public int getAmigoId() {
        return amigoId;
    }

    public void setAmigoId(int amigoId) {
        this.amigoId = amigoId;
    }

    public String getNomeAmigo() {
        return nomeAmigo;
    }

    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }

    public EmprestimoDAO getDao() {
        return dao;
    }

    public void setDao(EmprestimoDAO dao) {
        this.dao = dao;
    }

}
