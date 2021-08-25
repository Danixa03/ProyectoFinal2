package com.mycompany.proyectofinal2;


import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtusuario = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        Ingresar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\OneDrive\\Imágenes\\Saved Pictures\\fondo2 (1).jpeg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        txtusuario.setBackground(new java.awt.Color(204, 255, 255));
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtusuario);
        txtusuario.setBounds(230, 200, 140, 30);

        password.setBackground(new java.awt.Color(204, 255, 255));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(230, 300, 140, 30);

        Ingresar.setBackground(new java.awt.Color(0, 0, 0));
        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(Ingresar);
        Ingresar.setBounds(160, 410, 90, 23);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Salir");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(380, 410, 80, 23);

        jLabel3.setFont(new java.awt.Font("Euclid", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MAD STORE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, 30, 180, 40);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 130, 0, 61);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 200, 83, 62);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\OneDrive\\Imágenes\\Saved Pictures\\fondoinfouno.png")); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(920, 1280));
        jLabel5.setMinimumSize(new java.awt.Dimension(920, 1280));
        jLabel5.setPreferredSize(new java.awt.Dimension(920, 1280));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-90, -170, 820, 810);

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 140, 110, 50);

        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 140, 50, 60);

        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(130, 130, 40, 70);

        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(80, 130, 100, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        String usuario="mad";
        String contraseña="maddam33";
        String pass=new String (password.getPassword());
        if (txtusuario.getText().equals(usuario) && pass.equals(contraseña)) {
            MADTIENDA ingreso=new MADTIENDA();
            ingreso.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Error de contraseña o usuario");
        }
    }//GEN-LAST:event_IngresarActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
