package visao;

import javax.swing.JOptionPane;



public class FrmCadastroAmigosFrame extends javax.swing.JFrame {

    public FrmCadastroAmigosFrame() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBCancelar = new javax.swing.JButton();
        JBCadastrar = new javax.swing.JButton();
        NomeText = new javax.swing.JLabel();
        JTFnome = new javax.swing.JTextField();
        Telefone = new javax.swing.JLabel();
        JTFtelefone = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Cadastro para Amigos"); // NOI18N

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

        NomeText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NomeText.setText("Nome:");

        JTFnome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Telefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Telefone.setText("Telefone:");

        JTFtelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JTFtelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFtelefoneActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Telefone)
                    .addComponent(JTFtelefone)
                    .addComponent(NomeText)
                    .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NomeText)
                        .addGap(18, 18, 18)
                        .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Telefone)
                        .addGap(18, 18, 18)
                        .addComponent(JTFtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        try{
            String nome = "";
            String telefone = "";
            
            if(this.JTFnome.getText().length() <= 2){
                throw new Mensagem("O nome deve ter mais de 2 caracteres!");
            }else{
                nome = this.JTFnome.getText();
            }
            
            if(this.JTFtelefone.getText().length() < 8){
                throw new Mensagem("Seu telefone deve ter mais de 7 número");
            }else{
                telefone = this.JTFtelefone.getText();
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
        }
    }//GEN-LAST:event_JBCadastrarActionPerformed

    private void JTFtelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFtelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFtelefoneActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(FrmCadastroAmigosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroAmigosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroAmigosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroAmigosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroAmigosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JTextField JTFnome;
    private javax.swing.JTextField JTFtelefone;
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JLabel NomeText;
    private javax.swing.JLabel Telefone;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
