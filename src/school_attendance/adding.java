package school_attendance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.UIManager;

import static school_attendance.School_attendance.dataWrite;
import static school_attendance.attendance_ui.detid;



public class adding extends javax.swing.JFrame {
    
    int sltd ;
    int y = 0 ;
    int m = 0 ;
    int d = 0 ;
    
    public adding() {
        
        initComponents();
        setSize(400, 513);
        setLocation(760, 150);
        txtn.requestFocus();
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtn = new javax.swing.JTextField();
        doby = new javax.swing.JTextField();
        txtp = new javax.swing.JTextField();
        txtadd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        nid = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        dobm = new javax.swing.JTextField();
        dobd = new javax.swing.JTextField();
        cmb = new javax.swing.JComboBox<>();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtn.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnActionPerformed(evt);
            }
        });
        txtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnKeyPressed(evt);
            }
        });
        getContentPane().add(txtn);
        txtn.setBounds(155, 31, 207, 30);

        doby.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        doby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobyActionPerformed(evt);
            }
        });
        doby.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dobyKeyTyped(evt);
            }
        });
        getContentPane().add(doby);
        doby.setBounds(155, 94, 90, 30);

        txtp.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpActionPerformed(evt);
            }
        });
        getContentPane().add(txtp);
        txtp.setBounds(155, 223, 207, 30);

        txtadd.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddActionPerformed(evt);
            }
        });
        getContentPane().add(txtadd);
        txtadd.setBounds(155, 155, 207, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(34, 28, 82, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("DOB");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(34, 91, 82, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Address");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(34, 155, 82, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Phone");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(34, 220, 82, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(34, 282, 82, 31);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jButton2.setBackground(new java.awt.Color(0, 191, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nid.setBackground(new java.awt.Color(0, 0, 102));
        nid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nid.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(nid, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 360, 400, 120);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        dobm.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        dobm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobmActionPerformed(evt);
            }
        });
        dobm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dobmKeyTyped(evt);
            }
        });

        dobd.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        dobd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobdActionPerformed(evt);
            }
        });
        dobd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dobdKeyTyped(evt);
            }
        });

        cmb.setEditable(true);
        cmb.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dobm, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dobd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobm))
                .addGap(157, 157, 157)
                .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dobyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobyActionPerformed
       
    }//GEN-LAST:event_dobyActionPerformed

    private void txtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpActionPerformed
        
    }//GEN-LAST:event_txtpActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        new attendance_ui().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       String date = doby.getText()+"-"+dobm.getText()+"-"+dobd.getText();
       String name = txtn.getText();
       String add = txtadd.getText();
       String phn = txtp.getText();
       sltd = cmb.getSelectedIndex();
       
       String gen = null;
       
            if(sltd == 1){
                
                gen = "Male";
                
            }
            
            
            if(sltd == 2){
                
                gen = "Female";
            
            }
                
        if(gen == null){
            
            new error("Error","Gender is not choosen").setVisible(true);
        
        } 
        
        else {
            
            dataWrite("INSERT INTO student_details(name, DOB, address, phone, gender) VALUES('"+name+"', '"+date+"', '"+add+"', '"+phn+"', '"+gen+"');");
        
            System.out.println("INSERT INTO student_details(name, DOB, address, phone, gender) VALUES('"+name+"', '"+date+"', '"+add+"', '"+phn+"', '"+gen+"');");
            
            Connection conn = null ;
            
            try{
                
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","glide33211");
                java.sql.Statement stmt = (java.sql.Statement) conn.createStatement();
                
                ResultSet rs = stmt.executeQuery("SELECT id FROM student_details WHERE name = '"+txtn.getText()+"';");
                
                rs.next();
                int id = rs.getInt("id");
                detid(id);
                
                System.out.print("New ID Added To List"+id);
                nid.setText("New ID:"+String.valueOf(id));
            
               
      
            }catch(SQLException e){
             
                System.out.println("Exception Happend " + e.getMessage());
                new error("Data Not Saved",e.getMessage()).setVisible(true);
            
            }  
            
       }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dobmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobmActionPerformed

    }//GEN-LAST:event_dobmActionPerformed

    private void dobdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobdActionPerformed

    }//GEN-LAST:event_dobdActionPerformed

    private void dobyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobyKeyTyped

        y ++ ;
        
        if (y == 4)
            dobm.requestFocus();
        
    }//GEN-LAST:event_dobyKeyTyped

    private void dobmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobmKeyTyped

        m ++ ;
        
        if (m == 2)
            dobd.requestFocus();
        
    }//GEN-LAST:event_dobmKeyTyped

    private void dobdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobdKeyTyped

        d ++ ;
        
        if (d == 2)
            txtadd.requestFocus();
        
    }//GEN-LAST:event_dobdKeyTyped

    private void txtaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddActionPerformed

        txtp.requestFocus();
        
    }//GEN-LAST:event_txtaddActionPerformed

    private void txtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnKeyPressed

    }//GEN-LAST:event_txtnKeyPressed

    private void txtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnActionPerformed

        doby.requestFocus();
        
    }//GEN-LAST:event_txtnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adding().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb;
    private javax.swing.JTextField dobd;
    private javax.swing.JTextField dobm;
    private javax.swing.JTextField doby;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nid;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtn;
    private javax.swing.JTextField txtp;
    // End of variables declaration//GEN-END:variables
}
