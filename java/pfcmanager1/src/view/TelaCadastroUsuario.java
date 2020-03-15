/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dal.UsuarioDAL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author rpmen
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroUsuario
     */
    public TelaCadastroUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPasswordFieldConfirmarSenhaUsuario = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordFieldSenhaUsuario = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEmailUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNomeUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxPerfilUsuario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 127, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordFieldConfirmarSenhaUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordFieldConfirmarSenhaUsuario.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.add(jPasswordFieldConfirmarSenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 280, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Cofirme a senha:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jPasswordFieldSenhaUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordFieldSenhaUsuario.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.add(jPasswordFieldSenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 280, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Senha:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jTextFieldEmailUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldEmailUsuario.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.add(jTextFieldEmailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 280, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Email:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jTextFieldNomeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldNomeUsuario.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.add(jTextFieldNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 280, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Nome:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jComboBoxPerfilUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxPerfilUsuario.setForeground(new java.awt.Color(0, 51, 102));
        jComboBoxPerfilUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "GTA", "Visitante" }));
        jPanel2.add(jComboBoxPerfilUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 280, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Perfil:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Novo Usuário");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(0, 51, 102));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(0, 51, 102));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 340, 70));

        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_close_1814098.png"))); // NOI18N
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        // TODO add your handling code here:
        String senha = jPasswordFieldSenhaUsuario.getText();
        String confirmSenha = jPasswordFieldConfirmarSenhaUsuario.getText();
        
        if (senha.equals(confirmSenha)) {
            Usuario usuario = new Usuario();
            usuario.setNome(jTextFieldNomeUsuario.getText());
            usuario.setEmail(jTextFieldEmailUsuario.getText());
            usuario.setSenha(jPasswordFieldSenhaUsuario.getText());
            usuario.setPerfil(jComboBoxPerfilUsuario.getSelectedItem().toString());
            
            UsuarioDAL dal = new UsuarioDAL();            
            dal.save(usuario);
            JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Senhas diferentes!");
            System.out.println(jPasswordFieldSenhaUsuario.getText());
            System.out.println(jPasswordFieldConfirmarSenhaUsuario.getText());
        }


    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxPerfilUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenhaUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenhaUsuario;
    private javax.swing.JTextField jTextFieldEmailUsuario;
    private javax.swing.JTextField jTextFieldNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
