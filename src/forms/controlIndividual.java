/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

/**
 *
 * @author Rant AA
 */
public class controlIndividual extends javax.swing.JFrame {

    /**
     * Creates new form controlIndividual
     */
    public controlIndividual() {
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
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txncuenta = new javax.swing.JTextField();
        txidclicuentas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txsaldo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbtipocuenta = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        fechaex = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbldir = new javax.swing.JLabel();
        lblnom = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblape = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(242, 203, 87));
        jButton5.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jButton6.setBackground(new java.awt.Color(242, 203, 87));
        jButton6.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jButton7.setBackground(new java.awt.Color(242, 203, 87));
        jButton7.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Buscar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton8.setBackground(new java.awt.Color(242, 203, 87));
        jButton8.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("Modificar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel10.setText("# Cuenta");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, -1));

        txncuenta.setBackground(new java.awt.Color(69, 169, 191));
        txncuenta.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        txncuenta.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txncuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 60, -1));

        txidclicuentas.setBackground(new java.awt.Color(69, 169, 191));
        txidclicuentas.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        txidclicuentas.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txidclicuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 60, -1));

        jLabel11.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel11.setText("ID Cliente");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, -1));

        jLabel12.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel12.setText("Tipo Cuenta");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, -1));

        txsaldo.setBackground(new java.awt.Color(69, 169, 191));
        txsaldo.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        txsaldo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txsaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 60, -1));

        jLabel14.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel14.setText("Saldo");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 40, -1));

        cbtipocuenta.setBackground(new java.awt.Color(69, 169, 191));
        cbtipocuenta.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        cbtipocuenta.setForeground(new java.awt.Color(0, 0, 0));
        cbtipocuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Ahorro", "Debito", "Credito" }));
        cbtipocuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipocuentaActionPerformed(evt);
            }
        });
        cbtipocuenta.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbtipocuentaPropertyChange(evt);
            }
        });
        jPanel1.add(cbtipocuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 100, -1));

        jLabel22.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel22.setText("Fecha Expedicion");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        fechaex.setBackground(new java.awt.Color(69, 169, 191));
        fechaex.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        fechaex.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(fechaex, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 90, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("ID ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Cliente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Apellidos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Direccion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        lbldir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbldir.setText("nom");
        jPanel1.add(lbldir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        lblnom.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblnom.setText("nom");
        jPanel1.add(lblnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        lblid.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblid.setText("nom");
        jPanel1.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        lblape.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblape.setText("nom");
        jPanel1.add(lblape, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 420, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      
    }//GEN-LAST:event_jButton8ActionPerformed

    private void cbtipocuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipocuentaActionPerformed
        int tc = cbtipocuenta.getSelectedIndex();
        if (tc == -1 || tc == 0) {
            // System.out.println("no es posible asdas");
        } else {
            System.out.println(tc);
            txncuenta.setText(txidclicuentas.getText() + "0" + String.valueOf(tc));

        }
    }//GEN-LAST:event_cbtipocuentaActionPerformed

    private void cbtipocuentaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbtipocuentaPropertyChange

    }//GEN-LAST:event_cbtipocuentaPropertyChange

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
            java.util.logging.Logger.getLogger(controlIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(controlIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(controlIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(controlIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new controlIndividual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbtipocuenta;
    private javax.swing.JTextField fechaex;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblape;
    private javax.swing.JLabel lbldir;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblnom;
    private javax.swing.JTextField txidclicuentas;
    private javax.swing.JTextField txncuenta;
    private javax.swing.JTextField txsaldo;
    // End of variables declaration//GEN-END:variables
}