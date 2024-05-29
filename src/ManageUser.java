
import Dao.ConnectionProvider;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.table.TableModel;

public class ManageUser extends javax.swing.JFrame {

    private int appuserPk = 0;

    //Creates new form ManageUser
    public ManageUser() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private boolean validateFields(String formType) {
        if (formType.equals("edit") && !txtName.getText().isEmpty() && !txtMobileNumber.getText().isEmpty() && !txtEmail.getText().isEmpty() && !txtAddress.getText().isEmpty()) {
            return false;
        } else if (formType.equals("new") && !txtName.getText().isEmpty() && !txtMobileNumber.getText().isEmpty() && !txtEmail.getText().isEmpty() && !txtAddress.getText().isEmpty() && !txtPassword.getText().isEmpty()) {
            return false;
        } else {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ComboboxStatus = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Inter", 1, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE USER");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 350, -1));

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Number", "Email", "Address", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 710, 590));

        jLabel2.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 127, -1, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 162, 450, 34));

        jLabel3.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mobile Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 208, -1, -1));
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 243, 450, 34));

        jLabel4.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 289, -1, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 324, 450, 34));

        jLabel5.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 370, -1, -1));
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 405, 450, 34));

        jLabel6.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 451, -1, -1));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 486, 450, 34));

        jLabel7.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Status");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 532, -1, -1));

        ComboboxStatus.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        ComboboxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        getContentPane().add(ComboboxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 567, 450, 32));

        btnSave.setBackground(new java.awt.Color(38, 70, 83));
        btnSave.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 631, 97, 30));

        btnUpdate.setBackground(new java.awt.Color(38, 70, 83));
        btnUpdate.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(null);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(924, 631, 107, 30));

        btnReset.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setBorder(null);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1049, 631, 100, 30));

        btnClear.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        btnClear.setText("Close");
        btnClear.setBorder(null);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1167, 631, 92, 30));

        jLabel8.setBackground(new java.awt.Color(42, 157, 143));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        DefaultTableModel model = (DefaultTableModel) tableUser.getModel();
        try {
            Connection con = ConnectionProvider.getcon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from appuser where userRole='Admin'");
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("appuser_pk"),
                    rs.getString("name"),
                    rs.getString("mobileNumber"),
                    rs.getString("email"),
                    rs.getString("address"),
                    rs.getString("status")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String name = txtName.getText();
        String mobileNumber = txtMobileNumber.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        String address = txtAddress.getText();
        String status = (String) ComboboxStatus.getSelectedItem();

        if (validateFields("new")) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else {
            try {
                Connection con = ConnectionProvider.getcon();
                PreparedStatement ps = con.prepareStatement("insert into appuser (userRole,name,mobileNumber,email,password,address,status) values ('Admin',?,?,?,?,?,?)");
                ps.setString(1, name);
                ps.setString(2, mobileNumber);
                ps.setString(3, email);
                ps.setString(4, password);
                ps.setString(5, address);
                ps.setString(6, status);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "User added successfully");
                setVisible(false);
                new ManageUser().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        int index = tableUser.getSelectedRow();
        TableModel model = tableUser.getModel();

        String id = model.getValueAt(index, 0).toString();
        appuserPk = Integer.parseInt(id);

        String name = model.getValueAt(index, 1).toString();
        txtName.setText(name);

        String mobileNumber = model.getValueAt(index, 2).toString();
        txtMobileNumber.setText(mobileNumber);

        String email = model.getValueAt(index, 3).toString();
        txtEmail.setText(email);

        String address = model.getValueAt(index, 4).toString();
        txtAddress.setText(address);

        String status = model.getValueAt(index, 5).toString();
        ComboboxStatus.removeAllItems();
        if (status.equals("Active")) {
            ComboboxStatus.addItem("Active");
            ComboboxStatus.addItem("Inactive");
        } else {
            ComboboxStatus.addItem("Inactive");
            ComboboxStatus.addItem("Active");
        }
        txtPassword.setEditable(false);
        txtPassword.setBackground(Color.darkGray);

        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);

    }//GEN-LAST:event_tableUserMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String mobileNumber = txtMobileNumber.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String status = (String) ComboboxStatus.getSelectedItem();

        if (validateFields("edit")) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else {
            try {
                Connection con = ConnectionProvider.getcon();
                PreparedStatement ps = con.prepareStatement("update appuser set name=?,mobileNumber=?,email=?,address=?,status=? where appuser_pk=?");
                ps.setString(1, name);
                ps.setString(2, mobileNumber);
                ps.setString(3, email);
                ps.setString(4, address);
                ps.setString(5, status);
                ps.setInt(6, appuserPk);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "User updated successfully");
                setVisible(false);
                new ManageUser().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ManageUser().setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboboxStatus;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUser;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
