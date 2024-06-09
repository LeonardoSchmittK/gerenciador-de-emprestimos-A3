/**
 * Classe FrmCadastroEmprestimo representa a interface de cadastro de empréstimos na aplicação.
 * 
 * Esta classe estende a classe javax.swing.JFrame para criar uma janela de cadastro.
 */
package visao;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Amigo;
import model.Emprestimo;
import model.Ferramenta;

public class FrmCadastroEmprestimo extends javax.swing.JFrame {
// Variáveis para armazenar objetos relacionados ao cadastro de empréstimo
    private Ferramenta objetoFerramenta;
    private Amigo objetoAmigo;
    private Emprestimo objetoEmprestimo;
    // Variáveis para armazenar informações relacionadas ao empréstimo
    private String dateEmprestimoFinal;
    private String dateEmprestimoInicial;
    private boolean temAmigo;
    private boolean temFerramenta;
    private String nomeEscolhido;
    private String ferramentaEscolhida;
    public ArrayList<Ferramenta> FerramentaLista = new ArrayList<>();
    public ArrayList<Amigo> AmigoLista = new ArrayList<>();
    public ArrayList<Ferramenta> ferramentasEscolhidas = new ArrayList<>();
    public String indexes = "";
    public int counterDown;
    private ArrayList<Integer> idsFerramentasAEscolher = new ArrayList<Integer>();
    /**
     * Construtor da classe FrmCadastroEmprestimo.
     * 
     * Este construtor inicializa os componentes da janela de cadastro e os objetos relacionados.
     */
    public FrmCadastroEmprestimo() {
        initComponents();
        this.setTemAmigo(false);
        this.setTemFerramenta(false);
        this.objetoEmprestimo = new Emprestimo();
        this.objetoFerramenta = new Ferramenta();
        this.objetoAmigo = new Amigo();

        this.FerramentaLista = objetoFerramenta.getListaFerramentas();
        this.AmigoLista = objetoAmigo.getListaAmigo();

        this.imprimirFerramentas();
        this.imprimirAmigos();
        //  this.imprimirValidadeEmprestimo(15);
        this.imprimirEmprestimoCoibido();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelPainelEmprestimo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxSelecionarFerramenta = new javax.swing.JComboBox<>();
        jComboBoxSelecionarAmigo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPainelFerramentasEscolhidas = new javax.swing.JPanel();
        jPanelPainelBotoesEmprestimo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelAlertaEmprestimoCoibido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("NOVO EMPRÉSTIMO");

        jLabel3.setText("para o amigo");

        jComboBoxSelecionarFerramenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBoxSelecionarFerramenta.setToolTipText("escolha a ferramenta a ser emprestada");
        jComboBoxSelecionarFerramenta.setAutoscrolls(true);
        jComboBoxSelecionarFerramenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxSelecionarFerramentaFocusGained(evt);
            }
        });
        jComboBoxSelecionarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelecionarFerramentaActionPerformed(evt);
            }
        });

        jComboBoxSelecionarAmigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBoxSelecionarAmigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxSelecionarAmigoFocusGained(evt);
            }
        });

        jLabel2.setText("Emprestar");

        javax.swing.GroupLayout jPainelFerramentasEscolhidasLayout = new javax.swing.GroupLayout(jPainelFerramentasEscolhidas);
        jPainelFerramentasEscolhidas.setLayout(jPainelFerramentasEscolhidasLayout);
        jPainelFerramentasEscolhidasLayout.setHorizontalGroup(
            jPainelFerramentasEscolhidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );
        jPainelFerramentasEscolhidasLayout.setVerticalGroup(
            jPainelFerramentasEscolhidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelPainelEmprestimoLayout = new javax.swing.GroupLayout(jPanelPainelEmprestimo);
        jPanelPainelEmprestimo.setLayout(jPanelPainelEmprestimoLayout);
        jPanelPainelEmprestimoLayout.setHorizontalGroup(
            jPanelPainelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPainelEmprestimoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPainelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPainelEmprestimoLayout.createSequentialGroup()
                        .addComponent(jComboBoxSelecionarFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jPainelFerramentasEscolhidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxSelecionarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanelPainelEmprestimoLayout.setVerticalGroup(
            jPanelPainelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPainelEmprestimoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelPainelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxSelecionarFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSelecionarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPainelFerramentasEscolhidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Cadastrar empréstimo");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(242, 242, 242));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPainelBotoesEmprestimoLayout = new javax.swing.GroupLayout(jPanelPainelBotoesEmprestimo);
        jPanelPainelBotoesEmprestimo.setLayout(jPanelPainelBotoesEmprestimoLayout);
        jPanelPainelBotoesEmprestimoLayout.setHorizontalGroup(
            jPanelPainelBotoesEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPainelBotoesEmprestimoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPainelBotoesEmprestimoLayout.setVerticalGroup(
            jPanelPainelBotoesEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPainelBotoesEmprestimoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelPainelBotoesEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabelAlertaEmprestimoCoibido.setForeground(new java.awt.Color(255, 51, 0));
        jLabelAlertaEmprestimoCoibido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAlertaEmprestimoCoibidoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAlertaEmprestimoCoibido)
                    .addComponent(jPanelPainelBotoesEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelPainelEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(123, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAlertaEmprestimoCoibido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(jPanelPainelBotoesEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jPanelPainelEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(149, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSelecionarFerramentaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxSelecionarFerramentaFocusGained

    }//GEN-LAST:event_jComboBoxSelecionarFerramentaFocusGained

    private void jComboBoxSelecionarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelecionarFerramentaActionPerformed
        // Código para seleção de ferramentas
        try {

            int idxEscolhidoFerramenta = jComboBoxSelecionarFerramenta.getSelectedIndex();
            if (idxEscolhidoFerramenta < 0) {

                return;
            }
            Ferramenta ferramentaEscolhida = this.FerramentaLista.get(this.idsFerramentasAEscolher.get(idxEscolhidoFerramenta - 1) - 1);
            if (this.ferramentasEscolhidas.indexOf(ferramentaEscolhida) >= 0) {
                return;
            } else {
                this.counterDown += 25;

                this.ferramentasEscolhidas.add(ferramentaEscolhida);
                int idFerramenta = ferramentaEscolhida.getId();
                String nomeFerramenta = ferramentaEscolhida.getNome();
                System.out.println("O ID EH " + idFerramenta + " E O NOME EH " + nomeFerramenta);

                JTextField ferramentaEscolhidaElemento = new JTextField();
                ferramentaEscolhidaElemento.setEditable(false);
                ferramentaEscolhidaElemento.setText(ferramentaEscolhida.getNome());
                ferramentaEscolhidaElemento.setSize(100, 20);
                ferramentaEscolhidaElemento.setLocation(0, counterDown);
                jPainelFerramentasEscolhidas.add(ferramentaEscolhidaElemento);
                indexes += ferramentaEscolhida.getId() + " ";
                System.out.println(indexes);
            }
        } catch (IndexOutOfBoundsException indiceErrado) {
            // catch vazio limpa os erros dispensáveis do terminal
        }

    }//GEN-LAST:event_jComboBoxSelecionarFerramentaActionPerformed

    private void jComboBoxSelecionarAmigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxSelecionarAmigoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSelecionarAmigoFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jComboBoxSelecionarFerramenta.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma ferramenta!");
        } else {
            if (jComboBoxSelecionarAmigo.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Selecione um amigo!");

            } else {

                int idxEscolhidoFerramenta = jComboBoxSelecionarFerramenta.getSelectedIndex();
                int idxEscolhidoAmigo = jComboBoxSelecionarAmigo.getSelectedIndex();

                Ferramenta ferramentaEscolhida = this.FerramentaLista.get(idxEscolhidoFerramenta - 1);

                Amigo amigoEscolhido = this.AmigoLista.get(idxEscolhidoAmigo - 1);

                int idFerramenta = ferramentaEscolhida.getId();
                String nomeFerramenta = ferramentaEscolhida.getNome();
                int idAmigo = amigoEscolhido.getId();
                String nomeAmigo = amigoEscolhido.getNome();

                if (this.objetoEmprestimo.estaAmigoDevendo(idAmigo)) {
                    JOptionPane.showMessageDialog(rootPane, nomeAmigo + " tem empréstimos não devolvidos!");
                }

                LocalDate dataInicial = LocalDate.now();
                String marca = ferramentaEscolhida.getMarca();
                Double custo = ferramentaEscolhida.getCusto();

                if (this.objetoEmprestimo.insertEmprestimoDb(indexes, idAmigo, nomeAmigo, dataInicial, null, marca, custo)) {
                    JOptionPane.showMessageDialog(rootPane, "Emprestimo cadastrado com sucesso!");
                    this.indexes = "";
                    this.ferramentasEscolhidas.clear();
                    jPainelFerramentasEscolhidas.removeAll();

                    jPainelFerramentasEscolhidas.revalidate();
                    jPainelFerramentasEscolhidas.repaint();
                    this.counterDown = 0;

                }
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    public void imprimirEmprestimoCoibido() {
        if ((!this.isTemAmigo() || !this.isTemFerramenta())) {
            this.remove(jPanelPainelEmprestimo);
            this.remove(jPanelPainelBotoesEmprestimo);
            ImageIcon iconeAlerta = new ImageIcon("imagens/icone-erro.png");
            jLabelAlertaEmprestimoCoibido.setIcon(iconeAlerta);
            jLabelAlertaEmprestimoCoibido.setText("Tenha ao menos 1 ferramenta e 1 amigo disponíveis! (clique aqui para voltar)");
        }
    }

    public void imprimirEmprestimoCoibidoForcado() {
        this.remove(jPanelPainelEmprestimo);
        this.remove(jPanelPainelBotoesEmprestimo);
        ImageIcon iconeAlerta = new ImageIcon("imagens/icone-erro.png");
        jLabelAlertaEmprestimoCoibido.setIcon(iconeAlerta);
        jLabelAlertaEmprestimoCoibido.setText("Tenha ao menos 1 ferramenta e 1 amigo disponíveis! (clique aqui para voltar)");
    }

    public void imprimirAmigos() {
        ArrayList<Amigo> minhalista = this.objetoAmigo.getListaAmigo();

        if (minhalista.size() > 0) {
            this.setTemAmigo(true);
        }

        for (Amigo amigo : minhalista) {

            jComboBoxSelecionarAmigo.addItem(amigo.getNome());

        }

    }

    public void imprimirFerramentas() {
        ArrayList<Ferramenta> minhalistaFerramentas = this.objetoFerramenta.getListaFerramentas();
        ArrayList<Emprestimo> minhalistaEmprestimos = this.objetoEmprestimo.getListaEmprestimos();
        // caso a ferramenta já esteja emprestada, não poder emprestar mais
        int counterFerramentaMostrar = 0;
        if (minhalistaFerramentas.size() > 0) {
            this.setTemFerramenta(true);
        }

        if (minhalistaEmprestimos.isEmpty()) {

            for (Ferramenta ferramenta : minhalistaFerramentas) {
                jComboBoxSelecionarFerramenta.addItem(ferramenta.getNome());
            }
        } else {
            ArrayList<String> idsColhidos = new ArrayList<String>();

            String idsString = "";

            for (Emprestimo emprestimo : minhalistaEmprestimos) {
                idsString += emprestimo.getFerramentasId();
            }
            for (Ferramenta ferramenta : minhalistaFerramentas) {
                if (!idsString.contains(ferramenta.getId() + "")) {
                    counterFerramentaMostrar++;
                    this.idsFerramentasAEscolher.add(ferramenta.getId());
                    jComboBoxSelecionarFerramenta.addItem(ferramenta.getNome());
                }
            }

            if (counterFerramentaMostrar <= 0) {
                this.remove(jPanelPainelEmprestimo);
                this.remove(jPanelPainelBotoesEmprestimo);
                ImageIcon iconeAlerta = new ImageIcon("imagens/icone-erro.png");
                jLabelAlertaEmprestimoCoibido.setIcon(iconeAlerta);
                jLabelAlertaEmprestimoCoibido.setText("Tenha ao menos 1 ferramenta e 1 amigo disponíveis! (clique aqui para voltar)");
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabelAlertaEmprestimoCoibidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAlertaEmprestimoCoibidoMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabelAlertaEmprestimoCoibidoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroEmprestimo().setVisible(true);
            }
        });
    }

    public ArrayList<Integer> getIdsFerramentasAEscolher() {
        return idsFerramentasAEscolher;
    }

    public void setIdsFerramentasAEscolher(ArrayList<Integer> idsFerramentasAEscolher) {
        this.idsFerramentasAEscolher = idsFerramentasAEscolher;
    }

    public Ferramenta getObjetoFerramenta() {
        return objetoFerramenta;
    }

    public void setObjetoFerramenta(Ferramenta objetoFerramenta) {
        this.objetoFerramenta = objetoFerramenta;
    }

    public Amigo getObjetoAmigo() {
        return objetoAmigo;
    }

    public void setObjetoAmigo(Amigo objetoAmigo) {
        this.objetoAmigo = objetoAmigo;
    }

    public Emprestimo getObjetoEmprestimo() {
        return objetoEmprestimo;
    }

    public void setObjetoEmprestimo(Emprestimo objetoEmprestimo) {
        this.objetoEmprestimo = objetoEmprestimo;
    }

    public String getDateEmprestimoFinal() {
        return dateEmprestimoFinal;
    }

    public void setDateEmprestimoFinal(String dateEmprestimoFinal) {
        this.dateEmprestimoFinal = dateEmprestimoFinal;
    }

    public String getDateEmprestimoInicial() {
        return dateEmprestimoInicial;
    }

    public void setDateEmprestimoInicial(String dateEmprestimoInicial) {
        this.dateEmprestimoInicial = dateEmprestimoInicial;
    }

    public boolean isTemAmigo() {
        return temAmigo;
    }

    public void setTemAmigo(boolean temAmigo) {
        this.temAmigo = temAmigo;
    }

    public boolean isTemFerramenta() {
        return temFerramenta;
    }

    public void setTemFerramenta(boolean temFerramenta) {
        this.temFerramenta = temFerramenta;
    }

    public String getNomeEscolhido() {
        return nomeEscolhido;
    }

    public void setNomeEscolhido(String nomeEscolhido) {
        this.nomeEscolhido = nomeEscolhido;
    }

    public String getFerramentaEscolhida() {
        return ferramentaEscolhida;
    }

    public void setFerramentaEscolhida(String ferramentaEscolhida) {
        this.ferramentaEscolhida = ferramentaEscolhida;
    }

    public ArrayList<Ferramenta> getFerramentaLista() {
        return FerramentaLista;
    }

    public void setFerramentaLista(ArrayList<Ferramenta> FerramentaLista) {
        this.FerramentaLista = FerramentaLista;
    }

    public ArrayList<Amigo> getAmigoLista() {
        return AmigoLista;
    }

    public void setAmigoLista(ArrayList<Amigo> AmigoLista) {
        this.AmigoLista = AmigoLista;
    }

    public ArrayList<Ferramenta> getFerramentasEscolhidas() {
        return ferramentasEscolhidas;
    }

    public void setFerramentasEscolhidas(ArrayList<Ferramenta> ferramentasEscolhidas) {
        this.ferramentasEscolhidas = ferramentasEscolhidas;
    }

    public String getIndexes() {
        return indexes;
    }

    public void setIndexes(String indexes) {
        this.indexes = indexes;
    }

    public int getCounterDown() {
        return counterDown;
    }

    public void setCounterDown(int counterDown) {
        this.counterDown = counterDown;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JComboBox<String> getjComboBoxSelecionarAmigo() {
        return jComboBoxSelecionarAmigo;
    }

    public void setjComboBoxSelecionarAmigo(JComboBox<String> jComboBoxSelecionarAmigo) {
        this.jComboBoxSelecionarAmigo = jComboBoxSelecionarAmigo;
    }

    public JComboBox<String> getjComboBoxSelecionarFerramenta() {
        return jComboBoxSelecionarFerramenta;
    }

    public void setjComboBoxSelecionarFerramenta(JComboBox<String> jComboBoxSelecionarFerramenta) {
        this.jComboBoxSelecionarFerramenta = jComboBoxSelecionarFerramenta;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JPanel getjPainelFerramentasEscolhidas() {
        return jPainelFerramentasEscolhidas;
    }

    public void setjPainelFerramentasEscolhidas(JPanel jPainelFerramentasEscolhidas) {
        this.jPainelFerramentasEscolhidas = jPainelFerramentasEscolhidas;
    }

    public JPanel getjPanelPainelBotoesEmprestimo() {
        return jPanelPainelBotoesEmprestimo;
    }

    public void setjPanelPainelBotoesEmprestimo(JPanel jPanelPainelBotoesEmprestimo) {
        this.jPanelPainelBotoesEmprestimo = jPanelPainelBotoesEmprestimo;
    }

    public JPanel getjPanelPainelEmprestimo() {
        return jPanelPainelEmprestimo;
    }

    public void setjPanelPainelEmprestimo(JPanel jPanelPainelEmprestimo) {
        this.jPanelPainelEmprestimo = jPanelPainelEmprestimo;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxSelecionarAmigo;
    private javax.swing.JComboBox<String> jComboBoxSelecionarFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAlertaEmprestimoCoibido;
    private javax.swing.JPanel jPainelFerramentasEscolhidas;
    private javax.swing.JPanel jPanelPainelBotoesEmprestimo;
    private javax.swing.JPanel jPanelPainelEmprestimo;
    // End of variables declaration//GEN-END:variables
}