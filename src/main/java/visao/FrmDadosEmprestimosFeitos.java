package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Amigo;
import model.Emprestimo;

public class FrmDadosEmprestimosFeitos extends javax.swing.JFrame {

    private Emprestimo objetoEmprestimoFeito;

    public FrmDadosEmprestimosFeitos() {
        initComponents();
        this.objetoEmprestimoFeito = new Emprestimo();
        this.imprimirTabela();
        this.imprimirTotalEmprestimos();
        this.imprimirMaiorDevedor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTotalEmprestimosRealizadosTitulo = new javax.swing.JLabel();
        JBApagar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaEmprestimo = new javax.swing.JTable();
        jMaiorDevedorRealizadoTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("RELATÓRIO EMPRÉSTIMOS REALIZADOS");

        jTotalEmprestimosRealizadosTitulo.setText("Total empréstimos:");
        jTotalEmprestimosRealizadosTitulo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTotalEmprestimosRealizadosTituloAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        JBApagar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JBApagar.setText("apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        JBCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JBCancelar.setText("cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        jTabelaEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "amigo", "Telefone Amigo", "ferramenta", "data inicial", "Data final", "Tempo de emprestimo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTabelaEmprestimo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTabelaEmprestimoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTabelaEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaEmprestimoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelaEmprestimo);
        if (jTabelaEmprestimo.getColumnModel().getColumnCount() > 0) {
            jTabelaEmprestimo.getColumnModel().getColumn(3).setMaxWidth(80);
            jTabelaEmprestimo.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        jMaiorDevedorRealizadoTitulo.setText("Maior devedor:");
        jMaiorDevedorRealizadoTitulo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMaiorDevedorRealizadoTituloAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jMaiorDevedorRealizadoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(278, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTotalEmprestimosRealizadosTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JBApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(102, 102, 102)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jTotalEmprestimosRealizadosTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jMaiorDevedorRealizadoTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBApagar)
                    .addComponent(JBCancelar))
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTotalEmprestimosRealizadosTituloAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTotalEmprestimosRealizadosTituloAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotalEmprestimosRealizadosTituloAncestorAdded

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        try {
            if (this.jTabelaEmprestimo.getSelectedRow() != -1) {
                int id = Integer.parseInt(this.jTabelaEmprestimo.getValueAt(this.jTabelaEmprestimo.getSelectedRow(), 0).toString());

                if (this.objetoEmprestimoFeito.deleteEmprestimoDb(id)) {

                    JOptionPane.showMessageDialog(rootPane, "Empréstimo removido!");

                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Selecione um emprestimo na tabela!");
                throw new Mensagem("Selecione um emprestimo na tabela!");
            }

        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        } finally {
            this.imprimirTabela();
            this.imprimirTotalEmprestimos();
            this.imprimirMaiorDevedor();

        }
    }

    private void imprimirTotalEmprestimos() {
        ArrayList<Emprestimo> EmprestimoLista = new Emprestimo().getEmprestimoQuery(false);

        int totalEmprestimos = EmprestimoLista.size();

        jTotalEmprestimosRealizadosTitulo.setText("Total: " + totalEmprestimos + " empréstimos realizados");
    }

    private void imprimirMaiorDevedor() {
        int emprestimosNumero = 0;
        int idMaiorDevedor = 0;
        ArrayList<Amigo> AmigoLista = new Amigo().getListaAmigo();
        ArrayList<Emprestimo> EmprestimoLista = new Emprestimo().getEmprestimoQuery(false);
        int counter = 0;
        String nomeMaiorDevedor = "";

        // pegar Amigo com maior número de empréstimos
        for (Amigo amigo : AmigoLista) {
            int idToSearch = amigo.getId();
            for (Emprestimo emprestimo : EmprestimoLista) {
                if (emprestimo.getAmigoId() == idToSearch) {
                    counter++;

                    if (counter > emprestimosNumero) {
                        emprestimosNumero = counter;
                        idMaiorDevedor = emprestimo.getAmigoId();
                        nomeMaiorDevedor = emprestimo.getNomeAmigo();
                    }
                }
            }

            counter = 0;
        }

        if (emprestimosNumero > 0) {
            jMaiorDevedorRealizadoTitulo.setText("Maior devedor: " + nomeMaiorDevedor + " (" + emprestimosNumero + " empréstimos realizados)");
        }

    }

    public void imprimirTabela() {
        DefaultTableModel modeloTabela = (DefaultTableModel) this.jTabelaEmprestimo.getModel();
        modeloTabela.setNumRows(0); //Posiciona na primeira linha da tabela
        ArrayList<Emprestimo> listaEmprestimos = this.objetoEmprestimoFeito.getEmprestimoQuery(false);

        for (Emprestimo e : listaEmprestimos) {
            modeloTabela.addRow(new Object[]{
                e.getId(),
                e.getAmigoId(),
                e.getNomeAmigo(),
                e.getNomeFerramenta(),
                e.getFerramentaId(),});
        }


    }//GEN-LAST:event_JBApagarActionPerformed

    private void jTabelaEmprestimoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTabelaEmprestimoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabelaEmprestimoAncestorAdded

    private void jTabelaEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaEmprestimoMouseClicked

    }//GEN-LAST:event_jTabelaEmprestimoMouseClicked

    private void jMaiorDevedorRealizadoTituloAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMaiorDevedorRealizadoTituloAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMaiorDevedorRealizadoTituloAncestorAdded

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
            java.util.logging.Logger.getLogger(FrmDadosEmprestimosFeitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDadosEmprestimosFeitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDadosEmprestimosFeitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDadosEmprestimosFeitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDadosEmprestimosFeitos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jMaiorDevedorRealizadoTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaEmprestimo;
    private javax.swing.JLabel jTotalEmprestimosRealizadosTitulo;
    // End of variables declaration//GEN-END:variables
}
