/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package billing.management.system;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.*;
import Project.ConnectionProvider;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author Admin
 */
public class billing extends javax.swing.JFrame {
    public int finalTotal = 0;

    /**
     * Creates new form billing
     */
    public billing() {
        initComponents();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        jLabel5.setText(dFormat.format(date));
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        jLabel6.setText(dtf.format(time));
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
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(30, 120));
        setMaximumSize(new java.awt.Dimension(1460, 550));
        setMinimumSize(new java.awt.Dimension(1460, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 191, 120));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 80)); // NOI18N
        jLabel1.setText("Bill");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 30, 180, 70);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1323, 456, 80, 27);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1323, 406, 80, 27);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1323, 356, 80, 27);

        jTextField12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(jTextField12);
        jTextField12.setBounds(1043, 456, 220, 28);

        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField11);
        jTextField11.setBounds(1043, 406, 220, 28);

        jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(jTextField10);
        jTextField10.setBounds(1043, 354, 220, 30);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel21.setText("Return Amount");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(893, 456, 107, 22);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel20.setText("Paid Amount");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(893, 406, 100, 22);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel19.setText("Total");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(893, 356, 58, 22);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setText("Calculation Details:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(890, 310, 220, 32);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Date:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(400, 20, 50, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Time:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(400, 60, 50, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(480, 20, 100, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 60, 90, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Buyer Details:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 130, 160, 32);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 200, 61, 22);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Contact No");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 270, 85, 22);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(120, 190, 250, 40);

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(120, 260, 250, 40);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Email");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 330, 43, 22);

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(120, 330, 250, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Address");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 400, 60, 22);

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(jTextField4);
        jTextField4.setBounds(120, 390, 250, 40);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Product Details:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(400, 130, 190, 32);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Product ID");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(400, 190, 80, 22);

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(570, 188, 80, 30);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("Product Name");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(400, 250, 110, 22);

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(jTextField6);
        jTextField6.setBounds(570, 238, 250, 40);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Price");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(400, 320, 43, 22);

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7);
        jTextField7.setBounds(570, 310, 250, 40);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("Quantity");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(400, 380, 70, 22);

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(jTextField8);
        jTextField8.setBounds(570, 380, 250, 40);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setText("Description");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(400, 450, 90, 22);

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(jTextField9);
        jTextField9.setBounds(570, 450, 250, 40);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(740, 190, 80, 27);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Rate", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(890, 20, 540, 280);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        String name = jTextField1.getText();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from customer where name like '"+name+"%'");
            if (rs.next()){
                jTextField1.setText(rs.getString(1));
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(3));
                jTextField4.setText(rs.getString(4));
            } else{
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        String contactNo = jTextField2.getText();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from customer where contactNo like '"+contactNo+"%'");
            if (rs.next()){
                jTextField1.setText(rs.getString(1));
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(3));
                jTextField4.setText(rs.getString(4));
            } else{
                jTextField1.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        String productID = jTextField5.getText();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from product where pID like '"+productID+"%'");
            if (rs.next()){
                jTextField6.setText(rs.getString(2));
                jTextField7.setText(rs.getString(3));
                jTextField8.setText("1");
                jTextField9.setText(rs.getString(4));
            } else{
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int price = Integer.parseInt(jTextField7.getText());
        int quantity = Integer.parseInt(jTextField8.getText());
        int total = price *quantity;
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]{jTextField6.getText(), jTextField9.getText(), price, quantity, total});
        finalTotal = finalTotal+total;
        String finalTotal1 = String.valueOf(finalTotal);
        jTextField10.setText(finalTotal1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
        String paidAmount = jTextField11.getText();
        int n = Integer.parseInt(paidAmount);
        finalTotal = n - finalTotal;
        String finalTotal1 = String.valueOf(finalTotal);
        jTextField12.setText(finalTotal1);
        jTextField12.setEditable(false);
        
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new billing().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String name = jTextField1.getText();
    String contactNo = jTextField2.getText();
    String email = jTextField3.getText();
    String address = jTextField4.getText();
    String path = "D:\\";
    
    // Tạo đối tượng NumberFormat để định dạng số
    NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
    
    com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
    try {
        BaseFont bf = BaseFont.createFont("c:/windows/fonts/arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        Font font = new Font(bf, 12);
        
        PdfWriter.getInstance(doc, new FileOutputStream(path + name + " " + jLabel15.getText() + ".pdf"));
        doc.open();
        
        Paragraph paragraph1 = new Paragraph("                         Billing System Management\n                Contact Number: (+84)36 8388 802\n\n", font);
        doc.add(paragraph1);
        
        Paragraph paragraph2 = new Paragraph("Date & Time: " + jLabel5.getText() + " " + jLabel6.getText() + 
                                              "\nCustomer Details:" + 
                                              "\nName: " + name + 
                                              "\nContact Number: " + contactNo +
                                              "\nEmail: " + email + 
                                              "\nAddress: " + address + "\n\n", font);
        doc.add(paragraph2);
        
        PdfPTable tb1 = new PdfPTable(5);
        tb1.addCell(new Phrase("Name", font));
        tb1.addCell(new Phrase("Description", font));
        tb1.addCell(new Phrase("Rate", font));
        tb1.addCell(new Phrase("Quantity", font));
        tb1.addCell(new Phrase("Sub Total", font));
        
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            String n = jTable1.getValueAt(i, 0).toString();
            String d = jTable1.getValueAt(i, 1).toString();
            String r = jTable1.getValueAt(i, 2).toString();
            String q = jTable1.getValueAt(i, 3).toString();
            String s = jTable1.getValueAt(i, 4).toString();
            
            tb1.addCell(new Phrase(n, font));
            tb1.addCell(new Phrase(d, font));
            tb1.addCell(new Phrase(r, font));
            tb1.addCell(new Phrase(q, font));
            tb1.addCell(new Phrase(s, font));
        }
        doc.add(tb1);
        
        // Định dạng số với dấu phân cách
        String totalFormatted = numberFormat.format(Double.parseDouble(jTextField10.getText()))+ " đồng";
        String paidAmountFormatted = numberFormat.format(Double.parseDouble(jTextField11.getText()))+ " đồng";
        String returnAmountFormatted = numberFormat.format(Double.parseDouble(jTextField12.getText()))+ " đồng";
        
        Paragraph paragraph3 = new Paragraph(
            "\nTotal: " + totalFormatted + 
            "\nPaid Amount: " + paidAmountFormatted + 
            "\nReturn Amount: " + returnAmountFormatted + 
            "\n\n               Thank you for Choosing Lasaphir! We are happy to see you again.", font);
        doc.add(paragraph3);
        
        JOptionPane.showMessageDialog(null, "Bill Generated");
        setVisible(true);
        new billing().setVisible(true);
    }
    catch(Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    finally {
        doc.close();
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
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
