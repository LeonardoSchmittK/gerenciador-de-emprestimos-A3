package visao;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FrmMainFrame extends javax.swing.JFrame {

    

    public FrmMainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRelatorioEmprestimosAtivos = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        MenuAcoes = new javax.swing.JMenu();
        JMenuCadFerramenta = new javax.swing.JMenuItem();
        JMenuCadastroAmigo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        JMenuDadosFerramenta = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        JCreditos = new javax.swing.JMenuItem();
        JSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de empréstimos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("GERENCIADOR DE EMPRÉSTIMOS");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("V1.0");

        jMenu2.setText("empréstimos");

        jMenuItem1.setText("Novo empréstimo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jRelatorioEmprestimosAtivos.setText("Relatório empréstimos ativos");
        jRelatorioEmprestimosAtivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRelatorioEmprestimosAtivosActionPerformed(evt);
            }
        });
        jMenu2.add(jRelatorioEmprestimosAtivos);

        jMenuItem3.setText("Relatório empréstimos realizados");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        MenuAcoes.setText("Cadastros");
        MenuAcoes.setToolTipText("");
        MenuAcoes.setName("Cadastro de Ferramentas"); // NOI18N
        MenuAcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAcoesActionPerformed(evt);
            }
        });

        JMenuCadFerramenta.setText("Cadastrar ferramenta");
        JMenuCadFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCadFerramentaActionPerformed(evt);
            }
        });
        MenuAcoes.add(JMenuCadFerramenta);

        JMenuCadastroAmigo.setText("Cadastrar amigo");
        JMenuCadastroAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCadastroAmigoActionPerformed(evt);
            }
        });
        MenuAcoes.add(JMenuCadastroAmigo);

        jMenuBar1.add(MenuAcoes);

        jMenu1.setText("dados");

        JMenuDadosFerramenta.setText("Relatório ferramentas");
        JMenuDadosFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuDadosFerramentaActionPerformed(evt);
            }
        });
        jMenu1.add(JMenuDadosFerramenta);

        jMenuItem2.setText("Relatório amigos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("sobre");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        JCreditos.setText("créditos");
        JCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCreditosActionPerformed(evt);
            }
        });
        jMenu3.add(JCreditos);

        JSair.setText("Sair");
        JSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSairActionPerformed(evt);
            }
        });
        jMenu3.add(JSair);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(414, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(130, 130, 130)))
                .addGap(349, 349, 349))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(414, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuDadosFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuDadosFerramentaActionPerformed
       FrmDadosFerramentas janelaFerramentas = new FrmDadosFerramentas();
        janelaFerramentas.setVisible(true);
        
    }//GEN-LAST:event_JMenuDadosFerramentaActionPerformed

    private void JMenuCadFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCadFerramentaActionPerformed
         FrmCadastroFerramentaFrame JanelaCadastro = new FrmCadastroFerramentaFrame();
        JanelaCadastro.setVisible(true);
    }//GEN-LAST:event_JMenuCadFerramentaActionPerformed

    private void JMenuCadastroAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCadastroAmigoActionPerformed
          FrmCadastroAmigosFrame JanelaCadastroAmigo = new FrmCadastroAmigosFrame();
        JanelaCadastroAmigo.setVisible(true);
    }//GEN-LAST:event_JMenuCadastroAmigoActionPerformed

    private void MenuAcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAcoesActionPerformed
      //  janelaFerramentas.setVisible(true);
    }//GEN-LAST:event_MenuAcoesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        FrmNovoEmprestimoFrame janelaCadastroEmprestimo = new FrmNovoEmprestimoFrame();
        janelaCadastroEmprestimo.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        FrmDadosAmigos janelaAmigos = new FrmDadosAmigos();
        janelaAmigos.setVisible(true);
        

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jRelatorioEmprestimosAtivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRelatorioEmprestimosAtivosActionPerformed
        // TODO add your handling code here:
        FrmDadosEmprestimoAtivos janelaEmprestimosAtivos = new FrmDadosEmprestimoAtivos();
        janelaEmprestimosAtivos.setVisible(true);
    }//GEN-LAST:event_jRelatorioEmprestimosAtivosActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        FrmDadosEmprestimosFeitos janelaEmprestimosFeitos = new FrmDadosEmprestimosFeitos();
        janelaEmprestimosFeitos.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

                              
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void JCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCreditosActionPerformed
       ImageIcon x = new ImageIcon("./a3 logo.jpeg");
        JOptionPane.showMessageDialog(rootPane, "CRIADORES:\n"
       
                + "David Camargo Hech\n"
                + "Gabriel Martins Meira\n"
                + "Leonardo Schmitt Kreuch\n"
                + "Leonardo Sousa Vargas\n"
                + "Mateus Almeida Santos\n","CRÉDITOS",0,x);     
     
    }//GEN-LAST:event_JCreditosActionPerformed

    private void JSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSairActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_JSairActionPerformed

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
    private javax.swing.JMenuItem JCreditos;
    private javax.swing.JMenuItem JMenuCadFerramenta;
    private javax.swing.JMenuItem JMenuCadastroAmigo;
    private javax.swing.JMenuItem JMenuDadosFerramenta;
    private javax.swing.JMenuItem JSair;
    private javax.swing.JMenu MenuAcoes;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jRelatorioEmprestimosAtivos;
    // End of variables declaration//GEN-END:variables
}
