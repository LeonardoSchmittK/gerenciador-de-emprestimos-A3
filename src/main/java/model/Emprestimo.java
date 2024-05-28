package model;

import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

import dao.EmprestimoDAO;

public class Emprestimo {

    LocalDate DataAtual, DataFinal;
    int id;
    int ferramentaId;
    String nomeFerramenta;
    int amigoId;
    String nomeAmigo;
    LocalDate dataInicio;
    LocalDate dataFinal;
    EmprestimoDAO dao;

    public Emprestimo() {
        this(0, 0, "", 0, "", null, null);
        this.setDao(new EmprestimoDAO());
    }

    public boolean estaAmigoDevendo(int amigoId) {
        return dao.estaAmigoDevendo(amigoId);
    }

    public Emprestimo(int id, int ferramentaId, String nomeFerramenta, int amigoId, String nomeAmigo, LocalDate DataAtual, LocalDate DataFinal) {
        
        this.setId(id);
        this.setFerramentaId(ferramentaId);
        this.setNomeFerramenta(nomeFerramenta);
        this.setAmigoId(amigoId);
        this.setNomeAmigo(nomeAmigo);
        this.setDataInicio(DataAtual);
        this.setDataFinal(DataFinal);
    }

    public boolean insertEmprestimoDb(int ferramentaId, String nomeFerramenta, int amigoId, String nomeAmigo, LocalDate DataAtual, LocalDate DataFinal) {
        int id = this.dao.maiorID() + 1;
        
        Emprestimo objeto = new Emprestimo(id, ferramentaId, nomeFerramenta, amigoId, nomeAmigo, DataAtual, DataFinal);

        dao.insertEmprestimoDb(objeto);

        return true;
    }

    public boolean updateEmprestimoBd(int id, int ferramentaId, String nomeFerramenta, int amigoId, String nomeAmigo, LocalDate DataAtual, LocalDate DataFinal) {
        Emprestimo objeto = new Emprestimo(id, ferramentaId, nomeFerramenta, amigoId, nomeAmigo, DataAtual, DataFinal);
        int indice = this.procuraIndice(id);
        dao.updateEmprestimoBd(objeto);
        return true;
    }

    public boolean updateEmprestimoAtivoBd(int id, boolean estaAtivo) {
        dao.updateEmprestimoAtivoBd(id, estaAtivo);
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

    public ArrayList getEmprestimoQuery(Boolean estaAtivo) {
        return dao.getEmprestimoQueryBd(estaAtivo);
    }

    public boolean deleteEmprestimoDb(int id) {
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

    public LocalDate getDataInicio() {
        return this.dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFinal() {
        return this.dataFinal;
    }

    public LocalDate getDataAtual() {
        LocalDate dataAtual = LocalDate.now();
        return dataAtual;
    }

    public Date getData(LocalDate data) {
        return Date.valueOf(data);
    }

    public void setDataAtual(LocalDate DataAtual) {
        this.DataAtual = DataAtual;
    }

    public void setDataFinal(LocalDate DataFinal) {
        this.DataFinal = DataFinal;
    }

}
