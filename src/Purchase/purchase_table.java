
package Purchase;

import Product.product_table;
import Table.table_page;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class purchase_table extends javax.swing.JFrame {
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    
    

    /**
     * Creates new form purchase_table
     */
    public purchase_table() {
        initComponents();
        getContentPane().setBackground(Color.PINK);
        Toolkit tt=Toolkit.getDefaultToolkit();
        int w=(int)tt.getScreenSize().getWidth();
        int h=(int)tt.getScreenSize().getHeight();
        this.setSize(w, h);
        Setnane();
        a.setText(""+autoid());
        e.setText("No Discount ");
        
    }
    void Con(){
        try {
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/supershop", "root", "");
st=con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(product_table.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void Setnane(){Con();
    String sq="SELECT `ID`,`Product Name` FROM `product`";
        try {
            jComboBox1.addItem("SELECT PRODUCT-");
            rs=st.executeQuery(sq);
            while(rs.next()){
            jComboBox1.addItem(rs.getString(2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(purchase_table.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    int autoid(){int puid=0;
    try {
        Con();
        String sq="SELECT `ID` FROM `purchase`";
        rs=st.executeQuery(sq);
        while(rs.next()){
        puid=rs.getInt(1);
        }
        
        puid++;
        
        
        } catch (SQLException ex) {
            Logger.getLogger(purchase_table.class.getName()).log(Level.SEVERE, null, ex);
        }
    return puid;
    }
void showTable(){
    Con();
    DefaultTableModel ddt=(DefaultTableModel)jTable1.getModel();
    ddt.setRowCount(0);
    
        try {
            String sq="SELECT `ID`,`Date`,`Supplier Name`,`Product Name`,`Price`,`Quantity`,`total` FROM `purchase` WHERE `ID`='"+a.getText()+"'";
            rs=st.executeQuery(sq);
            int sl=0;
            int ta=0;
            while(rs.next()){sl++;
 ddt.addRow(new Object[]{sl,rs.getString(4),rs.getString(6),rs.getString(5),rs.getString(7)});
 lbn.setText(rs.getString(1));
 ld.setText(rs.getString(2));
 lsn.setText(rs.getString(3));
 ta=ta+rs.getInt(7);
         }
            lta.setText(""+ta);
        } catch (SQLException ex) {
            Logger.getLogger(purchase_table.class.getName()).log(Level.SEVERE, null, ex);
        }
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        c = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        d = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        e = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbn = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ld = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lsn = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lta = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELSE TABLE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(500, -10, 450, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 190, 160, 30);
        getContentPane().add(a);
        a.setBounds(210, 190, 260, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("DATE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 230, 160, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("SUPPLIER NAME");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 270, 160, 30);
        getContentPane().add(b);
        b.setBounds(210, 270, 260, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("PRODUCT NAME");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 310, 160, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("QUANTITY");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 390, 160, 30);
        getContentPane().add(c);
        c.setBounds(210, 390, 260, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("PRICE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 350, 160, 30);

        d.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dKeyPressed(evt);
            }
        });
        getContentPane().add(d);
        d.setBounds(210, 350, 260, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("DISCOUNT");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 430, 160, 30);
        getContentPane().add(e);
        e.setBounds(210, 430, 260, 30);

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(380, 540, 90, 30);

        jButton3.setText("INSERT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(40, 490, 90, 30);

        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(160, 490, 90, 30);

        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(270, 490, 90, 30);

        jButton6.setText("CLEAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(380, 490, 90, 30);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Purchase/exit.JPG"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1250, 0, 120, 30);

        jButton1.setText("exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1340, 0, 30, 30);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Purchase/back.JPG"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 110, 30);

        jButton7.setText("back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(0, 0, 30, 30);

        jButton8.setText("back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(80, 0, 30, 30);

        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(210, 310, 260, 30);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL NO.", "PRODUCT NAME", "PRICE", "QUANTITY", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 103, 569, -1));

        lbn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(lbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 60, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Bill No :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 60, 20));

        ld.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(ld, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 130, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Date :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 50, 20));

        lsn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(lsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 190, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Supplier Name :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, 20));

        lta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(lta, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 120, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Total Amount :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 110, 20));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(600, 110, 630, 590);
        getContentPane().add(jCalendar1);
        jCalendar1.setBounds(210, 230, 260, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         // back
        table_page tp=new table_page();
        this.setVisible(false);
        tp.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       // back
        table_page tp=new table_page();
        this.setVisible(false);
        tp.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            //inset Data
            String id=a.getText();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(jDateChooser1.getDate());
            String sname=b.getText();
            String pname=jComboBox1.getSelectedItem().toString();
            int price=Integer.parseInt(c.getText());
            int quantity=Integer.parseInt(d.getText());
            String discount=e.getText();
            int total=price*quantity;
           
            if(id.isEmpty()){
            JOptionPane.showMessageDialog(this, "ID Empty!!");
            a.requestFocus();
            }
            else if(date.isEmpty()){
            JOptionPane.showMessageDialog(this, "date Empty!!");
            //date.requestFocus();
            }
            else if(sname.isEmpty()){
            JOptionPane.showMessageDialog(this, "Supplier Name Empty!!");
            b.requestFocus();
            }
            
            else if(jComboBox1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Product Name Empty!!");
            jComboBox1.requestFocus();
            }
            /*else if(price.isEmpty()){
            JOptionPane.showMessageDialog(this, "Price Empty!!");
            c.requestFocus();
           }
            else if(quantity.isEmpty()){
            JOptionPane.showMessageDialog(this, "Quantity Empty!!");
            d.requestFocus();
            }*/
            else if(discount.isEmpty()){
            JOptionPane.showMessageDialog(this, "discount Empty!!");
            e.requestFocus();
            }
            else{
            
            Con();
int c=JOptionPane.showConfirmDialog(this, "Confirm", "Do You Went Save Data??", JOptionPane.YES_NO_OPTION);
if(c==0){
int aa=st.executeUpdate("INSERT INTO `purchase` VALUES('"+id+"','"+date+"','"+sname+"','"+pname+"','"+price+"','"+quantity+"','"+discount+"','"+total+"')");
        if(aa>0){
            JOptionPane.showMessageDialog(this, "Success !!");
            showTable();
        }
        else{
            JOptionPane.showMessageDialog(this, "failed");
        }}
        }
        } catch (SQLException ex) {
            Logger.getLogger(purchase_table.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // Update
            String id=a.getText();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(jDateChooser1.getDate());
            String sname=b.getText();
            String pname=jComboBox1.getSelectedItem().toString();
            int price=Integer.parseInt(c.getText());
            int quantity=Integer.parseInt(d.getText());
            String discount=e.getText();
            int total=price*quantity;
            String ss="UPDATE `purchase` SET `Date`='"+date+"',`Supplier Name`='"+sname+"',`Product Name`='"+pname+"',`Price`='"+price+"',`Quantity`='"+quantity+"',`Discout`='"+discount+"',`total`='"+total+"' WHERE `ID`='"+id+"'";
            int uu=st.executeUpdate(ss);
            if(uu>0){
                JOptionPane.showMessageDialog(this, " Update Success !!");
                showTable();
            }
            else{
                JOptionPane.showMessageDialog(this, " Update Failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(purchase_table.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    void Clear(){
    d.setText("");
    c.setText("");
    jComboBox1.addItem("SELECT PRODUCT-");
    
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Clear
        Clear();
    }//GEN-LAST:event_jButton6ActionPerformed
void Delete(){
            String id=a.getText();
            String sname=b.getText();
            
            try {
            String sq="DELETE FROM `purchase` WHERE `ID`='"+id+"' and `Supplier Name`='"+sname+"'";
            Con();
            int u=st.executeUpdate(sq);
            if(u>=1){
            JOptionPane.showMessageDialog(this, "Delete Successfully");
            
            b.setText("");
            
            a.setText(""+autoid());
            Clear();
            }
            else{
           JOptionPane.showMessageDialog(this, "Delete Failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(product_table.class.getName()).log(Level.SEVERE, null, ex);
        }}
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Delete
        Delete();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void dKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dKeyPressed
        //enter
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        c.requestFocus();
        }
    }//GEN-LAST:event_dKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            //Print
        boolean p=jTable1.print();
        if(p==true){
            JOptionPane.showMessageDialog(this, "Printing...");
        }else{
          JOptionPane.showMessageDialog(this, "Printing Failed");    
        }
        } catch (PrinterException ex) {
            Logger.getLogger(purchase_table.class.getName()).log(Level.SEVERE, null, ex);
        }

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
            java.util.logging.Logger.getLogger(purchase_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purchase_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purchase_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purchase_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purchase_table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField b;
    private javax.swing.JTextField c;
    private javax.swing.JTextField d;
    private javax.swing.JTextField e;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbn;
    private javax.swing.JLabel ld;
    private javax.swing.JLabel lsn;
    private javax.swing.JLabel lta;
    // End of variables declaration//GEN-END:variables

    private static class jDateChooser1 {

        private static Object getDate() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jDateChooser1() {
        }
    }
}
