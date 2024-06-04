package visao;

import javax.swing.JOptionPane;
import model.Amigo;

public class FrmCadastroAmigosFrame extends javax.swing.JFrame {
    private Amigo objetoAmigo;
    
    public FrmCadastroAmigosFrame() {
        initComponents();
        this.objetoAmigo = new Amigo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBCancelar = new javax.swing.JButton();
        JBCadastrar = new javax.swing.JButton();
        NomeText = new javax.swing.JLabel();
        JTFnomeInput = new javax.swing.JTextField();
        Telefone = new javax.swing.JLabel();
        JTFtelefoneInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Cadastro para Amigos"); // NOI18N

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

        NomeText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NomeText.setText("Nome:");

        JTFnomeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFnomeInputActionPerformed(evt);
            }
        });

        Telefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Telefone.setText("Telefone:");

        JTFtelefoneInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFtelefoneInputActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("CADASTRAR NOVO AMIGO");

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
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFtelefoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Telefone)
                    .addComponent(JTFnomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeText)
                    .addComponent(jLabel2))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(NomeText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFnomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Telefone)
                .addGap(12, 12, 12)
                .addComponent(JTFtelefoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
       try{
            String nome = "";
            int telefone = 0;
            
            if(this.JTFnomeInput.getText().length() <= 2){
                throw new Mensagem("O nome deve ter mais de 2 caracteres!");
            }else{
                nome = this.JTFnomeInput.getText();
            }
            
            if(this.JTFtelefoneInput.getText().length() < 8){
                throw new Mensagem("Seu telefone deve ter mais de 7 número");
            }else{
                telefone = Integer.parseInt(this.JTFtelefoneInput.getText());
            }
            
      
           if(this.objetoAmigo.insertAmigoDb(nome,telefone)){
               JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!" , "Cadastro realizado com sucesso!" , JOptionPane.INFORMATION_MESSAGE);
               
               this.JTFnomeInput.setText("");
               this.JTFtelefoneInput.setText("");
            
           }
           
            System.out.println(this.objetoAmigo.getListaAmigo().toString());
            
        }catch(Mensagem erro){
            
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
                                               
    }//GEN-LAST:event_JBCadastrarActionPerformed

    private void JTFtelefoneInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFtelefoneInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFtelefoneInputActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_MenuSairActionPerformed

    private void JTFnomeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFnomeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnomeInputActionPerformed

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
    private javax.swing.JTextField JTFnomeInput;
    private javax.swing.JTextField JTFtelefoneInput;
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JLabel NomeText;
    private javax.swing.JLabel Telefone;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
