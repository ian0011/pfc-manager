package view;

import dal.AlunoDAL;
import dal.DocenteDAL;
import dal.EquipeDAL;
import java.util.List;
import model.Aluno;
import model.Docente;
import model.Equipe;

public class TelaCadastroEquipe extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroEquipe
     */
    public TelaCadastroEquipe() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonCadastrarEquipe = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxAluno3 = new javax.swing.JComboBox<>();
        jComboBoxGestor = new javax.swing.JComboBox<>();
        jComboBoxAluno1 = new javax.swing.JComboBox<>();
        jComboBoxAluno2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxGpe = new javax.swing.JComboBox<>();
        jComboBoxOrientador = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(520, 580));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 560));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 560));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(680, 540));
        jPanel2.setPreferredSize(new java.awt.Dimension(680, 540));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Nova Equipe");
        jLabel1.setMaximumSize(new java.awt.Dimension(150, 32));
        jLabel1.setMinimumSize(new java.awt.Dimension(150, 32));
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 32));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Gestor do projeto:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Aluno 1:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Aluno 2:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jPanel3.setMinimumSize(new java.awt.Dimension(657, 57));
        jPanel3.setPreferredSize(new java.awt.Dimension(657, 57));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCadastrarEquipe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCadastrarEquipe.setForeground(new java.awt.Color(0, 51, 102));
        jButtonCadastrarEquipe.setText("Cadastrar");
        jButtonCadastrarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCadastrar(evt);
            }
        });
        jPanel3.add(jButtonCadastrarEquipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 120, -1));

        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(0, 51, 102));
        jButtonCancelar.setLabel("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCancelar(evt);
            }
        });
        jPanel3.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 120, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 480, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_close_1814098.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5jLabelCloseMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("GPE:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jComboBoxAluno3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxAluno3.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.add(jComboBoxAluno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 300, 30));

        jComboBoxGestor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxGestor.setForeground(new java.awt.Color(0, 51, 102));
        jComboBoxGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGestorActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxGestor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 300, 30));

        jComboBoxAluno1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxAluno1.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.add(jComboBoxAluno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 300, 30));

        jComboBoxAluno2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxAluno2.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.add(jComboBoxAluno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 300, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Aluno 3:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Orientador Técnico:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jComboBoxGpe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxGpe.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.add(jComboBoxGpe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 300, 30));

        jComboBoxOrientador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxOrientador.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.add(jComboBoxOrientador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 300, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 480, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5jLabelCloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel5jLabelCloseMouseClicked

    private void JButtonCadastrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCadastrar
        EquipeDAL equipeDAL = new EquipeDAL();
        
        Equipe equipe = new Equipe();

        equipe.setGestor((Aluno) jComboBoxGestor.getSelectedItem());
        equipe.setAluno1((Aluno) jComboBoxAluno1.getSelectedItem());
        equipe.setAluno2((Aluno) jComboBoxAluno2.getSelectedItem());
        equipe.setAluno3((Aluno) jComboBoxAluno3.getSelectedItem());
        equipe.setOrientador( (Docente)jComboBoxOrientador.getSelectedItem());
        equipe.setGpe((Docente)jComboBoxGpe.getSelectedItem());
        
        equipeDAL.save(equipe);

    }//GEN-LAST:event_JButtonCadastrar

    private void JButtonCancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCancelar
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JButtonCancelar

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        AlunoDAL alunoDal = new AlunoDAL();
        DocenteDAL docenteDal = new DocenteDAL();
        
        List<Aluno> alunos = alunoDal.findAll();
        List<Docente> docentes = docenteDal.findAll();

        for (Aluno a : alunos) {
            jComboBoxGestor.addItem(a);
        }

        for (Aluno a : alunos) {
            jComboBoxAluno1.addItem(a);
        }
        for (Aluno a : alunos) {
            jComboBoxAluno2.addItem(a);
        }

        for (Aluno a : alunos) {
            jComboBoxAluno3.addItem(a);
        }

        for (Docente d : docentes) {
            jComboBoxOrientador.addItem(d);
        }

        for (Docente d : docentes) {
            jComboBoxGpe.addItem(d);
        }


    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGestorActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBoxGestorActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroEquipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarEquipe;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<Object> jComboBoxAluno1;
    private javax.swing.JComboBox<Object> jComboBoxAluno2;
    private javax.swing.JComboBox<Object> jComboBoxAluno3;
    private javax.swing.JComboBox<Object> jComboBoxGestor;
    private javax.swing.JComboBox<Object> jComboBoxGpe;
    private javax.swing.JComboBox<Object> jComboBoxOrientador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
