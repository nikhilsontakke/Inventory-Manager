/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanager;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.PrintWriter;
import static java.lang.System.exit;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nikhil
 */
public class save extends javax.swing.JFrame {

    /**
     * Creates new form manageProduct
     */
    String la;
    String lb;
    String lc;
    String loc;
    String loc1;
    
    public save() {
        save info=new save(la,lb,lc);
        info.setVisible(true);
    }
    
    public save(String a,String b,String c){
        la=a;
        lb=b;
        lc=c;
        initComponents();
        label.setVisible(false);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        

    }
    
    private void saveVendor(String loc,int x){
        try {
            if(x==0){
            loc="D:\\VIT\\SDP\\";
            }
            PrintWriter pw= new PrintWriter(new File(loc+"vendor_details.csv"));
            StringBuilder sb=new StringBuilder();
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/inventorymanager","root","nikhil");
            PreparedStatement ps=con.prepareStatement("SELECT * from vendor");
            ResultSet rs=ps.executeQuery();
            sb.append("Sr.no");
            sb.append(","); 
            sb.append("Name");
            sb.append(",");
            sb.append("Number");
            sb.append(",");
            sb.append("Email");
            sb.append(",");
            sb.append("Address");
            sb.append("\r\n");
            while(rs.next()){
             sb.append(rs.getString("id"));
             sb.append(","); 
             sb.append(rs.getString("name"));
             sb.append(",");
             sb.append(rs.getString("number"));
             sb.append(",");
             sb.append(rs.getString("email"));
             sb.append(",");
             sb.append(rs.getString("address"));
             sb.append("\r\n");
            }
            pw.write(sb.toString());
            pw.close();
            JOptionPane.showMessageDialog(this,"Vendor Data Saved into file succesfully");

       } catch (Exception e) {
        // TODO: handle exception
        JOptionPane.showMessageDialog(this,e);
       } 
    }
    
    private void saveProduct(String loc,int x){
        try {
            if(x==0){
            loc = "D:\\VIT\\SDP\\";
            }
            PrintWriter pw= new PrintWriter(new File(loc+"product_details.csv"));
            StringBuilder sb=new StringBuilder();
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/inventorymanager","root","nikhil");
            PreparedStatement ps=con.prepareStatement("SELECT * from product");
            ResultSet rs=ps.executeQuery();
            sb.append("Sr.no");
            sb.append(","); 
            sb.append("Product Name");
            sb.append(",");
            sb.append("Product code");
            sb.append(",");
            sb.append("Company");
            sb.append(",");
            sb.append("Quantity");
            sb.append("\r\n");
            while(rs.next()){
             sb.append(rs.getString("id"));
             sb.append(","); 
             sb.append(rs.getString("name"));
             sb.append(",");
             sb.append(rs.getString("productcode"));
             sb.append(",");
             sb.append(rs.getString("companyname"));
             sb.append(",");
             sb.append(rs.getString("quantity"));
             sb.append("\r\n");
            }
            pw.write(sb.toString());
            pw.close();
            JOptionPane.showMessageDialog(this,"Product Data Saved into file succesfully");

       } catch (Exception e) {
        // TODO: handle exception
        JOptionPane.showMessageDialog(this,e);
       } 
    }
    
    private void saveEmployee(String loc,int x){
        try {
            if(x==0){
            loc= "D:\\VIT\\SDP\\";
            }
            PrintWriter pw= new PrintWriter(new File(loc+"employee_details.csv"));
            StringBuilder sb=new StringBuilder();
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/inventorymanager","root","nikhil");
            PreparedStatement ps=con.prepareStatement("SELECT * from employees");
            ResultSet rs=ps.executeQuery();
            sb.append("Sr.no");
            sb.append(","); 
            sb.append("Employee Name");
            sb.append(",");
            sb.append("Employee Id");
            sb.append(",");
            sb.append("Category");
            sb.append(",");
            sb.append("Mobile no");
            sb.append("\r\n");
            while(rs.next()){
             sb.append(rs.getString("id"));
             sb.append(","); 
             sb.append(rs.getString("name"));
             sb.append(",");
             sb.append(rs.getString("employeeid"));
             sb.append(",");
             sb.append(rs.getString("category"));
             sb.append(",");
             sb.append(rs.getString("number"));
             sb.append("\r\n");
            }
            pw.write(sb.toString());
            pw.close();
            JOptionPane.showMessageDialog(this,"Employee Data Saved into file succesfully");

       } catch (Exception e) {
        // TODO: handle exception
        JOptionPane.showMessageDialog(this,e);
       } 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        location = new javax.swing.JComboBox<>();
        filename = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        l = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Products - Inventory Manager");
        setSize(new java.awt.Dimension(1280, 685));

        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 685));
        jPanel2.setLayout(null);

        location.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        location.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default Location", "Custom Location" }));
        location.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                locationItemStateChanged(evt);
            }
        });
        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });
        jPanel2.add(location);
        location.setBounds(590, 310, 270, 40);

        filename.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        filename.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendor Details", "Product Details", "Employee Details" }));
        filename.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filenameItemStateChanged(evt);
            }
        });
        jPanel2.add(filename);
        filename.setBounds(590, 240, 270, 40);

        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(550, 470, 180, 50);

        label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("Selected Location :");
        jPanel2.add(label);
        label.setBounds(450, 370, 230, 20);

        l.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        l.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(l);
        l.setBounds(450, 390, 380, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/2.png"))); // NOI18N
        jPanel2.add(background);
        background.setBounds(0, 0, 1280, 685);

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem1.setText("Login");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem7.setText("Logout");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem8.setText("Save Data");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem10.setText("Register New User");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Navigate");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem6.setText("Home");
        jMenuItem6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem2.setText("Manage Vendor");
        jMenuItem2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem3.setText("Manage Product");
        jMenuItem3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem4.setText("Manage Employee");
        jMenuItem4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem5.setText("About");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Tools");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem9.setText("Manage User Account");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        login info=new login();
        info.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to Log Out", "LOG OUT", dialogButton);
        if(dialogResult == 0) {
          exit(0);
        } else {
          System.out.println("No Option");
        } 
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        main info=new main(la,lb,lc);
        info.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        about info = new about(la,lb,lc);
        info.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        main info=new main(la,lb,lc);
        info.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        vendorManager info=new vendorManager(la,lb,lc);
        info.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        save info=new save(la,lb,lc);
        info.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        manageEmployee info=new manageEmployee(la,lb,lb);
        info.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        main info=new main(la,lb,lc);
        info.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        save info=new save(la,lb,lc);
        info.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        user info = new user(la,lb,lc);
        info.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void locationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_locationItemStateChanged
        // TODO add your handling code here:

        if("Custom Location".equals(location.getSelectedItem().toString())){
            label.setVisible(true);
            int r = 0;
            JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            j.showSaveDialog(null);
            if (r == JFileChooser.APPROVE_OPTION){
                l.setText(j.getSelectedFile().getAbsolutePath());
                loc = j.getSelectedFile().getAbsolutePath();
            }
            else
            l.setText("Please Select file");

        }
        else{
            label.setVisible(false);
            l.setText(" ");
        }
    }//GEN-LAST:event_locationItemStateChanged

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationActionPerformed

    private void filenameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filenameItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_filenameItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if("Default Location".equals(location.getSelectedItem().toString())){
            if("Vendor Details".equals(filename.getSelectedItem().toString())){
                saveVendor(loc,0);
            }
            else if("Product Details".equals(filename.getSelectedItem().toString())){
                saveProduct(loc,0);
            }
            else{
                saveEmployee(loc,0);
            }
        }
        else{
            label.setVisible(true);
            if("Vendor Details".equals(filename.getSelectedItem().toString())){
                saveVendor(loc,1);
            }
            else if("Product Details".equals(filename.getSelectedItem().toString())){
                saveProduct(loc,1);
            }
            else{
                saveEmployee(loc,1);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        register info = new register();
        info.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

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
            java.util.logging.Logger.getLogger(save.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(save.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(save.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(save.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new save().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> filename;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l;
    private javax.swing.JLabel label;
    private javax.swing.JComboBox<String> location;
    // End of variables declaration//GEN-END:variables
}
