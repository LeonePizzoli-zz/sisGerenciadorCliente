/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lm.view;

import br.com.lm.controller.ControladorAgencia;
import br.com.lm.model.Agencia;
import br.com.lm.utilitarios.Mensagem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author leone.pizzoli
 */
public class TelaCadastraAgencia extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastraAgencia
     */
    public TelaCadastraAgencia() {
        super("Cadastrar Agencia");
        initComponents();
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlaAgencia = new javax.swing.JLabel();
        jtfNomeAgencia = new javax.swing.JTextField();
        jbuOk = new javax.swing.JButton();
        jbuCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlaAgencia.setText("Agencia:");

        jtfNomeAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeAgenciaActionPerformed(evt);
            }
        });

        jbuOk.setText("OK");
        jbuOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuOkActionPerformed(evt);
            }
        });

        jbuCancelar.setText("Cancelar");
        jbuCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuCancelarActionPerformed(evt);
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
                        .addGap(9, 9, 9)
                        .addComponent(jlaAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNomeAgencia))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbuCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(jbuOk, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNomeAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuOk)
                    .addComponent(jbuCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ControladorAgencia ctrlAgencia;
    Agencia agencia;
    public void preencherObjetos(){
        agencia = new Agencia();
        ctrlAgencia = new ControladorAgencia();
        
        agencia.setNome(jtfNomeAgencia.getText());
        
    }
    private void jbuCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuCancelarActionPerformed
           this.dispose();
    }//GEN-LAST:event_jbuCancelarActionPerformed

    private void jtfNomeAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeAgenciaActionPerformed
        jtfNomeAgencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherObjetos();
            }
        });
    }//GEN-LAST:event_jtfNomeAgenciaActionPerformed

    private void jbuOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuOkActionPerformed
        preencherObjetos();
        try{
            if(agencia != null){
            ctrlAgencia.incluir(agencia);
            Mensagem.showMsg("Incluída com sucesso! \nSeu ID é: "+ agencia.getCodigo());
            }else{
                Mensagem.showMsg("Não pode ser incluida");
            }
        }catch(Exception e){
            throw e;
        }
    }//GEN-LAST:event_jbuOkActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastraAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastraAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastraAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastraAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastraAgencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbuCancelar;
    private javax.swing.JButton jbuOk;
    private javax.swing.JLabel jlaAgencia;
    private javax.swing.JTextField jtfNomeAgencia;
    // End of variables declaration//GEN-END:variables
}