/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelms;

import config.connectDB;
import config.passwordHasher;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Administrator
 */
public class addUsers extends javax.swing.JFrame {

    /**
     * Creates new form addUsers
     */
    public addUsers() {
        initComponents();
    }
   
   public String destination = "src/userimages"; 
    public File selectedFile;
    public String oldpath;
    public String path;

    

    public int FileExistenceChecker(String path1) {
        File file = new File(path1);
        String fileName = file.getName();
        Path filePath = Paths.get(destination, fileName);

        return Files.exists(filePath) ? 1 : 0;
    }
    
    public int getHeightFromWidth(String imagePath, int labelWidth) {
    if (imagePath == null || labelWidth <= 0) {
        return 100;  
    }

    ImageIcon icon = new ImageIcon(imagePath);
    int originalWidth = icon.getIconWidth();
    int originalHeight = icon.getIconHeight();

    return (int) ((double) labelWidth / originalWidth * originalHeight);
}

    
 // ✅ Improved method to handle both image paths and byte arrays
    public ImageIcon ResizeImage(String imagePath, byte[] pic, JLabel label) {
        ImageIcon myImage;

        if (imagePath != null && !imagePath.isEmpty()) {
            myImage = new ImageIcon(imagePath);
        } else if (pic != null) {
            myImage = new ImageIcon(pic);
        } else {
            return null;  // No image provided
        }

        int newHeight = getHeightFromWidth(imagePath, label.getWidth());

        java.awt.Image img = myImage.getImage();
        java.awt.Image newImg = img.getScaledInstance(label.getWidth(), newHeight, java.awt.Image.SCALE_SMOOTH);

        return new ImageIcon(newImg);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        un = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        usertype1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        firstname1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        select = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 204, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 0));
        jLabel10.setText("ify");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Room");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 31)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 51));
        jLabel12.setText("Welcome ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 51));
        jLabel13.setText("____");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 100, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 51));
        jLabel14.setText("If You Already add an account Please Sign In");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sing In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 110, 40));

        jLabel15.setText("Privacy Policy");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        jLabel16.setText("Terms & Conditions");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FINAL HMS/ff.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 100, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 560));

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add User?");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("____");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 100, 40));

        uid.setEnabled(false);
        uid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidActionPerformed(evt);
            }
        });
        jPanel2.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 390, 30));
        jPanel2.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 390, 30));
        jPanel2.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 390, 30));

        status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        jPanel2.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 390, 30));
        jPanel2.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 390, 30));
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 390, 30));

        jLabel2.setText("User ID:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel4.setText("Last Name:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel5.setText("Email:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel6.setText("User Status:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel7.setText("User Name:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel8.setText("Password:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        cancel.setBackground(new java.awt.Color(0, 153, 0));
        cancel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel2.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 120, -1));

        usertype1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usertype1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Receptionist" }));
        jPanel2.add(usertype1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 390, 30));

        jLabel17.setText("User Type:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        add.setBackground(new java.awt.Color(0, 153, 0));
        add.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add ");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 120, -1));

        update.setBackground(new java.awt.Color(0, 153, 0));
        update.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 120, -1));

        delete.setBackground(new java.awt.Color(0, 153, 0));
        delete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 130, -1));

        clear.setBackground(new java.awt.Color(0, 153, 0));
        clear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel2.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 120, -1));

        remove.setBackground(new java.awt.Color(0, 153, 0));
        remove.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        remove.setForeground(new java.awt.Color(255, 255, 255));
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel2.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 110, -1));

        firstname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname1ActionPerformed(evt);
            }
        });
        jPanel2.add(firstname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 390, 30));

        jLabel18.setText("First Name:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jPanel3.setLayout(null);
        jPanel3.add(image);
        image.setBounds(10, 20, 210, 160);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 230, 200));

        refresh.setBackground(new java.awt.Color(0, 153, 0));
        refresh.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel2.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 130, -1));

        select.setBackground(new java.awt.Color(0, 153, 0));
        select.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        select.setForeground(new java.awt.Color(255, 255, 255));
        select.setText("Select");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel2.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 110, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 680, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LOGIN l = new LOGIN();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void uidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uidActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
     user u = new user();
     u.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
String First_name = firstname1.getText().trim();
String Last_name = lastname.getText().trim();
String email = Email.getText().trim().toLowerCase();
String User_type = usertype1.getSelectedItem().toString().trim();
String user_name = un.getText().trim();
String Password = password.getText().trim();

connectDB connect = new connectDB();

// ✅ Make sure you define selectedFile properly
File selectedFile = new File("src/userimages");  // Update this with your image path

// 🔥 Validations
if (!selectedFile.exists() || !selectedFile.isFile()) {
    JOptionPane.showMessageDialog(null, "Please select a valid image!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (First_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter your First Name!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Last_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter your Last Name!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (email.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter an Email!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
    JOptionPane.showMessageDialog(null, "Please enter a valid Email Address!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (User_type.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please select a User Type!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (user_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Username!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Password.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Password!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Password.length() < 8) {
    JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!", "Error", JOptionPane.WARNING_MESSAGE);
} else {
    try {
        if (connect.fieldExists("account", "username", user_name)) {
            JOptionPane.showMessageDialog(null, "Username already taken!", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (connect.fieldExists("account", "email", email)) {
            JOptionPane.showMessageDialog(null, "Email already used!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String hashedPassword = passwordHasher.hashPassword(Password);

            String sql = "INSERT INTO account (firstname, lastname, username, email, usertype, password, status, images) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            // ✅ Improved image reading with proper handling
            byte[] imageData = null;
            try (FileInputStream fis = new FileInputStream(selectedFile)) {
                imageData = new byte[(int) selectedFile.length()];
                int bytesRead = fis.read(imageData);
                if (bytesRead != imageData.length) {
                    JOptionPane.showMessageDialog(null, "Failed to read the full image!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            try (Connection conn = connect.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setString(1, First_name);
                stmt.setString(2, Last_name);
                stmt.setString(3, user_name);
                stmt.setString(4, email);
                stmt.setString(5, User_type);
                stmt.setString(6, hashedPassword);
                stmt.setString(7, "Pending");
                stmt.setBytes(8, destination);  // Insert the image as BLOB

                int rowsInserted = stmt.executeUpdate();

                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "User added successfully with image!");

                    // Open login form and close current frame
                    new LOGIN().setVisible(true);

                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(un);
                    if (frame != null) {
                        frame.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Registration failed!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "File Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Unexpected Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
   if (firstname1.getText().isEmpty() || lastname.getText().isEmpty() || un.getText().isEmpty() || 
    Email.getText().isEmpty() || usertype1.getSelectedItem() == null || password.getText().isEmpty() || 
    status.getSelectedItem() == null || uid.getText().isEmpty()) {
    
    JOptionPane.showMessageDialog(null, "All Fields Are Required!");

} else if (password.getText().length() < 8) {
    JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!");
    password.setText("");
    
} else {
    connectDB cdb = new connectDB();
    try {
        try {
            Integer.parseInt(uid.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid User ID!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        boolean usernameExists = cdb.duplicateCheckExcludingCurrent("account", "username", un.getText(), "id", uid.getText());
        boolean emailExists = cdb.duplicateCheckExcludingCurrent("account", "email", Email.getText(), "id", uid.getText());

        if (usernameExists || emailExists) {
            JOptionPane.showMessageDialog(null, "Username or Email already exists for another user!", "Validation Error", JOptionPane.WARNING_MESSAGE);
        } else {
            int rowsUpdated = cdb.updateData(
                "UPDATE account SET firstname = ?, lastname = ?, username = ?, email = ?, usertype = ?, password = ?, status = ? WHERE id = ?",
                firstname1.getText(),
                lastname.getText(),
                un.getText(),
                Email.getText(),
                usertype1.getSelectedItem().toString(),
                password.getText(),
                status.getSelectedItem().toString(),
                uid.getText()
            );

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Account updated successfully!");
                
                this.dispose();  
                LOGIN loginForm = new LOGIN(); 
                loginForm.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Update failed! User ID not found.", "Update Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        cdb.closeConnection();
    }
}

    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        
        remove.setEnabled(false);
        select.setEnabled(true);
        image.setIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_removeActionPerformed

    private void firstname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname1ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
       
        JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/userimages/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            select.setEnabled(false);
                            remove.setEnabled(true);
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }

    }//GEN-LAST:event_selectActionPerformed

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
            java.util.logging.Logger.getLogger(addUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Email;
    public javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    public javax.swing.JTextField firstname1;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField lastname;
    public javax.swing.JPasswordField password;
    private javax.swing.JButton refresh;
    public javax.swing.JButton remove;
    public javax.swing.JButton select;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JTextField uid;
    public javax.swing.JTextField un;
    public javax.swing.JButton update;
    public javax.swing.JComboBox<String> usertype1;
    // End of variables declaration//GEN-END:variables
}
