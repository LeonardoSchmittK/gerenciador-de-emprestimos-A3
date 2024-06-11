package visao;
/**
 * Classe Mensagem
 * 
 * Esta classe representa uma exceção personalizada que é lançada para indicar mensagens de erro específicas em determinadas situações.
 */
public class Mensagem extends Exception{
    /**
     * Construtor Mensagem
     * 
     * Cria uma nova instância de Mensagem com a mensagem de erro fornecida.
     * 
     * @param mensagem Uma string contendo a mensagem de erro específica.
     */
    public Mensagem(String mensagem) {
        super(mensagem);
    }
}
