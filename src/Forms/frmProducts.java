package Forms;

import classes.Data;
import classes.Product;
import classes.Utilities;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmProducts extends javax.swing.JInternalFrame {

    private Data myData;
    private int productCurrent = 0;
    private boolean newAdd = false;
    private DefaultTableModel myTable;

    public void setData(Data myData) {
        this.myData = myData;
    }

    public frmProducts() {
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

        jLabel1 = new javax.swing.JLabel();
        txtIdProducts = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnFirst = new javax.swing.JButton();
        btnLatest = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txObligatory = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtObligatory2 = new javax.swing.JLabel();
        txtObligatory3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTableProducts = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        cmbIVA = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Productos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("ID Producto:");

        txtIdProducts.setEnabled(false);

        jLabel2.setText("Descripci??n:");

        txtDescription.setEnabled(false);
        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });

        jLabel3.setText("Precio:");

        txtPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrice.setToolTipText("");
        txtPrice.setEnabled(false);

        jLabel4.setText("Nota");

        jLabel5.setText("IVA:");

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btnFirst.setToolTipText("Va al primer registro");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLatest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/previus.png"))); // NOI18N
        btnLatest.setToolTipText("Va al ultimo registro");
        btnLatest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLatestActionPerformed(evt);
            }
        });

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        btnNext.setToolTipText("Adelante");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/end.png"))); // NOI18N
        btnLast.setToolTipText("Atr??s");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnSearch.setToolTipText("Buscar registros");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnSave.setToolTipText("Guardar registro");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEdit.setToolTipText("Modificar el registro actual");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnNew.setToolTipText("Crear nuevo registro");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnDeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnDeleteProduct.setToolTipText("Eliminar registro actual");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelUser.png"))); // NOI18N
        btnCancel.setToolTipText("Cancelar la operaci??n");
        btnCancel.setEnabled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txObligatory.setForeground(new java.awt.Color(255, 51, 51));
        txObligatory.setText("* Campos obligatorios");

        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("*");

        txtObligatory2.setForeground(new java.awt.Color(255, 51, 51));
        txtObligatory2.setText("*");

        txtObligatory3.setForeground(new java.awt.Color(255, 51, 51));
        txtObligatory3.setText("*");

        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("*");

        tblTableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTableProducts);

        txtNote.setColumns(20);
        txtNote.setRows(5);
        txtNote.setEnabled(false);
        jScrollPane2.setViewportView(txtNote);

        cmbIVA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un valor de IVA", "0%", "10%", "19%" }));
        cmbIVA.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLatest, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(111, 111, 111)
                            .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addComponent(txObligatory))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtIdProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtObligatory3)
                                        .addComponent(txtObligatory2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(65, 65, 65)
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtDescription)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(txtIdProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtObligatory3)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtObligatory2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(cmbIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(txObligatory)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFirst)
                    .addComponent(btnLatest)
                    .addComponent(btnNext)
                    .addComponent(btnLast)
                    .addComponent(btnNew)
                    .addComponent(btnSearch)
                    .addComponent(btnSave)
                    .addComponent(btnEdit)
                    .addComponent(btnDeleteProduct)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void btnLatestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLatestActionPerformed
        productCurrent = myData.numberProducts() - 1;
        showRegister();
    }//GEN-LAST:event_btnLatestActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        productCurrent = 0;
        showRegister();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        productCurrent++;
        if (productCurrent == myData.numberProducts()) {
            productCurrent = 0;
        }
        showRegister();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        productCurrent--;
        if (productCurrent == -1) {
            productCurrent = myData.numberProducts() - 1;
        }
        showRegister();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String product = JOptionPane.showInputDialog("Ingrese c??digo del producto");
        if(product.equals("")){
            return;
        }
        int position = myData.productPosition(product);
        if(position == -1){
            JOptionPane.showMessageDialog(rootPane, "Producto no existe");
            return;
        }
        productCurrent = position;
        showRegister();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        //Validate Data
        if (txtIdProducts.getText().equals("")) {
            JOptionPane.showInternalMessageDialog(rootPane, "Debe digitar un ID.");
            txtIdProducts.requestFocusInWindow();
            return;
        }
        
        if (txtDescription.getText().equals("")) {
            JOptionPane.showInternalMessageDialog(rootPane, "Debe digitar una descripci??n.");
            txtDescription.requestFocusInWindow();
            return;
        }
        if (txtPrice.getText().equals("")) {
            JOptionPane.showInternalMessageDialog(rootPane, "Debe digitar un precio.");
            txtPrice.requestFocusInWindow();
            return;
        }
        if (!Utilities.isNumeric(txtPrice.getText())) {
            JOptionPane.showInternalMessageDialog(rootPane, "Debe digitar un valor numerico.");
            txtPrice.requestFocusInWindow();
            return;
        } 
        
        int price = Integer.parseInt(txtPrice.getText());
        
        if (price <= 0) {
            JOptionPane.showInternalMessageDialog(rootPane, "Debe digitar un valor mayor a 0.");
            txtPrice.requestFocusInWindow();
            return;
        } 
        
        if (cmbIVA.getSelectedIndex() == 0) {
            JOptionPane.showInternalMessageDialog(rootPane, "Debe seleccionar un IVA");
            cmbIVA.requestFocusInWindow();
            return;
        }

        //If it is new, we validate that the user does not exist
        int position = myData.productPosition(txtIdProducts.getText());

        if (newAdd) {
            if (position != -1) {
                JOptionPane.showInternalMessageDialog(rootPane, "Producto ya existe");
                txtIdProducts.requestFocusInWindow();
                return;
            }
        } else {
            if (position == -1) {
                JOptionPane.showInternalMessageDialog(rootPane, "Producto creado");
                txtIdProducts.requestFocusInWindow();
                return;
            }
        }

       //We create the product object and add it to data
        Product myProduct = new Product(txtIdProducts.getText(), txtDescription.getText(), price,cmbIVA.getSelectedIndex(),txtNote.getText());
        String msg;
        if (newAdd) {
            msg = myData.addProduct(myProduct);
        } else {
            msg = myData.editProduct(myProduct, position);
        }

        JOptionPane.showMessageDialog(rootPane, msg);

        //Enable Buttons
        btnFirst.setEnabled(true);
        btnLast.setEnabled(true);
        btnNext.setEnabled(true);
        btnLatest.setEnabled(true);
        btnEdit.setEnabled(true);
        btnDeleteProduct.setEnabled(true);
        btnSearch.setEnabled(true);
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);

        //Disable Fields
        txtIdProducts.setEnabled(false);
        txtDescription.setEnabled(false);
        txtPrice.setEnabled(false);
        txtNote.setEnabled(false);
        cmbIVA.setEnabled(false);


        //Update table when changes are made
        fillTable();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        //Enable buttons
        btnFirst.setEnabled(false);
        btnLast.setEnabled(false);
        btnNext.setEnabled(false);
        btnLatest.setEnabled(false);
        btnEdit.setEnabled(false);
        btnDeleteProduct.setEnabled(false);
        btnSearch.setEnabled(false);
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);

        //Enable Fields
        txtIdProducts.setEnabled(false);
        txtDescription.setEnabled(true);
        txtPrice.setEnabled(true);
        txtNote.setEnabled(true);
        cmbIVA.setEnabled(true);

        //We activate the new register flag
        newAdd = false;

        //focus to ID field
        txtDescription.requestFocusInWindow();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        //Enable buttons
        btnFirst.setEnabled(false);
        btnLast.setEnabled(false);
        btnNext.setEnabled(false);
        btnLatest.setEnabled(false);
        btnEdit.setEnabled(false);
        btnDeleteProduct.setEnabled(false);
        btnSearch.setEnabled(false);
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);

        //Enable Fields
        txtIdProducts.setEnabled(true);
        txtDescription.setEnabled(true);
        txtPrice.setEnabled(true);
        txtNote.setEnabled(true);
        cmbIVA.setEnabled(true);

        //Clear Fields
        txtIdProducts.setText("");
        txtDescription.setText("");
        txtPrice.setText("");
        txtNote.setText("");
        cmbIVA.setSelectedIndex(0);

        //We activate the new register flag
        newAdd = true;

        //focus to ID field
        txtIdProducts.requestFocusInWindow();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        int position = myData.productPosition(txtIdProducts.getText());
        int answer = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de borrar el registro");
        if (answer != 0) {
            return;
        }
        String msg;
        msg = myData.deleteProduct(position);
        JOptionPane.showMessageDialog(rootPane, msg);
        productCurrent = 0;
        showRegister();

        //Update table when changes are made
        fillTable();
    }//GEN-LAST:event_btnDeleteProductActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        //Enable Buttons
        btnFirst.setEnabled(true);
        btnLast.setEnabled(true);
        btnNext.setEnabled(true);
        btnLatest.setEnabled(true);
        btnEdit.setEnabled(true);
        btnDeleteProduct.setEnabled(true);
        btnSearch.setEnabled(true);
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);

        //Disable Fields
        txtIdProducts.setEnabled(false);
        txtDescription.setEnabled(false);
        txtPrice.setEnabled(false);
        txtNote.setEnabled(false);
        cmbIVA.setEnabled(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        showRegister();
        fillTable();
    }//GEN-LAST:event_formInternalFrameOpened

    private void showRegister() {
        txtIdProducts.setText(myData.getProducts()[productCurrent].getIdProduct());
        txtDescription.setText(myData.getProducts()[productCurrent].getDescription());
        txtPrice.setText("" + myData.getProducts()[productCurrent].getPrice());
        txtNote.setText(myData.getProducts()[productCurrent].getNote());
        cmbIVA.setSelectedIndex(myData.getProducts()[productCurrent].getIva());        
    }

    private void fillTable() {
        String titles[] = {"ID producto", "Descripci??n", "Precio", "IVA", "Nota"};
        String register[] = new String[5];
        myTable = new DefaultTableModel(null, titles);
        for (int i = 0; i < myData.numberProducts(); i++) {
            register[0] = myData.getProducts()[i].getIdProduct();
            register[1] = myData.getProducts()[i].getDescription();
            register[2] = "" + myData.getProducts()[i].getPrice();
            register[3] = iva(myData.getProducts()[i].getIva());
            register[4] = myData.getProducts()[i].getNote();
            myTable.addRow(register);
        }
        tblTableProducts.setModel(myTable);
    }

    private String iva(int idIVA) {
        switch(idIVA){
            case 0: return "seleccione un valor";
            case 1: return "0%";
            case 2: return "10%";
            case 3: return "19%";
            default: return "No definido";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnLatest;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbIVA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTableProducts;
    private javax.swing.JLabel txObligatory;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtIdProducts;
    private javax.swing.JTextArea txtNote;
    private javax.swing.JLabel txtObligatory2;
    private javax.swing.JLabel txtObligatory3;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
