package visao;

import javax.swing.JOptionPane;
import model.Ferramenta;

public class FrmCadastroFerramentaFrame extends javax.swing.JFrame {

    private Ferramenta objetoFerramenta;

    public FrmCadastroFerramentaFrame() {
        initComponents();
        this.objetoFerramenta = new Ferramenta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomeFerramentaText = new javax.swing.JLabel();
        JTFNomeFerramenta = new javax.swing.JTextField();
        MarcaText = new javax.swing.JLabel();
        CustoAquisicaoText = new javax.swing.JLabel();
        JTFMarca = new javax.swing.JTextField();
        JTFCustoAquisição = new javax.swing.JTextField();
        JBCancelar = new javax.swing.JButton();
        JBCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Cadastro de Ferramentas"); // NOI18N

        NomeFerramentaText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NomeFerramentaText.setText("Nome:");

        MarcaText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MarcaText.setText("Marca:");

        CustoAquisicaoText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CustoAquisicaoText.setText("Custo de aquisição:");

        JTFMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFMarcaActionPerformed(evt);
            }
        });

        JBCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("CADASTRAR NOVA FERRAMENTA");

        jMenu1.setText("Ações");

        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        jMenu1.add(MenuSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CustoAquisicaoText)
                            .addComponent(MarcaText)
                            .addComponent(NomeFerramentaText)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JTFMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFNomeFerramenta, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFCustoAquisição, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(0, 50, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(NomeFerramentaText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFNomeFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MarcaText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CustoAquisicaoText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTFCustoAquisição, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFMarcaActionPerformed

    }//GEN-LAST:event_JTFMarcaActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        try {
            String nomeferramenta = "";
            String marca = "";
            int custo = 0;

            if (this.JTFNomeFerramenta.getText().length() <= 2) {
                throw new Mensagem("O nome deve ter mais de 2 caracteres!");
            } else {
                nomeferramenta = this.JTFNomeFerramenta.getText();
            }

            if (this.JTFMarca.getText().length() <= 1) {
                throw new Mensagem("A marca deve ter mais de 1 caracteres!");
            } else {
                marca = this.JTFMarca.getText();
            }

            if (Integer.parseInt(this.JTFCustoAquisição.getText()) <= 0) {
                throw new Mensagem("O valor de aquisição deve ser maior que 0!");
            } else {
                custo = Integer.parseInt(this.JTFCustoAquisição.getText());
            }

            if (this.objetoFerramenta.insertFerramentaDb(nomeferramenta, marca, custo)) {
                JOptionPane.showMessageDialog(rootPane, "Ferramenta Cadastrada com Sucesso!");
                // limpa campos da interface
                this.JTFNomeFerramenta.setText("");
                this.JTFMarca.setText("");
                this.JTFCustoAquisição.setText("");

            }

        } catch (Mensagem erro) {

            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erronumb) {

            JOptionPane.showMessageDialog(null, "Número inválido!");
        }

    }//GEN-LAST:event_JBCadastrarActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_MenuSairActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadastroFerramentaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFerramentaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFerramentaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFerramentaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroFerramentaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustoAquisicaoText;
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JTextField JTFCustoAquisição;
    private javax.swing.JTextField JTFMarca;
    private javax.swing.JTextField JTFNomeFerramenta;
    private javax.swing.JLabel MarcaText;
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JLabel NomeFerramentaText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
