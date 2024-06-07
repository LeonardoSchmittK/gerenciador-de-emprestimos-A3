/*
* Classe EmprestimoDAO
* 
* Essa classe é responsável por fornecer métodos para interação com o banco de dados relacionados às operações de empréstimos.
*/
package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import model.Emprestimo;

public class EmprestimoDAO {
    // Lista para armazenar os empréstimos
    public ArrayList<Emprestimo> EmprestimoLista = new ArrayList<>();
    /*
     * Método getEmprestimoLista()
     * 
     * Descrição: Recupera uma lista de todos os empréstimos do banco de dados.
     * 
     * @return Um ArrayList contendo objetos Emprestimo.
     * 
     * Comportamento: Limpa a EmprestimoLista antes de buscar dados do banco de dados. Constrói objetos Emprestimo a partir dos dados recuperados e os adiciona à lista.
     */
    public ArrayList<Emprestimo> getEmprestimoLista() {
        EmprestimoLista.clear();

        try {
            Statement stmt = ConexaoDao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimo");
            while (res.next()) {
                int id = res.getInt("id");
                String ferramentasId = res.getString("ferramentas");
                int amigoId = res.getInt("amigoId");
                String nomeAmigo = res.getString("nomeAmigo");
                Date dataInicio = res.getDate("dataInicio");
                Date dataFinal = res.getDate("dataFinal");
                String marca = res.getString("marca");
                Double custo = res.getDouble("custo");
                if (dataFinal == null) {
                    Emprestimo objetoEmprestimo = new Emprestimo(id, ferramentasId, amigoId, nomeAmigo, dataInicio.toLocalDate(), null, marca, custo);
                    EmprestimoLista.add(objetoEmprestimo);

                } else {
                    System.out.println(dataFinal);
                    Emprestimo objetoEmprestimo = new Emprestimo(id, ferramentasId, amigoId, nomeAmigo, dataInicio.toLocalDate(), dataFinal.toLocalDate(), marca, custo);
                    EmprestimoLista.add(objetoEmprestimo);

                }
            }
            stmt.close();

        } catch (SQLException Erro) {
            System.out.println("Erro: " + Erro);
        }
        return EmprestimoLista;
    }
   /*
    * Método getEmprestimoQueryBd(Boolean estaAtivo)
    * 
    * Descrição: Recupera uma lista de empréstimos com base no status ativo do banco de dados.     * 
    *
    * @param estaAtivo um booleano indicando se o empréstimo está ativo ou não.
    * 
    * @return Um ArrayList contendo objetos Emprestimo que correspondem ao status ativo especificado.
    * 
    * Comportamento: Limpa a EmprestimoLista antes de buscar dados do banco de dados. Constrói objetos Emprestimo a partir dos dados recuperados e os adiciona à lista.
    */
    public ArrayList<Emprestimo> getEmprestimoQueryBd(Boolean estaAtivo) {
        EmprestimoLista.clear();

        try {
            Statement stmt = ConexaoDao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimo WHERE estaAtivo = " + estaAtivo);
            while (res.next()) {
                int id = res.getInt("id");
                String ferramentasId = res.getString("ferramentas");
                int amigoId = res.getInt("amigoId");
                String nomeAmigo = res.getString("nomeAmigo");
                Date dataInicio = res.getDate("dataInicio");
                Date dataFinal = res.getDate("dataFinal");
                String marca = res.getString("marca");
                Double custo = res.getDouble("custo");

                if (dataFinal == null) {
                    Emprestimo objetoEmprestimo = new Emprestimo(id, ferramentasId, amigoId, nomeAmigo, dataInicio.toLocalDate(), null, marca, custo);
                    EmprestimoLista.add(objetoEmprestimo);

                } else {
                    System.out.println(dataFinal + "<<< >E>E>E>>");
                    Emprestimo objetoEmprestimo = new Emprestimo(id, ferramentasId, amigoId, nomeAmigo, dataInicio.toLocalDate(), dataFinal.toLocalDate(), marca, custo);

                    EmprestimoLista.add(objetoEmprestimo);

                }

            }
            stmt.close();

        } catch (SQLException Erro) {
            System.out.println("Erro: " + Erro);
        }
        return EmprestimoLista;
    }
    /*
     * Método estaAmigoDevendo(int amigoIdParameter)
     * 
     * Descrição: Verifica se um amigo possui empréstimos ativos.
     * 
     * @param amigoIdParameter: int representando o ID do amigo.
     * 
     * @return true se o amigo tiver empréstimos ativos, caso contrário, false.
     * 
     * Comportamento: Limpa a EmprestimoLista antes de consultar o banco de dados. Verifica se existem empréstimos ativos para o amigo especificado.
     */
    public boolean estaAmigoDevendo(int amigoIdParameter) {
        EmprestimoLista.clear();

        try {
            Statement stmt = ConexaoDao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimo WHERE amigoId = " + amigoIdParameter + " AND estaAtivo = true");
            while (res.next()) {
                int id = res.getInt("id");
                String ferramentasId = res.getString("ferramentas");
                int amigoId = res.getInt("amigoId");
                String nomeAmigo = res.getString("nomeAmigo");
                Date dataInicio = res.getDate("dataInicio");
                Date dataFinal = res.getDate("dataFinal");
                String marca = res.getString("marca");
                Double custo = res.getDouble("custo");

                if (dataFinal == null) {
                    Emprestimo objetoEmprestimo = new Emprestimo(id, ferramentasId, amigoId, nomeAmigo, dataInicio.toLocalDate(), null, marca, custo);
                    EmprestimoLista.add(objetoEmprestimo);

                } else {
                    Emprestimo objetoEmprestimo = new Emprestimo(id, ferramentasId, amigoId, nomeAmigo, dataInicio.toLocalDate(), dataFinal.toLocalDate(), marca, custo);
                    EmprestimoLista.add(objetoEmprestimo);

                }

                if (!EmprestimoLista.isEmpty()) {
                    return true;
                }
            }
            stmt.close();

        } catch (SQLException Erro) {
            System.out.println("Erro: " + Erro);
        }
        return false;
    }
    /*
     * Método deleteEmprestimoBd(int id)
     * 
     * Descrição: Exclui um empréstimo do banco de dados.
     * 
     * @param Um int representando o ID do empréstimo a ser excluído.
     * 
     * @return true se a exclusão for bem-sucedida, caso contrário, false.
     * 
     * Comportamento: Exclui o empréstimo com o ID especificado do banco de dados.
     */
    public boolean deleteEmprestimoBd(int id) {
        try {
            Statement stmt = ConexaoDao.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_emprestimo WHERE id = " + id);
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro ao remover emprestimo: " + erro);
        }
        return true;
    }
   
    /*
     * Método insertEmprestimoDb(Emprestimo objeto)
     * 
     * Descrição: Insere um novo empréstimo no banco de dados.
     * 
     * @param objeto uma instância de Emprestimo representando o empréstimo a ser inserido.
     * 
     * @retun true se a inserção for bem-sucedida, caso contrário, lança uma RuntimeException.
     * 
     * Comportamento: Constrói uma declaração SQL para inserir o empréstimo no banco de dados.
     */
    public boolean insertEmprestimoDb(Emprestimo objeto) {
        String sql = "INSERT INTO tb_emprestimo(id, nomeAmigo, amigoId, estaAtivo, dataInicio, dataFinal, marca, custo, ferramentas) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = ConexaoDao.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getId());

            stmt.setString(2, objeto.getNomeAmigo());
            stmt.setInt(3, objeto.getAmigoId());
            stmt.setBoolean(4, true);

            if (objeto.getDataInicio() != null) {
                stmt.setDate(5, Date.valueOf(objeto.getDataInicio()));
            } else {
                stmt.setNull(5, java.sql.Types.DATE);
            }

            if (objeto.getDataFinal() != null) {
                stmt.setDate(6, Date.valueOf(objeto.getDataFinal()));
            } else {
                stmt.setNull(6, java.sql.Types.DATE);
            }

            stmt.setString(7, objeto.getMarca());
            stmt.setDouble(8, objeto.getCusto());
            stmt.setString(9, objeto.getFerramentasId());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao inserir empréstimo no banco de dados: " + erro);
            throw new RuntimeException(erro);
        }
    }

    /*
     * Método setEmprestimoLista(ArrayList<Emprestimo> EmprestimoLista)
     * 
     * Descrição: Define a lista de empréstimos.
     * 
     * @param EmprestimoLista um ArrayList contendo objetos Emprestimo.
     * 
     * Comportamento: Define o atributo EmprestimoLista para a lista fornecida.
     */
    public void setEmprestimoLista(ArrayList<Emprestimo> EmprestimoLista) {
        this.EmprestimoLista = EmprestimoLista;
    }
    /*
     * Método maiorID()
     * 
     * Descrição: Recupera o maior ID de empréstimos do banco de dados.
     * 
     * @return O maior ID de empréstimos.
     * 
     * Comportamento: Recupera o valor máximo de ID do banco de dados.
     */
    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = ConexaoDao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_emprestimo");
            res.next();
            maiorID = res.getInt("id");

            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao resgatar maior id de emprestimo: " + ex);
        }

        return maiorID;
    }
    
    /*
     * Método updateEmprestimoBd(Emprestimo objeto)
     * 
     * Descrição: Atualiza um empréstimo existente no banco de dados.
     * 
     * @param uma instância de Emprestimo representando as informações do empréstimo atualizado.
     * 
     * @return true se a atualização for bem-sucedida, caso contrário, lança uma RuntimeException.
     * 
     * Comportamento: Constrói uma declaração SQL para atualizar o empréstimo no banco de dados.
     */
    public boolean updateEmprestimoBd(Emprestimo objeto) {
        String sql = "UPDATE tb_emprestimo set nomeFerramenta = ? ,ferramentaId = ? ,nomeAmigo= ?,amigoId = ?,estaAtivo = ?,dataInicio = ?,dataFinal = ?, marca = ?, custo = ? WHERE id = ?";
        try {
            PreparedStatement stmt = ConexaoDao.getConexao().prepareStatement(sql);

            stmt.setString(3, objeto.getNomeAmigo());
            stmt.setInt(4, objeto.getAmigoId());
            stmt.setDate(7, Date.valueOf(objeto.getDataInicio()));
            stmt.setDate(8, Date.valueOf(objeto.getDataFinal()));
            stmt.setString(9, objeto.getMarca());
            stmt.setDouble(10, objeto.getCusto());

            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao dar update emprestimo:" + erro);
            throw new RuntimeException(erro);
        }
    }

    /*
     * Método updateEmprestimoAtivoBd(int id, boolean estaAtivo, LocalDate dataFinal)
     * 
     * Descrição: Atualiza o status ativo e a data final de um empréstimo no banco de dados.
     * 
     * @param um int representando o ID do empréstimo a ser atualizado.
     * estaAtivo: Um booleano indicando o status ativo do empréstimo.
     * dataFinal: A data final do empréstimo.
     * 
     * @return true se a atualização for bem-sucedida, caso contrário, lança uma RuntimeException.
     * 
     * Comportamento: Constrói uma declaração SQL para atualizar o status ativo e a data final do empréstimo no banco de dados.
     */
    public boolean updateEmprestimoAtivoBd(int id, boolean estaAtivo, LocalDate dataFinal) {
        String sql = "UPDATE tb_emprestimo SET estaAtivo = ?, dataFinal = ? WHERE id = " + id;

        try {
            PreparedStatement stmt = ConexaoDao.getConexao().prepareStatement(sql);
            stmt.setBoolean(1, estaAtivo);
            stmt.setDate(2, Date.valueOf(dataFinal));

            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao devolver emprestimo:" + erro);
            throw new RuntimeException(erro);
        }
    }

    /*
     * Método updateEmprestimoRecebido(int id, LocalDate dataRecebimento)
     * 
     * Descrição: Atualiza a data de recebimento de um empréstimo devolvido no banco de dados.
     * 
     *@param um inteiro representando o ID do empréstimo a ser atualizado.
     * dataRecebimento: A data em que o empréstimo foi recebido de volta.
     * 
     * @return true se a atualização for bem-sucedida, caso contrário, lança uma RuntimeException.
     * 
     * Comportamento: Constrói uma declaração SQL para atualizar a data de recebimento do empréstimo no banco de dados.
     */
    public boolean updateEmprestimoRecebido(int id, LocalDate dataRecebimento) {

        String sql = "UPDATE tb_emprestimo set dataFinal = ? WHERE id = " + id;
        try {
            PreparedStatement stmt = ConexaoDao.getConexao().prepareStatement(sql);
            stmt.setDate(1, Date.valueOf(dataRecebimento));

            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao dar update emprestimo:" + erro);
            throw new RuntimeException(erro);
        }

    }

}
