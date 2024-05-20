package model;

import java.util.ArrayList;
import dao.AmigoDAO;

/**
    * A classe Amigo representa um amigo com um nome e um número de telefone.
    */
    public class Amigo {
    /** O nome do amigo. */
    String nome;
    /** O número de telefone do amigo. */
    int telefone;
    int id;
    
    AmigoDAO dao;

    /**
     * Construtor padrão da classe Amigo.
     * Inicializa o nome como uma string vazia e o telefone como 0.
     */
    public Amigo() {
        this(0, "", 0);
        dao = new AmigoDAO();
    }
    /**
     * Construtor da classe Amigo que aceita nome e telefone como parâmetros.
     * @param nome O nome do amigo.
     * @param telefone O número de telefone do amigo.
     */
    public Amigo(int id, String nome, int telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public ArrayList getListaAmigo() {
        return dao.getAmigoLista();
    }

     public boolean deleteAmigoDb(int id) {
        dao.deleteAmigoBd(id);
        return true;
    }
    
    public boolean insertAmigoDb(int id, String nome, int telefone){
        id = this.dao.maiorID() + 1;
        Amigo objeto = new Amigo(id,nome,telefone);

        dao.insertAmigoDb(objeto);
        
        return true;
    }
    
          // Edita um aluno especÍfico pelo seu campo ID
    public boolean updateAmigoBd(int id, String nome, int telefone) {
        Amigo objeto = new Amigo(id, nome, telefone);
        int indice = this.procuraIndice(id);
        dao.updateAmigoBd(objeto);
        return true;
    }

    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < dao.getAmigoLista().size(); i++) {
            if (dao.getAmigoLista().get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }
    
     public int maiorID(){
        return dao.maiorID();
    }

    /**
     * Obtém o nome do amigo.
     * @return O nome do amigo.
     */
    public String getNome() {
        return nome;
    }
    /**
     * Define o nome do amigo.
     * @param nome O novo nome do amigo.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
     /**
     * Obtém o número de telefone do amigo.
     * @return O número de telefone do amigo.
     */
    public int getTelefone() {
        return telefone;
    }
    /**
     * Define o número de telefone do amigo.
     * @param telefone O novo número de telefone do amigo.
     */

    public void setId(int id) {
        this.id = id;
    }
     
    public int getId(){
        return this.id;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}
