/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Amigo;
import model.Emprestimo;

/**
 *
 * @author almma
 */
public class FrmDadosEmprestimoAtivos extends javax.swing.JFrame {

    /**
     * Creates new form FrmDadosEmprestimoAtivos
     */
    private Emprestimo objetoEmprestimoAtivos;

    public FrmDadosEmprestimoAtivos() {
        initComponents();
        this.objetoEmprestimoAtivos = new Emprestimo();
        this.imprimirTabela();
        this.imprimirMaiorDevedor();
        this.imprimirTotalEmprestimos();

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
        jTotalEmprestimosTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaEmprestimo = new javax.swing.JTable();
        JBRecebido = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jMaiorDevedorTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("RELATÓRIO EMPRÉSTIMOS ATIVOS");

        jTotalEmprestimosTitulo.setText("Total empréstimos:");
        jTotalEmprestimosTitulo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTotalEmprestimosTituloAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
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
                "id", "Amigo", "idAmigo", "ferramenta", "idFerramenta", "Início"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
            jTabelaEmprestimo.getColumnModel().getColumn(0).setMaxWidth(20);
            jTabelaEmprestimo.getColumnModel().getColumn(1).setMaxWidth(50);
            jTabelaEmprestimo.getColumnModel().getColumn(5).setMaxWidth(60);
        }

        JBRecebido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JBRecebido.setText("Recebido");
        JBRecebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRecebidoActionPerformed(evt);
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

        jMaiorDevedorTitulo.setText("Maior devedor:");
        jMaiorDevedorTitulo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMaiorDevedorTituloAncestorAdded(evt);
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
                        .addComponent(JBRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMaiorDevedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTotalEmprestimosTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTotalEmprestimosTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMaiorDevedorTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBApagar)
                    .addComponent(JBRecebido)
                    .addComponent(JBCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(97, 97, 97))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabelaEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaEmprestimoMouseClicked


    }//GEN-LAST:event_jTabelaEmprestimoMouseClicked

    private void JBRecebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRecebidoActionPerformed
        if (this.jTabelaEmprestimo.getSelectedRow() != -1) {
            int id = Integer.parseInt(this.jTabelaEmprestimo.getValueAt(this.jTabelaEmprestimo.getSelectedRow(), 0).toString());

            if (this.objetoEmprestimoAtivos.updateEmprestimoAtivoBd(id, false)) {

                JOptionPane.showMessageDialog(rootPane, "Emprestimo concluído!", "Emprestimo concluído!" , JOptionPane.INFORMATION_MESSAGE);
                this.imprimirTabela();
                this.imprimirMaiorDevedor();
                this.imprimirTotalEmprestimos();

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um emprestimo na tabela!" , "Selecione um emprestimo na tabela!" , JOptionPane.QUESTION_MESSAGE);

        }
    }

    public void imprimirTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTabelaEmprestimo.getModel();
        modelo.setNumRows(0); //Posiciona na primeira linha da tabela
        ArrayList<Emprestimo> minhalista = this.objetoEmprestimoAtivos.getEmprestimoQuery(true);

        for (Emprestimo e : minhalista) {

            modelo.addRow(new Object[]{
                e.getId(),
                e.getNomeAmigo(),
                e.getAmigoId(),
                e.getNomeFerramenta(),
                e.getFerramentaId(),
                e.getDataInicio()});

        }

    }//GEN-LAST:event_JBRecebidoActionPerformed

    private void imprimirTotalEmprestimos() {
        ArrayList<Emprestimo> EmprestimoLista = new Emprestimo().getEmprestimoQuery(true);

        int totalEmprestimos = EmprestimoLista.size();

        jTotalEmprestimosTitulo.setText("Total: " + totalEmprestimos + " empréstimos");
    }

    private void imprimirMaiorDevedor() {
        int emprestimosNumero = 0;
        int idMaiorDevedor = 0;
        ArrayList<Amigo> AmigoLista = new Amigo().getListaAmigo();
        ArrayList<Emprestimo> EmprestimoLista = new Emprestimo().getEmprestimoQuery(true);
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
            jMaiorDevedorTitulo.setText("Maior devedor: " + nomeMaiorDevedor + " (" + emprestimosNumero + " empréstimos ativos)");
        }

    }

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void jTotalEmprestimosTituloAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTotalEmprestimosTituloAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotalEmprestimosTituloAncestorAdded

    private void jMaiorDevedorTituloAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMaiorDevedorTituloAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMaiorDevedorTituloAncestorAdded

    private void jTabelaEmprestimoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTabelaEmprestimoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabelaEmprestimoAncestorAdded

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        try {
            if (this.jTabelaEmprestimo.getSelectedRow() != -1) {
                int id = Integer.parseInt(this.jTabelaEmprestimo.getValueAt(this.jTabelaEmprestimo.getSelectedRow(), 0).toString());

                if (this.objetoEmprestimoAtivos.deleteEmprestimoDb(id)) {

                    JOptionPane.showMessageDialog(rootPane, "Empréstimo removido!" , "Empréstimo removido!" , JOptionPane.INFORMATION_MESSAGE);

                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Selecione um emprestimo na tabela!" , "Selecione um emprestimo na tabela!" , JOptionPane.QUESTION_MESSAGE);
                throw new Mensagem("Selecione um emprestimo na tabela!");
            }

        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        } finally {
            this.imprimirTabela();
            this.imprimirMaiorDevedor();
            this.imprimirTotalEmprestimos();

        }
    }//GEN-LAST:event_JBApagarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDadosEmprestimoAtivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDadosEmprestimoAtivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDadosEmprestimoAtivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDadosEmprestimoAtivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDadosEmprestimoAtivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBRecebido;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jMaiorDevedorTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaEmprestimo;
    private javax.swing.JLabel jTotalEmprestimosTitulo;
    // End of variables declaration//GEN-END:variables
}
