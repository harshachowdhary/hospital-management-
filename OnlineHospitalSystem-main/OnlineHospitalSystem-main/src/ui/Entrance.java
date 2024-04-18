/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import dao.DoctorDao;
import dao.PatientDao;
import static java.awt.Image.SCALE_DEFAULT;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import ui.patient.AddPatientJFrame;

/**
 *
 * @author Harsh
 */
public class Entrance extends javax.swing.JFrame {

    /**
     * Creates new form Entrance
     */
    
//    public void theme(){
//        SwingTheme swingTheme=new SwingTheme();
//        swingTheme.init();
//        
//    }
    static public ImageIcon logo = new ImageIcon("src//image//ImageLogo.png");

    public Entrance() {
        initComponents();  
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
        jLabelSlogan = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxUserType = new javax.swing.JComboBox<>();
        jTextFieldAccount = new javax.swing.JTextField();
        jButtonlogin = new javax.swing.JButton();
        jLabelSignUP = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OnlineHospitalSystem");
        setIconImage(logo.getImage());
        setLocation(new java.awt.Point(300, 150));

        jPanel2.setBackground(new java.awt.Color(149, 177, 182));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabelSlogan.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabelSlogan.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSlogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSlogan.setText("SERVE ANY TIME ");
        jPanel2.add(jLabelSlogan);
        jLabelSlogan.setBounds(120, 540, 250, 50);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("User type:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 300, 93, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("User ID: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 360, 93, 17);

        jComboBoxUserType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBoxUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Doctors", "Hospital Admins", "Community Admin", "System Admin" }));
        jComboBoxUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUserTypeActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxUserType);
        jComboBoxUserType.setBounds(210, 300, 190, 23);

        jTextFieldAccount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(jTextFieldAccount);
        jTextFieldAccount.setBounds(210, 360, 190, 23);

        jButtonlogin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonlogin.setText("Login");
        jButtonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonlogin);
        jButtonlogin.setBounds(169, 445, 185, 40);

        jLabelSignUP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelSignUP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSignUP.setText("Don't have account? Sign up here!");
        jLabelSignUP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSignUPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSignUPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSignUPMouseExited(evt);
            }
        });
        jPanel1.add(jLabelSignUP);
        jLabelSignUP.setBounds(125, 514, 240, 17);
        jPanel1.add(jLabelLogo);
        jLabelLogo.setBounds(80, 90, 340, 70);
        ImageIcon logoHospital = new ImageIcon("src//image//Logo.png");
        logoHospital.setImage(logoHospital.getImage().getScaledInstance(jLabelLogo.getWidth(),jLabelLogo.getHeight(),SCALE_DEFAULT));
        jLabelLogo.setIcon(logoHospital);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(530, 10, 460, 580);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 530, 580);
        ImageIcon bgDoctor = new ImageIcon("src//image//doctors.png");
        bgDoctor.setImage(bgDoctor.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),SCALE_DEFAULT));
        jLabel1.setIcon(bgDoctor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonloginActionPerformed
        try {
            // TODO add your handling code here:
            if(jTextFieldAccount.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Please input your id!");
                return;
            }
            
            int userTypeIndex = jComboBoxUserType.getSelectedIndex();  
            
            switch (jComboBoxUserType.getSelectedIndex()) {
                case 0: 
                    PatientDao pDao = new PatientDao();
                    if(pDao.isExist(Integer.parseInt(jTextFieldAccount.getText()))) break;
                    else  JOptionPane.showMessageDialog(rootPane, "Account doesn't exist!");
                            
                    
                    return;
                case 1:
                    DoctorDao dDao = new DoctorDao();
                    if(dDao.isExist(Integer.parseInt(jTextFieldAccount.getText()))) break;
                    else  JOptionPane.showMessageDialog(rootPane, "Account doesn't exist!");
                    
                    return;
                case 2:
                    
                   
                   break;  
                case 3:
                       
                    break; 
                 case 4:
                     int adminId = Integer.parseInt(jTextFieldAccount.getText());
                    if (adminId != 123) {
                        JOptionPane.showMessageDialog(rootPane, "Is not a System Admin!");
                        return;
                    }
                default:
                    break;
                    
            }
            
            
            MainMenu menu = new MainMenu();
            menu.MainMenu(jComboBoxUserType.getSelectedIndex(),Integer.parseInt(jTextFieldAccount.getText()));
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(Entrance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonloginActionPerformed

    private void jLabelSignUPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignUPMouseEntered
        // TODO add your handling code here:
        jLabelSignUP.setForeground(new java.awt.Color(51,51,255));
    }//GEN-LAST:event_jLabelSignUPMouseEntered

    private void jLabelSignUPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignUPMouseExited
        // TODO add your handling code here:
        jLabelSignUP.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_jLabelSignUPMouseExited

    private void jLabelSignUPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignUPMouseClicked
        // TODO add your handling code here:
        AddPatientJFrame add = new AddPatientJFrame();
        add.setVisible(true);
    }//GEN-LAST:event_jLabelSignUPMouseClicked

    private void jComboBoxUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUserTypeActionPerformed

    /**     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        /* Set the Nimbus look and feel */
         try{
             UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
             }catch(Exception e){
             System.out.println("Error Theme");
             e.printStackTrace();
             }
        // /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrance().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonlogin;
    private javax.swing.JComboBox<String> jComboBoxUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelSignUP;
    private javax.swing.JLabel jLabelSlogan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldAccount;
    // End of variables declaration//GEN-END:variables
}
