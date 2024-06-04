/**
 * A classe Main é responsável por iniciar a aplicação e exibir a interface gráfica principal.
 */
package principal;

import visao.FrmMainFrame;

public class Principal {/**
     * O método principal da aplicação, que inicia a execução do programa.
     * Cria uma instância da classe FrmMainFrame e torna a janela visível ao usuário.
     * 
     * @param args argumentos da linha de comando (não utilizado neste caso)
     */
    public static void main(String[]args){
     
       FrmMainFrame objetotela = new FrmMainFrame();
        objetotela.setVisible(true);
    }

    
}

   
