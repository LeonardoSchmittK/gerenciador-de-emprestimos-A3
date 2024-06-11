/**
 * A classe Emprestimo modela um objeto de empréstimo na aplicação.
 * 
 * Um empréstimo contém informações como ID, IDs das ferramentas emprestadas, ID do amigo, nome do amigo,
 * datas de início e término do empréstimo, marca das ferramentas e custo total do empréstimo.
 * 
 * Esta classe se comunica com a camada de acesso a dados (DAO) para realizar operações no banco de dados.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import dao.EmprestimoDAO;

public class Emprestimo {
    // Atributos da classe Emprestimo
    private int id;
    private String ferramentasId;
    private int amigoId;
    private String nomeAmigo;
    private LocalDate dataInicio;
    private LocalDate dataFinal;
    private String marca;
    private Double custo;
    private EmprestimoDAO dao;
    /**
     * Construtor padrão da classe Emprestimo.
     * Inicializa um objeto Emprestimo com valores padrão e associa um DAO a ele.
     */
    public Emprestimo() {
        this(0, "", 0, "", null, null, "", 0.0);
        this.setDao(new EmprestimoDAO());
    }
    /**
     * Método para verificar se um amigo está devendo.
     * 
     * @param amigoId O ID do amigo
     * @return        true se o amigo está devendo, false caso contrário
     */
    public boolean estaAmigoDevendo(int amigoId) {
        return dao.estaAmigoDevendo(amigoId);
    }

    public Emprestimo(int id, String ferramentasId, int amigoId, String nomeAmigo, LocalDate DataAtual, LocalDate DataFinal, String marca, Double custo) {
        this.setId(id);
        this.setFerramentasId(ferramentasId);
        this.setAmigoId(amigoId);
        this.setNomeAmigo(nomeAmigo);
        this.setDataInicio(DataAtual);
        this.setDataFinal(DataFinal);
        this.setMarca(marca);
        this.setCusto(custo);
    }
    
    public boolean insertEmprestimoDb(String ferramentasId, int amigoId, String nomeAmigo, LocalDate DataAtual, LocalDate DataFinal, String marca, Double custo) {
        int id = this.dao.maiorID() + 1;

        Emprestimo objeto = new Emprestimo(id, ferramentasId, amigoId, nomeAmigo, DataAtual, DataFinal, marca, custo);

        dao.insertEmprestimoDb(objeto);

        return true;
    }
    public boolean updateEmprestimoBd(int id, String ferramentasId, int amigoId, String nomeAmigo, LocalDate DataAtual, LocalDate DataFinal) {
        Emprestimo objeto = new Emprestimo(id, ferramentasId, amigoId, nomeAmigo, DataAtual, DataFinal, marca, custo);
        int indice = this.procuraIndice(id);
        dao.updateEmprestimoBd(objeto);
        return true;
    }

    public boolean updateEmprestimoAtivoBd(int id, boolean estaAtivo, LocalDate dataFinal) {
        dao.updateEmprestimoAtivoBd(id, estaAtivo, dataFinal);
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
    /**
     * Método para obter a lista de empréstimos do banco de dados.
     * 
     * @return A lista de empréstimos
     */
    public ArrayList getListaEmprestimos() {
        return dao.getEmprestimoLista();
    }
    /**
     * Método para obter a lista de empréstimos do banco de dados com base na ativação.
     * 
     * @param estaAtivo Indica se o empréstimo está ativo ou não
     * @return          A lista de empréstimos
     */
    public ArrayList getEmprestimoQuery(Boolean estaAtivo) {
        return dao.getEmprestimoQueryBd(estaAtivo);
    }
    /**
     * Método para deletar um empréstimo do banco de dados.
     * 
     * @param id O ID do empréstimo a ser deletado
     * @return   true se o empréstimo foi deletado com sucesso, false caso contrário
     */
    public boolean deleteEmprestimoDb(int id) {
        dao.deleteEmprestimoBd(id);
        return true;
    }
    // Getters e Setters dos atributos da classe
    public String getFerramentasId() {
        return ferramentasId;
    }

    public void setFerramentasId(String ferramentasId) {
        this.ferramentasId = ferramentasId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getDataInicio() {
        return this.dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFinal(LocalDate DataFinal) {
        this.dataFinal = DataFinal;
    }

    public LocalDate getDataFinal() {
        return this.dataFinal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

}
