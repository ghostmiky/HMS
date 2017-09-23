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
import java.util.Calendar;
import java.util.GregorianCalendar;
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
    int time=0;
    
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
       
             //CLOCK
        new Thread() {
            public void run() {
                while (time == 0) {
                    Calendar cal = new GregorianCalendar();

                    int hour = cal.get(Calendar.HOUR);
                    int min = cal.get(Calendar.MINUTE);
                    int sec = cal.get(Calendar.SECOND);
                    int ampm = cal.get(Calendar.AM_PM);
                    int year = cal.get(Calendar.YEAR);
                    int month = cal.get(Calendar.MONTH);
                    int date = cal.get(Calendar.DATE);

                    String day = "", Month = "";
                    if (hour == 0 && ampm == 1) {
                        hour = 12;
                    }
                    //AM PM
                    if (ampm == 1) {
                        day = "PM";
                    } else {
                        day = "AM";
                    }

                    //MONTH
                    if (month == 0) {
                        Month = "January";
                    } else if (month == 1) {
                        Month = "February";
                    } else if (month == 2) {
                        Month = "March";
                    } else if (month == 3) {
                        Month = "April";
                    } else if (month == 4) {
                        Month = "May";
                    } else if (month == 5) {
                        Month = "June";
                    } else if (month == 6) {
                        Month = "July";
                    } else if (month == 7) {
                        Month = "August";
                    } else if (month == 8) {
                        Month = "September";
                    } else if (month == 9) {
                        Month = "October";
                    } else if (month == 10) {
                        Month = "November";
                    } else if (month == 11) {
                        Month = "December";
                    }
                    String clock = hour + ":" + min + ":" + sec + " ";
                    String today = year + " " + Month + " " + date;

                    clockss6.setText(clock);
                    dayss6.setText(day);
                    yearss6.setText(String.valueOf(year));
                    Monthss6.setText(String.valueOf(Month));
                    datess6.setText(String.valueOf(date));
                }
            }
        }.start();
        
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
        Monthss6 = new javax.swing.JLabel();
        datess6 = new javax.swing.JLabel();
        yearss6 = new javax.swing.JLabel();
        clockss6 = new javax.swing.JLabel();
        dayss6 = new javax.swing.JLabel();

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

        Monthss6.setFont(new java.awt.Font("DS-Digital", 0, 36)); // NOI18N
        Monthss6.setText("month");

        datess6.setFont(new java.awt.Font("DS-Digital", 0, 24)); // NOI18N
        datess6.setText("date");

        yearss6.setFont(new java.awt.Font("DS-Digital", 0, 24)); // NOI18N
        yearss6.setText("year");

        clockss6.setFont(new java.awt.Font("DS-Digital", 0, 36)); // NOI18N
        clockss6.setText("jLabel40");

        dayss6.setFont(new java.awt.Font("DS-Digital", 0, 36)); // NOI18N
        dayss6.setText("AM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clockss6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dayss6)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(yearss6)
                        .addGap(18, 18, 18)
                        .addComponent(Monthss6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datess6)))
                .addContainerGap())
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clockss6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dayss6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearss6)
                    .addComponent(Monthss6)
                    .addComponent(datess6))
                .addGap(17, 17, 17)
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
    private javax.swing.JLabel Monthss6;
    private javax.swing.JLabel clockss6;
    private javax.swing.JLabel datess6;
    private javax.swing.JLabel dayss6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel yearss6;
    // End of variables declaration//GEN-END:variables
}
