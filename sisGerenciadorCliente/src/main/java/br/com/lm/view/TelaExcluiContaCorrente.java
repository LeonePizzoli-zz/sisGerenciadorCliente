/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lm.view;

import br.com.lm.controller.ControladorAgencia;
import br.com.lm.controller.ControladorCliente;
import br.com.lm.controller.ControladorContaCorrente;
import br.com.lm.model.Agencia;
import br.com.lm.model.Cliente;
import br.com.lm.model.ContaCorrente;
import br.com.lm.utilitarios.Mensagem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author leone.pizzoli
 */
public class TelaExcluiContaCorrente extends javax.swing.JFrame {

    /**
     * Creates new form TelaExcluiContaCorrente
     */
    public TelaExcluiContaCorrente() {
        super("Excluir Conta Corrente");
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

        jlaConta = new javax.swing.JLabel();
        jtfConta = new javax.swing.JTextField();
        jbuExcluir = new javax.swing.JButton();
        jbuSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlaConta.setText("N° Conta:");

        jtfConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfContaActionPerformed(evt);
            }
        });

        jbuExcluir.setText("Excluir");
        jbuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuExcluirActionPerformed(evt);
            }
        });

        jbuSair.setText("Sair");
        jbuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbuSair, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbuExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfConta, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuSair)
                    .addComponent(jbuExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ContaCorrente conta;
    ControladorContaCorrente ctrlConta;
    Agencia agencia;
    ControladorAgencia ctrlAgen;
    Cliente cliente;
    ControladorCliente ctrlCli;
    
    public void preencherObjetos() {
        conta = new ContaCorrente();
        ctrlConta = new ControladorContaCorrente();
        
        agencia = new Agencia();
        ctrlAgen = new ControladorAgencia();
        
        cliente = new Cliente();
        ctrlCli = new ControladorCliente();
        
        conta.setNroContaCorrente(Long.parseLong(jtfConta.getText()));
        conta.setAgencia(ctrlConta.pesquisarEspecifico(conta).getAgencia());
        conta.setCliente(ctrlConta.pesquisarEspecifico(conta).getCliente());
       
    }
    private void jbuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbuSairActionPerformed

    private void jtfContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfContaActionPerformed
        jtfConta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherObjetos();
            }
        });
    }//GEN-LAST:event_jtfContaActionPerformed

    private void jbuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuExcluirActionPerformed
        try {
            preencherObjetos();
            if (conta.getNroContaCorrente() != null) {
                ctrlConta.excluir(conta);
                Mensagem.showMsg("Conta excluída com sucesso!");
            } else {
                Mensagem.showMsg("Não foi possível excluir a conta!");
            }
        } catch (Exception e) {
            throw e;
        }
    }//GEN-LAST:event_jbuExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaExcluiContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExcluiContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExcluiContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExcluiContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaExcluiContaCorrente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbuExcluir;
    private javax.swing.JButton jbuSair;
    private javax.swing.JLabel jlaConta;
    private javax.swing.JTextField jtfConta;
    // End of variables declaration//GEN-END:variables
}