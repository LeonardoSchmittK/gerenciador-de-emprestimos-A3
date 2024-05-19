package visao;

import visao.FrmCadastroFerramentaFrame;
import visao.FrmCadastroAmigosFrame;



public class FrmMainFrame extends javax.swing.JFrame {
    
    FrmCadastroAmigosFrame JanelaCadastroAmigo = new FrmCadastroAmigosFrame();
    FrmCadastroFerramentaFrame JanelaCadastro = new FrmCadastroFerramentaFrame();
    FrmdadosFerramentas janelaFerramentas = new FrmdadosFerramentas();
    
    public FrmMainFrame() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAcoes = new javax.swing.JMenu();
        JMenuCadFerramenta = new javax.swing.JMenuItem();
        JMenuCadastroAmigo = new javax.swing.JMenuItem();
        JMenuDadosFerramenta = new javax.swing.JMenuItem();
        JSair = new javax.swing.JMenuItem();

        jToggleButton1.setBackground(new java.awt.Color(204, 204, 204));
        jToggleButton1.setForeground(new java.awt.Color(204, 204, 204));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de empréstimos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("GERENCIADOR DE EMPRÉSTIMOS");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("V1.0");

        MenuAcoes.setText("Ações");
        MenuAcoes.setToolTipText("");
        MenuAcoes.setName("Cadastro de Ferramentas"); // NOI18N
        MenuAcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAcoesActionPerformed(evt);
            }
        });

        JMenuCadFerramenta.setText("Cadastrar Ferramenta");
        JMenuCadFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCadFerramentaActionPerformed(evt);
            }
        });
        MenuAcoes.add(JMenuCadFerramenta);

        JMenuCadastroAmigo.setText("Cadastro para Amigos");
        JMenuCadastroAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCadastroAmigoActionPerformed(evt);
            }
        });
        MenuAcoes.add(JMenuCadastroAmigo);

        JMenuDadosFerramenta.setText("Dados Ferramentas");
        JMenuDadosFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuDadosFerramentaActionPerformed(evt);
            }
        });
        MenuAcoes.add(JMenuDadosFerramenta);

        JSair.setText("Sair");
        JSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSairActionPerformed(evt);
            }
        });
        MenuAcoes.add(JSair);

        jMenuBar1.add(MenuAcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_JSairActionPerformed

    private void JMenuDadosFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuDadosFerramentaActionPerformed
      janelaFerramentas.setVisible(true);
      janelaFerramentas.imprimirTabela();
    }//GEN-LAST:event_JMenuDadosFerramentaActionPerformed

    private void JMenuCadFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCadFerramentaActionPerformed
        JanelaCadastro.setVisible(true);
    }//GEN-LAST:event_JMenuCadFerramentaActionPerformed

    private void JMenuCadastroAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCadastroAmigoActionPerformed
        JanelaCadastroAmigo.setVisible(true);
    }//GEN-LAST:event_JMenuCadastroAmigoActionPerformed

    private void MenuAcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAcoesActionPerformed
        janelaFerramentas.setVisible(true);
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
            java.util.logging.Logger.getLogger(FrmMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenuCadFerramenta;
    private javax.swing.JMenuItem JMenuCadastroAmigo;
    private javax.swing.JMenuItem JMenuDadosFerramenta;
    private javax.swing.JMenuItem JSair;
    private javax.swing.JMenu MenuAcoes;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
