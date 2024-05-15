package model;

/**
 * A classe Ferramenta representa uma ferramenta genérica com nome, marca e custo.
 * 
 * @author leona
 * @version 1.0
 */
public class Ferramenta {
    String nome;
    String marca;
    double custo;
    
    public Ferramenta() {
        this("", "", 0.0);
    }
    /**
     * Construtor que inicializa uma ferramenta com os valores especificados.
     * 
     * @param nome  O nome da ferramenta.
     * @param marca A marca da ferramenta.
     * @param custo O custo da ferramenta.
     */
    public Ferramenta(String nome, String marca, double custo) {
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
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
