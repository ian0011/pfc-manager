/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dal.ProjetoDAL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Projeto;

/**
 *
 * @author rpmen
 */
public class TelaCadastroProjeto extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroProjeto
     */
    public TelaCadastroProjeto() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxRisco = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldRetornoFin = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxTipoProjeto = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxNegocio = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxTipoProjetoEmpresa = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxMacrotema = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Nível de Risco:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        jComboBoxRisco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxRisco.setForeground(new java.awt.Color(0, 51, 102));
        jComboBoxRisco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alto", "Médio", "Baixo" }));
        jPanel1.add(jComboBoxRisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Retorno Financeiro:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jTextFieldRetornoFin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldRetornoFin.setForeground(new java.awt.Color(0, 51, 102));
        jTextFieldRetornoFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRetornoFinActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldRetornoFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 300, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 51, 102));
        jLabel26.setText("Novo Projeto");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTextFieldCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldCliente.setForeground(new java.awt.Color(0, 51, 102));
        jPanel1.add(jTextFieldCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 300, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Tipo de Projeto:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jComboBoxTipoProjeto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxTipoProjeto.setForeground(new java.awt.Color(0, 51, 102));
        jComboBoxTipoProjeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Interno", "Externo" }));
        jPanel1.add(jComboBoxTipoProjeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 300, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setText("Tipo de Negócio:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        jComboBoxNegocio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxNegocio.setForeground(new java.awt.Color(0, 51, 102));
        jComboBoxNegocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escola Técnica", "Serviços Técnicos", "Centro Universitário", "P&D&I", "Comércio", "Indústria", "Social", "CIMATEC", "CIMATEC PARK" }));
        jPanel1.add(jComboBoxNegocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 300, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 102));
        jLabel15.setText("Tipo do Projeto Empresa:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        jComboBoxTipoProjetoEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxTipoProjetoEmpresa.setForeground(new java.awt.Color(0, 51, 102));
        jComboBoxTipoProjetoEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesquisa", "Projeto", "Desenvolvimento de Produto", "Processo" }));
        jPanel1.add(jComboBoxTipoProjetoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 300, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 102));
        jLabel16.setText("Macrotema:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jComboBoxMacrotema.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxMacrotema.setForeground(new java.awt.Color(0, 51, 102));
        jComboBoxMacrotema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sustentabilidade", "Inovação de produto", "Inovação de processo", "Otimização de Processo", "Atualização tecnológica", "Responsabilidade Social", "Construção de protótipos", "Desenvolvimento de ferramentas", "Plantas e modelagens", "Manutenção" }));
        jPanel1.add(jComboBoxMacrotema, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 300, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 51, 102));
        jLabel27.setText("Cliente:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_close_1814098.png"))); // NOI18N
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(0, 51, 102));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 20, 120, -1));

        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(0, 51, 102));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 120, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 680, 70));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 680, 540));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRetornoFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRetornoFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRetornoFinActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        // TODO add your handling code here:
        try {
            Projeto p = new Projeto();

            p.setCliente(jTextFieldCliente.getText());
            p.setTipoProjeto(jComboBoxTipoProjeto.getSelectedItem().toString());
            p.setTipoEmpresa(jComboBoxTipoProjetoEmpresa.getSelectedItem().toString());
            p.setTipoNegocio(jComboBoxNegocio.getSelectedItem().toString());
            p.setMacrotema(jComboBoxMacrotema.getSelectedItem().toString());
            p.setRiscoProjeto(jComboBoxRisco.getSelectedItem().toString());
            p.setRetornoFin(Double.parseDouble(jTextFieldRetornoFin.getText()));
            p.setStatus("pendente");

            ProjetoDAL pDAL = new ProjetoDAL();

            pDAL.inserir(p);

            JOptionPane.showMessageDialog(this, "Projeto cadastrado com sucesso!");

            this.dispose();

        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroProjeto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro 1: Não foi possível acessar o banco de dados.");
        }

    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabelCloseMouseClicked

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
            java.util.logging.Logger.getLogger(TelaCadastroProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxMacrotema;
    private javax.swing.JComboBox<String> jComboBoxNegocio;
    private javax.swing.JComboBox<String> jComboBoxRisco;
    private javax.swing.JComboBox<String> jComboBoxTipoProjeto;
    private javax.swing.JComboBox<String> jComboBoxTipoProjetoEmpresa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldRetornoFin;
    // End of variables declaration//GEN-END:variables
}
