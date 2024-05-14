package visao;

import javax.swing.JOptionPane;
import model.Ferramenta;

public class FrmCadastroFerramentaFrame extends javax.swing.JFrame {
   
    Ferramenta ObjFerramenta = new Ferramenta();
    
    public FrmCadastroFerramentaFrame() {
        
        initComponents();
       
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Cadastro de Ferramentas"); // NOI18N

        NomeFerramentaText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NomeFerramentaText.setText("Nome da Ferramenta:");

        JTFNomeFerramenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        MarcaText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MarcaText.setText("Marca:");

        CustoAquisicaoText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CustoAquisicaoText.setText("Custo de aquisição:");

        JTFMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JTFMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFMarcaActionPerformed(evt);
            }
        });

        JTFCustoAquisição.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });

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
                        .addComponent(JTFCustoAquisição, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CustoAquisicaoText)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(MarcaText)
                                .addComponent(JTFMarca)
                                .addComponent(NomeFerramentaText)
                                .addComponent(JTFNomeFerramenta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(NomeFerramentaText)
                .addGap(18, 18, 18)
                .addComponent(JTFNomeFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MarcaText)
                        .addGap(18, 18, 18)
                        .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CustoAquisicaoText))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFCustoAquisição, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFMarcaActionPerformed

    }//GEN-LAST:event_JTFMarcaActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        try{
            String nomeferramenta = "";
            String marca = "";
            int custo = 0;
            
            if(this.JTFNomeFerramenta.getText().length() <= 2){
                throw new Mensagem("O nome deve ter mais de 2 caracteres!");
            }else{
                nomeferramenta = this.JTFNomeFerramenta.getText();
            }
            
            if(this.JTFMarca.getText().length() <= 1){
                throw new Mensagem("A marca deve ter mais de 1 caracteres!");
            }else{
                marca = this.JTFMarca.getText();
            }
            
            if(Integer.parseInt(this.JTFCustoAquisição.getText()) <= 0){
                throw new Mensagem("O valor de aquisição deve ser maior que 0!");
            }else{
                custo = Integer.parseInt(this.JTFCustoAquisição.getText());
            }
            
//          LINHA DE CÓDIGO PARA QUANDO FIZERMOS O ARRAYLIST! DESCOMENTAR DEPOIS 
//            if(this.ObjFerramenta.InserirDadosArray(nomeferramenta, marca, custo)){
//                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
//                
//                this.NomeFerramentaInput.setText("");
//                this.MarcaInput.setText("");
//                this.CustoAquisicaoInput.setText("");
//            }
//            
//            System.out.println(this.ObjFerramenta.getListaArray().toString());
            
        }catch(Mensagem erro){
            
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }catch(NumberFormatException erronumb){
            
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
