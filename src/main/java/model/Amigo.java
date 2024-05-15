    package model;
    
    /**
    * A classe Amigo representa um amigo com um nome e um número de telefone.
    */
    public class Amigo {
    /** O nome do amigo. */
    String nome;
    /** O número de telefone do amigo. */
    int telefone;
    /**
     * Construtor padrão da classe Amigo.
     * Inicializa o nome como uma string vazia e o telefone como 0.
     */
    public Amigo() {
        this("", 0);
    }
    /**
     * Construtor da classe Amigo que aceita nome e telefone como parâmetros.
     * @param nome O nome do amigo.
     * @param telefone O número de telefone do amigo.
     */
    public Amigo(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
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
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
}