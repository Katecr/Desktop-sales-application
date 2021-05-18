package formularios;

public class frmPrimary extends javax.swing.JFrame {

    /**
     * Creates new form frmPrimary
     */
    public frmPrimary() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnDestok = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuFileClients = new javax.swing.JMenuItem();
        mnuFileProducts = new javax.swing.JMenuItem();
        mnuFileUsers = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuFileChangePass = new javax.swing.JMenuItem();
        mnuFileChangeUser = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuFileExit = new javax.swing.JMenuItem();
        mnuMovements = new javax.swing.JMenu();
        mnuMovementsNewInvoice = new javax.swing.JMenuItem();
        mnuMovementsReportInvoice = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mnuHelpAbout = new javax.swing.JMenuItem();
        mnuHelpHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Facturación");

        dpnDestok.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout dpnDestokLayout = new javax.swing.GroupLayout(dpnDestok);
        dpnDestok.setLayout(dpnDestokLayout);
        dpnDestokLayout.setHorizontalGroup(
            dpnDestokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );
        dpnDestokLayout.setVerticalGroup(
            dpnDestokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        mnuFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/File.png"))); // NOI18N
        mnuFile.setText("Archivo");

        mnuFileClients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clients.png"))); // NOI18N
        mnuFileClients.setText("Clientes");
        mnuFileClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFileClientsActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFileClients);

        mnuFileProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/products.png"))); // NOI18N
        mnuFileProducts.setText("Productos");
        mnuFile.add(mnuFileProducts);

        mnuFileUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users.png"))); // NOI18N
        mnuFileUsers.setText("Usuarios");
        mnuFileUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFileUsersActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFileUsers);
        mnuFile.add(jSeparator1);

        mnuFileChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png"))); // NOI18N
        mnuFileChangePass.setText("Cambio clave");
        mnuFile.add(mnuFileChangePass);

        mnuFileChangeUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-change.png"))); // NOI18N
        mnuFileChangeUser.setText("Cambio Usuario");
        mnuFile.add(mnuFileChangeUser);
        mnuFile.add(jSeparator2);

        mnuFileExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        mnuFileExit.setText("Salir");
        mnuFileExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFileExitActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFileExit);

        jMenuBar1.add(mnuFile);

        mnuMovements.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invoice.png"))); // NOI18N
        mnuMovements.setText("Movimientos");

        mnuMovementsNewInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newInvoice.png"))); // NOI18N
        mnuMovementsNewInvoice.setText("Nueva Factura");
        mnuMovements.add(mnuMovementsNewInvoice);

        mnuMovementsReportInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reportInvoice.png"))); // NOI18N
        mnuMovementsReportInvoice.setText("Reportes Factura");
        mnuMovements.add(mnuMovementsReportInvoice);

        jMenuBar1.add(mnuMovements);

        mnuHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        mnuHelp.setText("Ayuda");

        mnuHelpAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about.png"))); // NOI18N
        mnuHelpAbout.setText("Acerca de");
        mnuHelpAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHelpAboutActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuHelpAbout);

        mnuHelpHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help-help.png"))); // NOI18N
        mnuHelpHelp.setText("Ayuda");
        mnuHelpHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHelpHelpActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuHelpHelp);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDestok)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDestok)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void mnuFileClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFileClientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuFileClientsActionPerformed

    private void mnuHelpHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHelpHelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuHelpHelpActionPerformed

    private void mnuHelpAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHelpAboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuHelpAboutActionPerformed

    private void mnuFileUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFileUsersActionPerformed
        frmUsers myUsers = new frmUsers();
        dpnDestok.add(myUsers);
        myUsers.show();
    }//GEN-LAST:event_mnuFileUsersActionPerformed

    private void mnuFileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFileExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuFileExitActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrimary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrimary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrimary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrimary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrimary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnDestok;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuFileChangePass;
    private javax.swing.JMenuItem mnuFileChangeUser;
    private javax.swing.JMenuItem mnuFileClients;
    private javax.swing.JMenuItem mnuFileExit;
    private javax.swing.JMenuItem mnuFileProducts;
    private javax.swing.JMenuItem mnuFileUsers;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenuItem mnuHelpAbout;
    private javax.swing.JMenuItem mnuHelpHelp;
    private javax.swing.JMenu mnuMovements;
    private javax.swing.JMenuItem mnuMovementsNewInvoice;
    private javax.swing.JMenuItem mnuMovementsReportInvoice;
    // End of variables declaration//GEN-END:variables
}