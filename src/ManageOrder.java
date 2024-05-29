
import Dao.ConnectionProvider;
import Dao.InventoryUtils;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import common.Openpdf;
import java.io.FileOutputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class ManageOrder extends javax.swing.JFrame {

    private int customerpk = 0;
    private int productpk = 0;
    private int finalTotalPrice = 0;
    private String orderId = "";

    public ManageOrder() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void clearProductFields() {
        productpk = 0;
        txtProductName.setText("");
        txtProductPrice.setText("");
        txtProductDescription.setText("");
        txtProductQuantity.setText("");
    }

    public String getUniqueId(String prefix) {
        return prefix + System.nanoTime();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCart = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        txtCustomerMobileNumber = new javax.swing.JTextField();
        txtCustomerEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtProductPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtProductDescription = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtProductQuantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblFinalTotalPrice = new javax.swing.JLabel();
        btnSaveOrderDetails = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Inter", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE ORDER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer List");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 83, -1, -1));

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Number", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustomer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 118, 405, 416));

        jLabel3.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product List");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, -1));

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Quantity", "Description", "Category ID", "Category Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableProduct);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 118, 492, 416));

        jLabel4.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cart");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1141, 83, -1, -1));

        tableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Quantity", "Price", "Description", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCartMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableCart);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(948, 118, 439, 416));

        jLabel5.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Selected Customer");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        jLabel6.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Selected Product");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, -1, -1));
        getContentPane().add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 340, 32));
        getContentPane().add(txtCustomerMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 340, 32));
        getContentPane().add(txtCustomerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, 340, 32));

        jLabel7.setFont(new java.awt.Font("Inter", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Product Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 120, -1));
        getContentPane().add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 620, 210, 30));

        jLabel8.setFont(new java.awt.Font("Inter", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Product Price");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 660, 110, -1));
        getContentPane().add(txtProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 680, 210, 30));

        jLabel9.setFont(new java.awt.Font("Inter", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Product Description");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 600, 150, -1));
        getContentPane().add(txtProductDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 620, 250, 30));

        jLabel10.setFont(new java.awt.Font("Inter", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Quantity");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 660, 80, -1));
        getContentPane().add(txtProductQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 680, 250, 30));

        jButton1.setBackground(new java.awt.Color(38, 70, 83));
        jButton1.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add to Cart");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 740, 480, 30));

        jLabel11.setFont(new java.awt.Font("Inter", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total Amount BDT:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 590, -1, -1));

        lblFinalTotalPrice.setFont(new java.awt.Font("Inter", 1, 30)); // NOI18N
        lblFinalTotalPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblFinalTotalPrice.setText("00000");
        getContentPane().add(lblFinalTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 590, -1, -1));

        btnSaveOrderDetails.setBackground(new java.awt.Color(38, 70, 83));
        btnSaveOrderDetails.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        btnSaveOrderDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveOrderDetails.setText("Save Order Details");
        btnSaveOrderDetails.setBorder(null);
        btnSaveOrderDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveOrderDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaveOrderDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 660, 333, 30));

        btnReset.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setBorder(null);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 703, 333, 30));

        btnClose.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        btnClose.setText("Close");
        btnClose.setBorder(null);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 746, 333, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1403, 144, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1116, 777, -1, -1));

        jLabel13.setBackground(new java.awt.Color(42, 157, 143));
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        txtCustomerName.setEditable(false);
        txtCustomerMobileNumber.setEditable(false);
        txtCustomerEmail.setEditable(false);

        txtProductName.setEditable(false);
        txtProductPrice.setEditable(false);
        txtProductDescription.setEditable(false);

        DefaultTableModel model = (DefaultTableModel) tableCustomer.getModel();
        DefaultTableModel productModel = (DefaultTableModel) tableProduct.getModel();

        try {
            Connection con = ConnectionProvider.getcon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from customer");
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("customer_pk"),
                    rs.getString("name"),
                    rs.getString("mobileNumber"),
                    rs.getString("email")
                });
            }

            rs = st.executeQuery("select *from product inner join category on product.category_fk = category.category_pk");
            while (rs.next()) {
                productModel.addRow(new Object[]{
                    rs.getString("product_pk"),
                    rs.getString("name"),
                    rs.getString("price"),
                    rs.getString("quantity"),
                    rs.getString("description"),
                    rs.getString("category_fk"),
                    rs.getString(8)
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        setVisible(false);
        new ManageOrder().setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void tableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseClicked
        int index = tableCustomer.getSelectedRow();
        TableModel model = tableCustomer.getModel();
        String id = model.getValueAt(index, 0).toString();
        customerpk = Integer.parseInt(id);

        String name = model.getValueAt(index, 1).toString();
        txtCustomerName.setText(name);

        String mobileNumber = model.getValueAt(index, 2).toString();
        txtCustomerMobileNumber.setText(mobileNumber);

        String email = model.getValueAt(index, 3).toString();
        txtCustomerEmail.setText(email);
    }//GEN-LAST:event_tableCustomerMouseClicked

    private void tableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductMouseClicked
        int index = tableProduct.getSelectedRow();
        TableModel model = tableProduct.getModel();
        String id = model.getValueAt(index, 0).toString();
        productpk = Integer.parseInt(id);

        String productName = model.getValueAt(index, 1).toString();
        txtProductName.setText(productName);

        String productPrice = model.getValueAt(index, 2).toString();
        txtProductPrice.setText(productPrice);

        String productDescription = model.getValueAt(index, 4).toString();
        txtProductDescription.setText(productDescription);
    }//GEN-LAST:event_tableProductMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String noOfUnits = txtProductQuantity.getText();
        if (!noOfUnits.isEmpty()) {
            String productName = txtProductName.getText();
            String productDescription = txtProductDescription.getText();
            String productPrice = txtProductPrice.getText();

            int totalPrice = Integer.parseInt(txtProductQuantity.getText()) * Integer.parseInt(productPrice);

            int checkStock = 0;
            int checkProductAlreadyExistinCart = 0;

            try {
                Connection con = ConnectionProvider.getcon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select *from product where product_pk=" + productpk + "");
                while (rs.next()) {
                    if (rs.getInt("quantity") >= Integer.parseInt(noOfUnits)) {
                        checkStock = 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "Product is out of stock. Only " + rs.getInt("quantity") + " left");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            if (checkStock == 1) {
                DefaultTableModel model = (DefaultTableModel) tableCart.getModel();
                if (tableCart.getRowCount() != 0) {
                    for (int i = 0; i < tableCart.getRowCount(); i++) {
                        if (Integer.parseInt(model.getValueAt(i, 0).toString()) == productpk) {
                            checkProductAlreadyExistinCart = 1;
                            JOptionPane.showMessageDialog(null, "Product already exist in cart");
                        }
                    }
                }
                if (checkProductAlreadyExistinCart == 0) {
                    model.addRow(new Object[]{
                        productpk,
                        productName,
                        noOfUnits,
                        productPrice,
                        productDescription,
                        totalPrice
                    });
                    finalTotalPrice += totalPrice;
                    lblFinalTotalPrice.setText(String.valueOf(finalTotalPrice));
                    JOptionPane.showMessageDialog(null, "Added Successfully");
                }
                clearProductFields();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No. of Quantity and Product fields are required");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCartMouseClicked
        int index = tableCart.getSelectedRow();
        int a = JOptionPane.showConfirmDialog(null, "Do you want yo remove this product?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            TableModel model = tableCart.getModel();
            String total = model.getValueAt(index, 5).toString();
            finalTotalPrice -= Integer.parseInt(total);
            lblFinalTotalPrice.setText(String.valueOf(finalTotalPrice));
            ((DefaultTableModel) tableCart.getModel()).removeRow(index);
        }
    }//GEN-LAST:event_tableCartMouseClicked

    private void btnSaveOrderDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOrderDetailsActionPerformed
        if (finalTotalPrice != 0 && !txtCustomerName.getText().isEmpty()) {
            orderId = getUniqueId("Bill-");

            DefaultTableModel dtm = (DefaultTableModel) tableCart.getModel();
            if (tableCart.getRowCount() != 0) {
                for (int i = 0; i < tableCart.getRowCount(); i++) {
                    try {
                        Connection con = ConnectionProvider.getcon();
                        Statement st = con.createStatement();
                        st.executeUpdate("update product set quantity=quantity-" + Integer.parseInt(dtm.getValueAt(i, 2).toString()) + " where product_pk=" + Integer.parseInt(dtm.getValueAt(i, 0).toString()));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
            try {
                SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyy");
                Calendar cal = Calendar.getInstance();
                Connection con = ConnectionProvider.getcon();
                PreparedStatement ps = con.prepareStatement("insert into orderDetails(orderId,customer_fk,orderDate,totalPaid) values(?,?,?,?)");
                ps.setString(1, orderId);
                ps.setInt(2, customerpk);
                ps.setString(3, myFormat.format(cal.getTime()));
                ps.setInt(4, finalTotalPrice);
                ps.executeUpdate();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            //creating Document 
            Document doc = new Document();
            try {
                SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyy");
                Calendar cal = Calendar.getInstance();
                PdfWriter.getInstance(doc, new FileOutputStream(InventoryUtils.billPath+""+orderId+".pdf"));
                doc.open();
                Paragraph projectName = new Paragraph("                                                        Inventory Management System\n");
                doc.add(projectName);
                Paragraph starLine = new Paragraph("****************************************************************************************************************");
                doc.add(starLine);
                Paragraph details = new Paragraph("\tOrder ID: "+ orderId +"\nDate: " + myFormat.format(cal.getTime()) + "\nTotal Paid: "+finalTotalPrice+ " Taka");
                doc.add(details);
                doc.add(starLine);
                PdfPTable tb1 = new PdfPTable(5);
                PdfPCell nameCell = new PdfPCell(new Phrase("Name"));
                PdfPCell descriptionCell = new PdfPCell(new Phrase("Description"));
                PdfPCell priceCell = new PdfPCell(new Phrase("Price per Unit"));
                PdfPCell quantityCell = new PdfPCell(new Phrase("Quantity"));
                PdfPCell totalPriceCell = new PdfPCell(new Phrase("Total Price"));
                
                BaseColor BGColor = new BaseColor(255,153,51);
                nameCell.setBackgroundColor(BGColor);
                descriptionCell.setBackgroundColor(BGColor);
                priceCell.setBackgroundColor(BGColor);
                quantityCell.setBackgroundColor(BGColor);
                totalPriceCell.setBackgroundColor(BGColor);
                
                
                tb1.addCell(nameCell);
                tb1.addCell(descriptionCell);
                tb1.addCell(priceCell);
                tb1.addCell(quantityCell);
                tb1.addCell(totalPriceCell);
                
                for(int i=0; i<tableCart.getRowCount(); i++){
                    tb1.addCell(tableCart.getValueAt(i, 1).toString());
                    tb1.addCell(tableCart.getValueAt(i, 4).toString());
                    tb1.addCell(tableCart.getValueAt(i, 3).toString());
                    tb1.addCell(tableCart.getValueAt(i, 2).toString());
                    tb1.addCell(tableCart.getValueAt(i, 5).toString());
                }
                
                doc.add(tb1);
                doc.add(starLine);
                Paragraph thanksMessage = new Paragraph("Thank you Please visit again!");
                doc.add(thanksMessage);
                
                Openpdf.openById(orderId);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            doc.close();
            setVisible(false);
            new ManageOrder().setVisible(true);
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Please add some product or Select customer");
        }
    }//GEN-LAST:event_btnSaveOrderDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSaveOrderDetails;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblFinalTotalPrice;
    private javax.swing.JTable tableCart;
    private javax.swing.JTable tableCustomer;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTextField txtCustomerEmail;
    private javax.swing.JTextField txtCustomerMobileNumber;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtProductDescription;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductPrice;
    private javax.swing.JTextField txtProductQuantity;
    // End of variables declaration//GEN-END:variables
}
