/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import com.sun.glass.events.KeyEvent;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Peter
 */
public class frame3 extends javax.swing.JFrame {

    /**
     * Creates new form frame3
     
     */
  
    public frame3() {
          
        initComponents();
    }
int flag=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Registration Form");
        setBackground(new java.awt.Color(102, 102, 255));
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setToolTipText("");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel1.setText("Name");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(100, 100, 50, 15);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel2.setText("Age");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(100, 140, 30, 15);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel3.setText("Sex");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(100, 170, 30, 20);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel4.setText("Father's Name");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(90, 210, 82, 15);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel5.setText("Department");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(90, 250, 66, 15);

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel6.setText("USN");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(100, 20, 50, 15);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel7.setText("Section");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(100, 290, 50, 15);

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel8.setText("Admission Date");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(90, 330, 88, 15);

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel9.setText("Admission Through");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(70, 370, 130, 15);

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel10.setText("Payment Method");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(80, 450, 100, 15);

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel11.setText("Admission Fee");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(90, 410, 82, 15);

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel12.setText("Contact No");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(100, 500, 70, 15);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField1);
        jTextField1.setBounds(190, 10, 200, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField2);
        jTextField2.setBounds(190, 90, 200, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField3);
        jTextField3.setBounds(190, 130, 200, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton1);
        jRadioButton1.setBounds(190, 170, 100, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton2);
        jRadioButton2.setBounds(300, 170, 100, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPUTER SCIENCE AND ENGINEERING", "CIVIL ENGINEERING", "MECHANICAL ENGINEERING", "CIVIL ENGINEERING", "ELECTRICAL AND ELECTRONICS ENGINEERING", "INFORMATION SCIENCE AND ENGINEERING", "BIOTECHNOLOGY ENGINEERING", " ", " ", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox1);
        jComboBox1.setBounds(190, 240, 200, 30);

        jTextField4.setText("dd/mm/yy");
        jTextField4.setToolTipText("");
        jTextField4.setName("dd/mm/yy"); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField4);
        jTextField4.setBounds(190, 320, 200, 30);
        jTextField4.getAccessibleContext().setAccessibleName("");
        jTextField4.getAccessibleContext().setAccessibleDescription("");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox2);
        jComboBox2.setBounds(190, 280, 200, 30);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField5);
        jTextField5.setBounds(190, 200, 200, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Management", "CET", "COMEDK", "NRI" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox3);
        jComboBox3.setBounds(190, 360, 200, 30);

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField6);
        jTextField6.setBounds(190, 400, 200, 30);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD", "CASH", "CHEQUE", "NEFT", " " }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox4);
        jComboBox4.setBounds(190, 440, 110, 30);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField7);
        jTextField7.setBounds(190, 490, 200, 30);

        jButton1.setText("Previous");
        jButton1.setActionCommand("Previous");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(110, 540, 90, 30);

        jButton2.setText("Register");
        jButton2.setActionCommand("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(300, 540, 80, 30);

        jTextField8.setText("dd/mm/yy");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField8);
        jTextField8.setBounds(190, 50, 200, 30);

        jLabel14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel14.setText("DOB");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(100, 60, 40, 14);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/reg1.jpeg"))); // NOI18N
        jPanel4.add(jLabel15);
        jLabel15.setBounds(-200, -16, 830, 810);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(5514, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 900, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

         item1=jComboBox1.getSelectedItem().toString();

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        frame1 f1=new frame1();
        f1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            
            Date thisdate;
        thisdate = new Date();
        SimpleDateFormat dateform=new SimpleDateFormat("dd/MM/YYY");
        System.out.println(dateform.format(thisdate));
        String d=dateform.format(thisdate);
        /* item1=jComboBox1.getSelectedItem().toString();
          item2=jComboBox1.getSelectedItem().toString();
           item3=jComboBox1.getSelectedItem().toString();
            item4=jComboBox1.getSelectedItem().toString();*/
            
        
        Statement st = null;
        String dept=null;
        int f=0;
        ResultSet rs;
        try {
            Connection con;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
                  con = DriverManager.getConnection("jdbc:derby://localhost:1527/javaproject","root","root123");
            st=con.createStatement();
            rs=st.executeQuery("select usn from STUDENT");
            while(rs.next())
            {
                if(rs.getString(1).equals(jTextField1.getText())  )
                {
                   f=1;
                    break;
                }
                
            }
            
         
        }       catch (ClassNotFoundException ex) {
                    Logger.getLogger(frame3.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(frame3.class.getName()).log(Level.SEVERE, null, ex);
                }
        if(jTextField1.getText().equals("")||jTextField2.getText().equals("")||jTextField3.getText().equals("")||jTextField4.getText().equals("")||jTextField5.getText().equals("")||jTextField6.getText().equals("")||jTextField7.getText().equals("")||flag==0)
        {
            System.out.println("e");
                    
            JOptionPane.showMessageDialog(null,"Please enter the details for all the fields");
        }
       
        else if(f==1)
        {
             JOptionPane.showMessageDialog(null,"USN already exists");
        
        }
        else if(jTextField3.getText().compareTo("16")<0 ||jTextField3.getText().compareTo("90")>0)
        {
                 JOptionPane.showMessageDialog(null,"Invalid age");
        }
        else if(flag==0)
        {
            
        }
        else if(f==1)
        {
            JOptionPane.showMessageDialog(null,"Usn already exists cannot continue");
        }
        
        else {
            String usn=jTextField1.getText(),name=jTextField2.getText(),fname=jTextField5.getText(),dat=jTextField8.getText(),admission_date=jTextField4.getText();
          int age;
          int fee=Integer.parseInt(jTextField6.getText());
          String contact=jTextField7.getText();
                age = Integer.parseInt(jTextField3.getText());
                try {
                    int r=st.executeUpdate("insert into STUDENT values('"+usn+"','"+name+"',"+age+",'"+item2+"','"+sex+"','"+item1+"','"+dat+"','I','"+contact+"','"+fname+"')");
                    int re=st.executeUpdate("insert into ADMISSION values('"+usn+"','"+item3+"','"+admission_date+"',"+fee+")");
                    rs=st.executeQuery("select CNO from COURSES where DNAME='"+item1+"'");
                    int a[]=new int[5];
                   int i=0;
                    while(rs.next())
                    {
                     a[i]=rs.getInt(1);
                     i++;
                    }
                    
                   
                    re=st.executeUpdate("insert into MARKS values("+a[0]+",'"+usn+"',0,0,0)");
                    re=st.executeUpdate("insert into MARKS values("+a[1]+",'"+usn+"',0,0,0)");

                    re=st.executeUpdate("insert into MARKS values("+a[2]+",'"+usn+"',0,0,0)");
           
                    re=st.executeUpdate("insert into MARKS values("+a[3]+",'"+usn+"',0,0,0)");
                   
                    re=st.executeUpdate("insert into MARKS values("+a[4]+",'"+usn+"',0,0,0)");
                     
                         re=st.executeUpdate("insert into ATTENDANCE values('"+usn+"','0%','0%','0%','0%','0%')");
                } catch (SQLException ex) {
                    Logger.getLogger(frame3.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
         
          
                       System.out.println(item1);
        
        setVisible(false);
        frame1 f1=new frame1();
        f1.setVisible(true);
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
String sex,item1,item2,item3,item4;
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        sex="male";
        flag=1;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
flag=1;
sex="female";
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
               char c=evt.getKeyChar();
               if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE)
               {
                   evt.consume();
                   //JOptionPane.showMessageDialog(null,"Invalid number");
               }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
               if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE)
               {
                   evt.consume();
                   //JOptionPane.showMessageDialog(null,"Invalid number");
               }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
               if(!(Character.isDigit(c)||c=='/')||(c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE)
               {
                   evt.consume();
                   //JOptionPane.showMessageDialog(null,"Invalid number");
               }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
             item2=jComboBox2.getSelectedItem().toString();        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
            item3=jComboBox3.getSelectedItem().toString();
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        item4=jComboBox4.getSelectedItem().toString();
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
         char c=evt.getKeyChar();
               if(!(Character.isDigit(c)||c=='/')||(c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE)
               {
                   evt.consume();
                   //JOptionPane.showMessageDialog(null,"Invalid number");
               }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
         char c=evt.getKeyChar();
               if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE)
               {
                   evt.consume();
                   //JOptionPane.showMessageDialog(null,"Invalid number");
               }      
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyTyped

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
            java.util.logging.Logger.getLogger(frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
