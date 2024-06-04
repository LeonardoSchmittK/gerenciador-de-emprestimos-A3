package model;

import java.util.ArrayList;

import dao.FerramentaDAO;

/**
 * A classe Ferramenta representa uma ferramenta genérica com nome, marca e custo.
 * 
 * @author leona
 * @version 1.0
 */
public class Ferramenta {
     int id;
    String nome;
    String marca;
    double custo;
    FerramentaDAO dao;
    
   public Ferramenta() {
        this(0,"", "", 0.0);
        dao = new FerramentaDAO();
        
    }
    /**
     * Construtor que inicializa uma ferramenta com os valores especificados.
     * 
     * @param nome  O nome da ferramenta.
     * @param marca A marca da ferramenta.
     * @param custo O custo da ferramenta.
     */
    public Ferramenta(int id,String nome, String marca, double custo) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
    }
    
    public ArrayList getListaFerramentas() {
        return dao.getFerramentaLista();
    }
    
     public boolean deleteFerramentaDb(int id) {
        dao.deleteFerramentaBd(id);
        return true;
    }
   
    public boolean insertFerramentaDb(String nome, String marca, double custo){
        int id = this.dao.maiorID() + 1;
        Ferramenta objeto = new Ferramenta(id,nome,marca,custo);

        dao.insertFerramentaDb(objeto);
        
        return true;
    }
    
          // Edita uma ferramenta especÍfico pelo seu campo ID
    public boolean updateFerramentaBd(int id, String nome, String marca, double custo) {
        Ferramenta objeto = new Ferramenta(id, nome, marca, custo);
        int indice = this.procuraIndice(id);
        dao.updateFerramentaBd(objeto);
        return true;
    }

    // procura o id de objeto da lista que contem o ID enviado.
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < dao.getFerramentaLista().size(); i++) {
            if (dao.getFerramentaLista().get(i).getId() == id) {
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
     
    /**
     * Obtém o nome da ferramenta.
     * 
     * @return O nome da ferramenta.
     */
    public String getNome() {
        return nome;
    }
    /**
     * Define o nome da ferramenta.
     * 
     * @param nome O novo nome da ferramenta.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Obtém a marca da ferramenta.
     * 
     * @return A marca da ferramenta.
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Define a marca da ferramenta.
     * 
     * @param marca A nova marca da ferramenta.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Obtém o custo da ferramenta.
     * 
     * @return O custo da ferramenta.
     */
    public double getCusto() {
        return custo;
    }
    /**
     * Define o custo da ferramenta.
     * 
     * @param custo O novo custo da ferramenta.
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    
    
}
