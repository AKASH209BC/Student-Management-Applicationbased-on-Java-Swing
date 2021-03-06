/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allout;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akash Sharma
 */
public class AdminINS extends javax.swing.JFrame {

    /**
     * Creates new form AdminINS
     */
    public AdminINS() {
        initComponents();
        setLocationRelativeTo(null);
        getdata();
    }
String host="jdbc:derby://localhost:1527/newuser";
String username="users";
String password="users";
    private void getdata()
    {
        DefaultTableModel Model=(DefaultTableModel) IT.getModel();
        Lla9.setVisible(false);
        Model.setRowCount(0);
        try
        {
            Connection con=DriverManager.getConnection(host,username,password);
            Statement s=con.createStatement();
            String q="Select * from instructorinfo";
            ResultSet r=s.executeQuery(q);
            while(r.next())
            {
                Model.addRow(new Object[]{r.getString("name"),r.getInt("eid"),r.getString("address"),r.getString("mobile"),r.getString("email"),r.getInt("class")});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }

    }
private int check()
    {   int flag=1;
        if(ID1.getText().equals(""))
        {    JOptionPane.showMessageDialog(null,"Name field can't be empty!!");
             flag=0;  
        }
        else if(ID2.getText().equals(""))
        {    
            JOptionPane.showMessageDialog(null,"Employee Id can't be empty!!");
            flag=0;
        }
        else if(ID3.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Address field can't be empty!!");
            flag=0;
        }
        else if(ID4.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Mobile field can't be empty!!");
            flag=0;
        }
        else if(ID5.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Email field can't be empty!!");
            flag=0;
        }
        else if(ID6.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Class field can't be empty!!");
            flag=0;
        }
        Pattern p1=Pattern.compile("[a-zA-Z]{2,20}");
        Matcher m=p1.matcher(ID1.getText());
        Boolean b=m.matches();
        if(b==false)
        {
            JOptionPane.showMessageDialog(null,"Fill the name correctly!!");
            flag=0;
        }
        Boolean b1=Pattern.compile("[0-9]{4}").matcher(ID2.getText()).matches();
        if(b1==false)
        {
            JOptionPane.showMessageDialog(null,"Fill the Student ID Correctly!!");
            flag=0;
        }
        Boolean b2=Pattern.matches("[a-zA-Z]{5,15}",ID3.getText());
        if(b2==false)
        {
            JOptionPane.showMessageDialog(null,"Fill the address correctly!!");
            flag=0;
        }
        Boolean b3=Pattern.matches("[6789]{1}[0-9]{9}",ID4.getText());
        if(b3==false)
        {
            JOptionPane.showMessageDialog(null,"Fill the mobile number correctly!!");
            flag=0;
        }
        Boolean b4=Pattern.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",ID5.getText());
        if(b4==false)
        {
            JOptionPane.showMessageDialog(null,"Fill the email correctly");
            flag=0;
        }
        if(flag==0)
            return 0;
        else
            return 1;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        IT = new javax.swing.JTable();
        Lla1 = new javax.swing.JLabel();
        Lla2 = new javax.swing.JLabel();
        Lla4 = new javax.swing.JLabel();
        Lla3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ID2 = new javax.swing.JTextField();
        ID1 = new javax.swing.JTextField();
        ID3 = new javax.swing.JTextField();
        ID4 = new javax.swing.JTextField();
        ID5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ID6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Lla9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 15, 25));
        jLabel1.setText("ENTER INSTRUCTOR DETAILS");

        IT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NAME", "EID", "ADDRESS", "MOBILE", "EMAIL", "CLASS"
            }
        ));
        IT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ITMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(IT);

        Lla1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lla1.setForeground(new java.awt.Color(51, 255, 0));
        Lla1.setText("Name");

        Lla2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lla2.setForeground(new java.awt.Color(51, 255, 0));
        Lla2.setText("EMP_ID");

        Lla4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lla4.setForeground(new java.awt.Color(51, 255, 0));
        Lla4.setText("Address");

        Lla3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lla3.setForeground(new java.awt.Color(51, 255, 0));
        Lla3.setText("Mobile");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 0));
        jLabel3.setText("Email");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setText("Class");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("RESET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("LOGOUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("STUDENT PAGE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        Lla9.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5)
                                .addGap(47, 47, 47)
                                .addComponent(Lla9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lla1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lla2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lla4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lla3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ID5, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                            .addComponent(ID6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ID4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ID3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ID2, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(ID1)))
                                .addGap(50, 50, 50))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(532, 532, 532))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lla1)
                            .addComponent(ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lla2)
                            .addComponent(ID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lla4)
                            .addComponent(ID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lla3)
                            .addComponent(ID4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ID6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton6)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(Lla9))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int q=check();
        if(q==1)
        {
            try{
                Connection c=DriverManager.getConnection(host, username,password);
                Statement s=c.createStatement();
                String query="Insert into instructorinfo(name,eid,address,mobile,email,class) values('"+ID1.getText()+"',"+Integer.parseInt(ID2.getText())+",'"+ID3.getText()+"','"+ID4.getText()+"','"+ID5.getText()+"',"+Integer.parseInt(ID6.getText())+")";
                s.execute(query);
                JOptionPane.showMessageDialog(null,"Registration Successful");
                getdata();    
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
                ID1.setText("");
                ID2.setText("");
                ID3.setText("");
                ID4.setText("");
                ID5.setText("");
                ID6.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        LandingPage p=new LandingPage();
        this.dispose();
        p.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        registrationform rf=new registrationform();
        this.dispose();
        rf.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int y=check();
            if(y==1)
            {  
            try
            {  
            Connection con= DriverManager.getConnection(host,username,password);
            Statement stmt=con.createStatement();
            String query="UPDATE instructorinfo SET NAME='"+ID1.getText()+"',eid="+Integer.parseInt(ID2.getText())+",ADDRESS='"+ID3.getText()+"',MOBILE='"+ID4.getText()+"',email='"+ID5.getText()+"',class="+Integer.parseInt(ID6.getText())+" WHERE eid="+ID2.getText();
            stmt.execute(query);
            JOptionPane.showMessageDialog(null,"Saved Successfully");
            ID1.setText("");
            ID2.setText("");
            ID3.setText("");
            ID4.setText("");
            ID5.setText("");
            ID6.setText("");
            Lla9.setText(null);
            getdata();
            }
  
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Values can't remain empty!!");
        }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try{
            Connection con= DriverManager.getConnection(host,username,password);
            Statement stmt=con.createStatement();
            String query="DELETE from instructorinfo WHERE EID="+ID2.getText();
            int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.NO_OPTION)
                    System.out.println("No button clicked"); 
            else if(response == JOptionPane.YES_OPTION) 
            {
                stmt.execute(query);
                JOptionPane.showMessageDialog(null,"Deleted Successfully");
                ID1.setText("");
                ID2.setText("");
                ID3.setText("");
                ID4.setText("");
                ID5.setText("");
                Lla9.setText(null);
                getdata();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ITMouseClicked
        // TODO add your handling code here:
        DefaultTableModel m=(DefaultTableModel) IT.getModel();
        int f=IT.getSelectedRow();
        ID1.setText(m.getValueAt(f,0).toString());
        ID2.setText(m.getValueAt(f,1).toString());
        Lla9.setText(m.getValueAt(f,1).toString());
        ID3.setText(m.getValueAt(f,2).toString());
        ID4.setText(m.getValueAt(f,3).toString());
        ID5.setText(m.getValueAt(f,4).toString());
        ID6.setText(m.getValueAt(f,5).toString());
    }//GEN-LAST:event_ITMouseClicked

    
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
            java.util.logging.Logger.getLogger(AdminINS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminINS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminINS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminINS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminINS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID1;
    private javax.swing.JTextField ID2;
    private javax.swing.JTextField ID3;
    private javax.swing.JTextField ID4;
    private javax.swing.JTextField ID5;
    private javax.swing.JTextField ID6;
    private javax.swing.JTable IT;
    private javax.swing.JLabel Lla1;
    private javax.swing.JLabel Lla2;
    private javax.swing.JLabel Lla3;
    private javax.swing.JLabel Lla4;
    private javax.swing.JLabel Lla9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
