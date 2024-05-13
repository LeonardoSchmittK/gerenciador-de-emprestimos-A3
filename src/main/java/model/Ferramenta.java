
package model;

public class Ferramenta {
    String nome;
    String marca;
    double custo;
    
    public Ferramenta() {
        this("", "", 0.0);
    }

    public Ferramenta(String nome, String marca, double custo) {
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    
    
}
