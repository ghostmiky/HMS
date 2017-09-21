/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import prtype.DBconnection;
import static Interfaces.confirm.cid;
import static Interfaces.confirm.rid;
import static Interfaces.confirm2.hid;
import static Interfaces.confirm2.rdate;
import static Interfaces.confirm2.rtime;
import static Interfaces.confirm2.mealname;
import static Interfaces.confirm2.tprice;
import static Interfaces.confirm2.extraprice;
import static Interfaces.confirm2.totexprice;
import com.mysql.jdbc.Connection;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class advancePay extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    PreparedStatement pst2 = null;
    
    public static double mealprice;
    public static double fullpayment;
    public static double advancepayment;
    int id = 0 ;
    
    
    public advancePay() {
        
        initComponents();
        conn = DBconnection.connect();
        
        fullpayment = paycal();
        String y = String.valueOf(fullpayment);
        jLabel4.setText(y);
        System.out.println("y:" + y);
        
        advancepayment = advance ();
        String n = String.valueOf(advancepayment);
        jLabel5.setText(n);
        System.out.println("n:"+n);
        
       setfullscreen();
        
    }

  public void setfullscreen() {

        this.setResizable(false);

        Toolkit kit = Toolkit.getDefaultToolkit();

        int xsize = (int) kit.getScreenSize().getWidth();
        int ysize = (int) kit.getScreenSize().getHeight();

        int x = xsize / 2;
        int y = ysize / 2;

        this.setSize(x, y);//set size

        //moving to the center
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int Width = this.getSize().width;
        int Height = this.getSize().height;

        int locationx = (dimension.width - Width) / 2;
        int locationy = (dimension.height - Height) / 2;

        this.setLocation(locationx, locationy);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Payment Details");

        jLabel2.setText("Full Payment");

        jLabel3.setText("Advance payment");

        jButton1.setText("Pay and confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back to previous");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("update stock");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel1)
                .addContainerGap(302, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addGap(32, 32, 32)
                .addComponent(jButton3)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public double paycal ()
    {
        try {
            
        String sql = "select * from meal_price where mealName = '"+ mealname +"'";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        
        while (rs.next())
        {
            mealprice = rs.getDouble(3);
            System.out.println("meal prize is: " + mealprice );
        }
            
        } catch (Exception e) {
        }
        
        
        double tot;
        tot = mealprice + tprice + extraprice ;
        
        return tot;
    }
    
    public double advance ()
    {
        double total;
        double ad;
        
        total = paycal();
        ad = (total / 100.0)*25 ;
        System.out.println("advance is:"+ad);
        
        return ad;
        
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        try {
           
        //System.out.println(""+cid+" "+ hid+" "+rdate+" "+rtime+" "+fullpayment+" "+advancepayment+" "+mealname+" "+extraprice);
        
        String sql = "insert into confirmation (cusID,hallID,condate,contime,fullPay,advPay,mealID,extra) values ('"+ cid +"','"+ hid +"','"+ rdate +"','"+ rtime +"','"+ fullpayment +"','"+ advancepayment +"','"+ mealname +"','"+ extraprice +"')";
        pst = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        pst.executeUpdate();
        rs = pst.getGeneratedKeys();
        if (rs.next())
            {
                id = rs.getInt(1);
            }
            
        String st = " successfully executed \n reservation table is updated \n confirmation reservation id = '"+ id +"'";
        JOptionPane.showMessageDialog(null,st);
        
        String sql2 = " delete from recres where resID = '"+ rid +"' ";
        pst2 = conn.prepareStatement(sql2);
        pst2.execute();
        
        
        
            
        } catch (Exception e) {
        }
        
        jLabel4.setText("");
        jLabel5.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        confirm2 m4 = new confirm2();
        m4.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(advancePay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(advancePay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(advancePay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(advancePay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new advancePay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
