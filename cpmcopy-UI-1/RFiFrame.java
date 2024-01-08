/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package de.cprfi.rfi.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ProcessBuilder.Redirect;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.concurrent.ExecutorService;

/**
 *
 * @author rfi
 */
public class RFiFrame extends javax.swing.JFrame {
private boolean isWindows;

    /**
     * Creates new form RFiFrame
     */
    public RFiFrame() {
        initComponents();
        isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jButtonRun = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonOpenResult = new javax.swing.JButton();
        jTextFieldPath = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxEncrypt = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldInput = new javax.swing.JTextField();
        jTextFieldOutput = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaOutput = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jTextFieldAuthor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldSubject = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTitle = new javax.swing.JTextField();
        jTextFieldKeywords = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldOwnerPwd = new javax.swing.JTextField();
        jTextFieldUserPwd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCheckBoxUserPwd = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemHelpAbout = new javax.swing.JMenuItem();

        fileChooser.setApproveButtonText("Open");
        fileChooser.getAccessibleContext().setAccessibleName("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Run cpmcopy");

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName("Attributes"); // NOI18N

        jButtonRun.setText("Run");
        jButtonRun.setToolTipText("Run cpmcopy commandline as defined");
        jButtonRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRunActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.setToolTipText("Stop all activities and exit the program.");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonOpenResult.setText("Open Result");
        jButtonOpenResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonOpenResult)
                .addGap(18, 18, 18)
                .addComponent(jButtonRun, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRun)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonOpenResult))
                .addGap(17, 17, 17))
        );

        jTextFieldPath.setText("cpmcopy.exe");
        jTextFieldPath.setToolTipText("cpmcopy.exe is OK for a windows machine when the Compart Mill \"/bin\" directory is contained in the global Path environment variable.");
        jTextFieldPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPathActionPerformed(evt);
            }
        });

        jLabel2.setText("Cpmcopy Path:");
        jLabel2.setToolTipText("");

        jCheckBoxEncrypt.setText("Encrypt AES 128 (PDF only)");

        jLabel3.setText("Input File:");

        jLabel4.setText("Output File:");

        jTextFieldInput.setText("c:\\temp\\electricblankets.afp");
        jTextFieldInput.setToolTipText("Enter or choose the input file(s)");
        jTextFieldInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInputActionPerformed(evt);
            }
        });

        jTextFieldOutput.setText("c:\\temp\\electricblankets.pdf");
        jTextFieldOutput.setToolTipText("Enter or choose the output file(s) - use the file extension to do a conversion");

        jButton3.setText("...");
        jButton3.setActionCommand("FileChooseInput");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("...");
        jButton4.setActionCommand("FileChooseOutput");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextAreaOutput.setEditable(false);
        jTextAreaOutput.setColumns(20);
        jTextAreaOutput.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jTextAreaOutput.setRows(5);
        jTextAreaOutput.setToolTipText("Output of comcopy is collected here");
        jScrollPane1.setViewportView(jTextAreaOutput);

        jButton5.setText("...");
        jButton5.setActionCommand("FileChoosePath");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setText("Author:");

        jLabel6.setText("Subject:");

        jLabel7.setText("Title:");

        jLabel8.setText("Keywords:");

        jLabel1.setText("Owner Pwd:");

        jTextFieldOwnerPwd.setToolTipText("Enter an owner password for the created PDF file");

        jLabel9.setText("User Pwd:");

        jCheckBoxUserPwd.setText("Need a password to open (user pwd)");
        jCheckBoxUserPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUserPwdActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItemHelpAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemHelpAbout.setText("About");
        jMenuItemHelpAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHelpAboutActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemHelpAbout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldOwnerPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldInput)
                                    .addComponent(jTextFieldOutput)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBoxEncrypt)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextFieldAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                                                .addComponent(jTextFieldSubject)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(48, 48, 48)
                                                .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel9))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCheckBoxUserPwd)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextFieldUserPwd)
                                                        .addComponent(jTextFieldKeywords, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(jButton4)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldKeywords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxEncrypt)
                    .addComponent(jCheckBoxUserPwd))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldOwnerPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUserPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextFieldInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInputActionPerformed

    private void jButtonRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRunActionPerformed
        Boolean startRun = true;    // set to false if something went wrong and cpmcopy should not be started
        
        ProcessBuilder processBuilder = new ProcessBuilder();
        String mcopyCmd = jTextFieldPath.getText() + " -i \"" + jTextFieldInput.getText() + "\" -o \"" + jTextFieldOutput.getText() + "\"";
        if (!jTextFieldAuthor.getText().equals("")) {
            mcopyCmd = mcopyCmd + (" -author \"" + jTextFieldAuthor.getText() + "\"");
        }
        if (!jTextFieldTitle.getText().equals("")) {
            mcopyCmd = mcopyCmd + (" -title \"" + jTextFieldTitle.getText() + "\"");
        }
        if (!jTextFieldSubject.getText().equals("")) {
            mcopyCmd = mcopyCmd + (" -subject \"" + jTextFieldSubject.getText() + "\"");
        }        
        if (!jTextFieldKeywords.getText().equals("")) {
            mcopyCmd = mcopyCmd + (" -keywords \"" + jTextFieldKeywords.getText() + "\"");
        }
        if (jCheckBoxEncrypt.isSelected()) {
            if (!jTextFieldOwnerPwd.getText().equals("")) {
                // also works: 256 Bit AES (but PDF =>9)
                // mcopyCmd = mcopyCmd + (" -pwo \"" + jTextFieldOwnerPwd.getText() +  "\" -pdf.nochange -keylength 256 -pdf.encryption.algorithm AES");   
                mcopyCmd = mcopyCmd + (" -pwo \"" + jTextFieldOwnerPwd.getText() +  "\" -pdf.nochange -keylength 128 -pdf.encryption.algorithm AES");   
            } else {
                JOptionPane.showMessageDialog(this, "Please provide an owner password!", "Warning", JOptionPane.WARNING_MESSAGE);
                jTextFieldOwnerPwd.requestFocusInWindow();
                startRun = false; // do not start the cpmcopy command
            }
        }
        if (jCheckBoxUserPwd.isSelected()) {
            if (!jTextFieldUserPwd.getText().equals("")) {
                mcopyCmd = mcopyCmd + (" -pwu \"" + jTextFieldUserPwd.getText() +  "\"");
            } else {
              JOptionPane.showMessageDialog(this, "Please provide a user password!", "Warning", JOptionPane.WARNING_MESSAGE);
              jTextFieldUserPwd.requestFocusInWindow();
              startRun = false; // do not start the cpmcopy command
            }
        }

        if (startRun) { // start the cpmcopy command only if everything was OK
            if (isWindows) {
               processBuilder.command("cmd.exe", "/c", mcopyCmd);
               // processBuilder.command(jTextFieldPath.getText() + " -i " + jTextFieldInput.getText() + " -o " + jTextFieldOutput.getText());
            } else {
                processBuilder.command("sh", "-c", mcopyCmd);
            }
            jTextAreaOutput.append("Running command '" + mcopyCmd + "' on " + System.getProperty("os.name") + "\n");
            jTextAreaOutput.update(jTextAreaOutput.getGraphics());      // refresh the text area to see the results
            jTextAreaOutput.setCaretPosition(jTextAreaOutput.getText().length()-1);  // keep scrolling down

            try {
                    //processBuilder.directory(new File("c:\\temp\\"));   // set working directory (for mcopy.log)
                    processBuilder.redirectErrorStream(true);          // also catch stderr to avoid waiting forever (pgm hangs)
                    Process process = processBuilder.start();
                    StringBuilder output = new StringBuilder();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                    String line;
                    while ((line = reader.readLine()) != null) {
                            output.append(line + "\n");
                            System.out.println("line: " + line);
                            jTextAreaOutput.append(line +"\n");
                            jTextAreaOutput.update(jTextAreaOutput.getGraphics());      // refresh the text area to see the results
                            jTextAreaOutput.setCaretPosition(jTextAreaOutput.getText().length()-1);  // keep scrolling down
                    }

                    int exitVal = process.waitFor();
                    if (exitVal == 0) {
                            //JOptionPane.showMessageDialog(this, output);
                            //System.out.println(output);
                    } else {
                            //JOptionPane.showMessageDialog(this, output, "Exit Code" + exitVal, JOptionPane.INFORMATION_MESSAGE);
                    }

            } catch (IOException e) {
                    e.printStackTrace();
            } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_jButtonRunActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int returnval = fileChooser.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            jTextFieldInput.setText(file.getAbsolutePath());
        /* } else {
            JOptionPane.showMessageDialog(this, "File Chooser cancelled by user.");
        */
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int returnval = fileChooser.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            jTextFieldPath.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int returnval = fileChooser.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            jTextFieldOutput.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextFieldPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPathActionPerformed

    private void jMenuItemHelpAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHelpAboutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Very simple Java application to call Compart cpmcopy on the command line by Reinhard Fischer.", "Reinhard Fischer's cpmcopy ui", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItemHelpAboutActionPerformed

    private void jButtonOpenResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenResultActionPerformed
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (isWindows) {
                processBuilder.command("cmd.exe", "/c", jTextFieldOutput.getText());
            } else {
                processBuilder.command("sh", "-c", jTextFieldOutput.getText());
            }
            jTextAreaOutput.append("Running command '" + jTextFieldOutput.getText() + "' on " + System.getProperty("os.name") + "\n");
            jTextAreaOutput.update(jTextAreaOutput.getGraphics());      // refresh the text area to see the results
            jTextAreaOutput.setCaretPosition(jTextAreaOutput.getText().length()-1);  // keep scrolling down

            try {
                //processBuilder.directory(new File("c:\\temp\\"));   // set working directory (for mcopy.log)
                processBuilder.redirectErrorStream(true);          // also catch stderr to avoid waiting forever (pgm hangs)
                Process process = processBuilder.start();
                StringBuilder output = new StringBuilder();
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                        output.append(line + "\n");
                        System.out.println("line: " + line);
                        jTextAreaOutput.append(line +"\n");
                        jTextAreaOutput.update(jTextAreaOutput.getGraphics());      // refresh the text area to see the results
                        jTextAreaOutput.setCaretPosition(jTextAreaOutput.getText().length()-1);  // keep scrolling down
                }
                int exitVal = process.waitFor();
                
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }//GEN-LAST:event_jButtonOpenResultActionPerformed

    private void jCheckBoxUserPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUserPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxUserPwdActionPerformed

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
            java.util.logging.Logger.getLogger(RFiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RFiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RFiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RFiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RFiFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOpenResult;
    private javax.swing.JButton jButtonRun;
    private javax.swing.JCheckBox jCheckBoxEncrypt;
    private javax.swing.JCheckBox jCheckBoxUserPwd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemHelpAbout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaOutput;
    private javax.swing.JTextField jTextFieldAuthor;
    private javax.swing.JTextField jTextFieldInput;
    private javax.swing.JTextField jTextFieldKeywords;
    private javax.swing.JTextField jTextFieldOutput;
    private javax.swing.JTextField jTextFieldOwnerPwd;
    private javax.swing.JTextField jTextFieldPath;
    private javax.swing.JTextField jTextFieldSubject;
    private javax.swing.JTextField jTextFieldTitle;
    private javax.swing.JTextField jTextFieldUserPwd;
    // End of variables declaration//GEN-END:variables
}
