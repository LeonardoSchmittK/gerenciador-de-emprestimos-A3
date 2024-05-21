package model;

import dao.FerramentaDAO;

public class Emprestimo {
    String nomeAmigo, nomeFerramenta;
    int idAmigo, idFerramenta, id;
    
    Emprestimo(){
        this("", "", 0, 0, 0);
    }   
    
    Emprestimo(String nomeAmigo, String nomeFerramenta, int idAmigo, int idFerramenta, int id){
        this.nomeAmigo = nomeAmigo;
        this.nomeFerramenta = nomeFerramenta;
        this.idAmigo = idAmigo;
        this.idFerramenta = idFerramenta;
        this.id = id; 
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
