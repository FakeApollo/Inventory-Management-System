
import javax.swing.JOptionPane;
public class Home extends javax.swing.JFrame {
    public Home() {
        initComponents();
    }
    public Home(String role) {
        initComponents();
        setLocationRelativeTo(null);
        if(role.equals("Admin")){
            btnUser.setVisible(false);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUser = new javax.swing.JButton();
        btnCategory = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        BtnCustomer = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUser.setBackground(new java.awt.Color(203, 243, 240));
        btnUser.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        btnUser.setForeground(new java.awt.Color(38, 70, 83));
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        btnUser.setText("User");
        btnUser.setToolTipText("");
        btnUser.setAlignmentY(0.0F);
        btnUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnUser.setBorderPainted(false);
        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUser.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 320, 210));

        btnCategory.setBackground(new java.awt.Color(203, 243, 240));
        btnCategory.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        btnCategory.setForeground(new java.awt.Color(38, 70, 83));
        btnCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/category.png"))); // NOI18N
        btnCategory.setText("Category");
        btnCategory.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCategory.setBorderPainted(false);
        btnCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 260, 200));

        btnProduct.setBackground(new java.awt.Color(203, 243, 240));
        btnProduct.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        btnProduct.setForeground(new java.awt.Color(38, 70, 83));
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Product.png"))); // NOI18N
        btnProduct.setText("Product");
        btnProduct.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnProduct.setBorderPainted(false);
        btnProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 260, 250));

        BtnCustomer.setBackground(new java.awt.Color(203, 243, 240));
        BtnCustomer.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        BtnCustomer.setForeground(new java.awt.Color(38, 70, 83));
        BtnCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customer.png"))); // NOI18N
        BtnCustomer.setText("Customer");
        BtnCustomer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnCustomer.setBorderPainted(false);
        BtnCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 280, 280));

        btnOrder.setBackground(new java.awt.Color(203, 243, 240));
        btnOrder.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(38, 70, 83));
        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Order.png"))); // NOI18N
        btnOrder.setText("Order");
        btnOrder.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnOrder.setBorderPainted(false);
        btnOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 280, 170));

        btnViewOrder.setBackground(new java.awt.Color(203, 243, 240));
        btnViewOrder.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        btnViewOrder.setForeground(new java.awt.Color(38, 70, 83));
        btnViewOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ViewOrder.png"))); // NOI18N
        btnViewOrder.setText("View Orders");
        btnViewOrder.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnViewOrder.setBorderPainted(false);
        btnViewOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 320, 240));

        btnLogout.setBackground(new java.awt.Color(203, 243, 240));
        btnLogout.setFont(new java.awt.Font("Inter", 3, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(38, 70, 83));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLogout.setBorderPainted(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 680, 179, 40));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 705, -1, -1));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MAIN MENU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 310, 68));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1126, 735, 173, 30));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1305, 690, 55, 30));

        jLabel4.setBackground(new java.awt.Color(42, 157, 143));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        new ManageUser().setVisible(true);
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        new ManageOrder().setVisible(true);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        // TODO add your handling code here:
        new ManageProduct().setVisible(true);
    }//GEN-LAST:event_btnProductActionPerformed

    private void BtnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCustomerActionPerformed
        new ManageCustomer().setVisible(true);
    }//GEN-LAST:event_BtnCustomerActionPerformed

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        new ViewOrder().setVisible(true);
    }//GEN-LAST:event_btnViewOrderActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCustomer;
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
