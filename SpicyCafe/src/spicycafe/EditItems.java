/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spicycafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; 


/**
 *
 * @author Pasindu
 */
public class EditItems extends javax.swing.JFrame {

    private String newItemCode;
    private String newitemName;
    private String newShortCode;
    private String newCategory;
    private String newPrice;
    private String newQunty;
    DefaultTableModel itemtblmodel = new DefaultTableModel();

    /**
     * Creates new form EditItems
     */
    public EditItems(String itemCode,String itemName,String shortCode,String category,String price,String qunty,DefaultTableModel itemTableModel) {
        initComponents();
        newItemCode = itemCode;
        newitemName = itemName;
        newShortCode = shortCode;
        newCategory = category;
        newPrice = price;
        newQunty = qunty;  
        itemtblmodel = itemTableModel;
        
        System.out.println(newitemName);
        System.out.println(newShortCode);
        System.out.println(newCategory);
        System.out.println(newPrice);
        System.out.println(newQunty);
        
    }

    private EditItems() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        shortCodeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        itemNameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        editItemBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        categoryDropDown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ItemCodeLable = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        quntyField = new javax.swing.JTextField();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit Item");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 234, 228));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Short Code");

        shortCodeField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        shortCodeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shortCodeFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Price :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Item Name");

        itemNameField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Category :");

        priceField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        editItemBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        editItemBtn.setText("Edit Item");
        editItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editItemBtnActionPerformed(evt);
            }
        });

        resetBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cancelBtn.setText("cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        categoryDropDown.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        categoryDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "fried_rice", "biryani", "juice", "kottu", "pizza", "soft_drink", "dessert", "other" }));
        categoryDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryDropDownActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Item Code");

        ItemCodeLable.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ItemCodeLable.setText("Item_Code");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Quantity");

        quntyField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editItemBtn)
                .addGap(30, 30, 30)
                .addComponent(resetBtn)
                .addGap(30, 30, 30)
                .addComponent(cancelBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItemCodeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(shortCodeField, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(quntyField)
                                .addComponent(itemNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(categoryDropDown, javax.swing.GroupLayout.Alignment.TRAILING, 0, 266, Short.MAX_VALUE)
                                .addComponent(priceField, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(jLabel6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(shortCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ItemCodeLable)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(itemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(categoryDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(quntyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(resetBtn)
                    .addComponent(editItemBtn))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void shortCodeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shortCodeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shortCodeFieldActionPerformed

    private void editItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editItemBtnActionPerformed
        String itemName = itemNameField.getText();
        String shortCode = shortCodeField.getText();
        String category = (String) categoryDropDown.getSelectedItem();
        String qnty = quntyField.getText();
        String price = priceField.getText();

        if (itemName.isEmpty() || shortCode.isEmpty()||category.isEmpty()||qnty.isEmpty()||price.isEmpty()){
            JOptionPane.showMessageDialog(this, "Error! Please Fill The Datails Correctly.");
        }
        else{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spicycafedb", "root", "");
                String s = "UPDATE food_items SET  item_name = ?, category = ?, short_code = ?, price = ?, available_qnty = ? WHERE item_code = ?";
                PreparedStatement ps = con.prepareStatement(s);
                ps.setString(1, itemName);
                ps.setString(3, shortCode);
                ps.setString(2, category);
                ps.setString(5, qnty);
                ps.setString(4, price);
                ps.setString(6, ItemCodeLable.getText());
                System.out.println(ps);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Item Updated Sucessfully");

                //            refresh TAble DATA

                itemtblmodel.setRowCount(0);
                String s2 = "select * from food_items";
                PreparedStatement ps2 = con.prepareStatement(s2);
                ResultSet rs2 = ps2.executeQuery();

                while(rs2.next()){
                    String itemcode1 = rs2.getString("item_code");
                    String itemName1 = rs2.getString("item_name");
                    String category1 = rs2.getString("category");
                    String shortCode1 = rs2.getString("short_code");
                    String price1 = rs2.getString("price");
                    String qnty1 = rs2.getString("available_qnty");

                    String tableRowData[] = {itemcode1,itemName1,category1,shortCode1,price1,qnty1};

                    itemtblmodel.addRow(tableRowData);
                }

                //            Refresh TAble Data

                con.close();
                this.setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_editItemBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        quntyField.setText("");
        shortCodeField.setText("");
        itemNameField.setText("");
        priceField.setText("");
        priceField.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void categoryDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryDropDownActionPerformed

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
            java.util.logging.Logger.getLogger(EditItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditItems().setVisible(true);
            }
        });
    }
    
    public  void setData(){
        
        System.out.println("SETDATAVALUES");
        System.out.println(newItemCode);
        System.out.println(newitemName);
        System.out.println(newShortCode);
        System.out.println(newCategory);
        System.out.println(newPrice);
        System.out.println(newQunty);
        
        
        ItemCodeLable.setText(newItemCode);
        itemNameField.setText(newitemName);
        shortCodeField.setText(newShortCode);
        categoryDropDown.setSelectedItem(newCategory);
        priceField.setText(newPrice);
        quntyField.setText(newQunty);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ItemCodeLable;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> categoryDropDown;
    private javax.swing.JButton editItemBtn;
    private javax.swing.JTextField itemNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField quntyField;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField shortCodeField;
    // End of variables declaration//GEN-END:variables
}
