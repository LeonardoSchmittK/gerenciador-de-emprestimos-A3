package frame;



public class MainFrame extends javax.swing.JFrame {
    
    CadastroAmigosFrame JanelaCadastroAmigo = new CadastroAmigosFrame();
    CadastroFerramentaFrame JanelaCadastro = new CadastroFerramentaFrame();
    
    
    public MainFrame() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAcoes = new javax.swing.JMenu();
        MenuCadFerramenta = new javax.swing.JMenuItem();
        MenuCadastroAmigo = new javax.swing.JMenuItem();
        MenuDadosFerramenta = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuAcoes.setText("Ações");
        MenuAcoes.setToolTipText("");
        MenuAcoes.setName("Cadastro de Ferramentas"); // NOI18N
        MenuAcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAcoesActionPerformed(evt);
            }
        });

        MenuCadFerramenta.setText("Cadastrar Ferramenta");
        MenuCadFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadFerramentaActionPerformed(evt);
            }
        });
        MenuAcoes.add(MenuCadFerramenta);

        MenuCadastroAmigo.setText("Cadastro para Amigos");
        MenuCadastroAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroAmigoActionPerformed(evt);
            }
        });
        MenuAcoes.add(MenuCadastroAmigo);

        MenuDadosFerramenta.setText("Dados Ferramentas");
        MenuDadosFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDadosFerramentaActionPerformed(evt);
            }
        });
        MenuAcoes.add(MenuDadosFerramenta);

        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        MenuAcoes.add(MenuSair);

        jMenuBar1.add(MenuAcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_MenuSairActionPerformed

    private void MenuDadosFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDadosFerramentaActionPerformed

    }//GEN-LAST:event_MenuDadosFerramentaActionPerformed

    private void MenuCadFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadFerramentaActionPerformed
        JanelaCadastro.setVisible(true);
    }//GEN-LAST:event_MenuCadFerramentaActionPerformed

    private void MenuCadastroAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroAmigoActionPerformed
        JanelaCadastroAmigo.setVisible(true);
    }//GEN-LAST:event_MenuCadastroAmigoActionPerformed

    private void MenuAcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAcoesActionPerformed

    }//GEN-LAST:event_MenuAcoesActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAcoes;
    private javax.swing.JMenuItem MenuCadFerramenta;
    private javax.swing.JMenuItem MenuCadastroAmigo;
    private javax.swing.JMenuItem MenuDadosFerramenta;
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
