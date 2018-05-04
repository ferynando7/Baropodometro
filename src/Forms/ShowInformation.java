/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Logic.ConnectionPostgres;
import java.awt.BorderLayout;
import java.awt.Color;
/**
 *
 * @author cbust
 */
public class ShowInformation extends javax.swing.JFrame {

    /**
     * Creates new form ShowInformation
     */
    private final int width = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    private final int heigth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    private String id, firstName, lastName, gender, birdth, weigth, height;

    /*
    Creates new ShowInformation (Builder of the class).
    */
    public ShowInformation() { 
        initComponents();
        this.setLocation(width / 2 - this.getWidth() / 2, 0);
    }

    /*
    Method that sets the values of each attribute of the corresponding patient.
    */
    public void setValues(String id, String firstName, String lastName,
            String gender, String birdth, String weigth, String height) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birdth = birdth;
        this.weigth = weigth;
        this.height = height;
    }

    /*
    Meyhod that allocates the data of the corresponding patient in a panel, so
    that, the doctor can see each detail of the patient together with the date
    of the last analysis.
    */
    public ShowPersonalData setValuesPane() {

        ShowPersonalData pane = new ShowPersonalData();
        ConnectionPostgres con = new ConnectionPostgres();
        pane.textID.setText(id);
        pane.textName.setText(firstName);
        pane.textLastName.setText(lastName);
        pane.textBirdth.setText(birdth);
        pane.textHeigth.setText(height);
        pane.textWidth.setText(weigth);
        pane.textGender.setText(gender);
        pane.textAnalysis.setText(con.getLastAnalysis(id));
        pane.setSize(jPanel2.getWidth(), jPanel2.getHeight());
        pane.setLocation(0, 0);
        pane.setBackground(new Color(204, 255, 204));
        jPanel2.setBackground(new Color(204, 255, 204));

        return pane;
    }

    /*
    Method that creates the panel where all the information of the corresponding
    patient will be shown.
    */
    public void createPane() {
        jTextField3.setText("PATIENT " + firstName + " " + lastName);
        ShowPersonalData pane = setValuesPane();
        jPanel2.removeAll();
        jPanel2.add(pane, BorderLayout.CENTER);
        jPanel2.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        panelButtons = new javax.swing.JPanel();
        buttonInformation = new javax.swing.JButton();
        buttonDiagnosis = new javax.swing.JButton();
        buttonNewDiagnostic = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("PATIENT INFORMATION");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        panelButtons.setBackground(new java.awt.Color(204, 255, 204));

        buttonInformation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonInformation.setText("PERSONAL INFORMATION");
        buttonInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInformationActionPerformed(evt);
            }
        });

        buttonDiagnosis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonDiagnosis.setText("DIAGNOSIS");
        buttonDiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDiagnosisActionPerformed(evt);
            }
        });

        buttonNewDiagnostic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonNewDiagnostic.setText("NEW DIAGNOSIS");
        buttonNewDiagnostic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewDiagnosticActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addComponent(buttonDiagnosis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonNewDiagnostic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsLayout.createSequentialGroup()
                .addComponent(buttonInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(buttonDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(buttonNewDiagnostic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 0, 0));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("PATIENT X");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /*
    Method that allows the access to the information of the corresponding
    patient each time a button is clicked.
    */
    private void buttonInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInformationActionPerformed
        ShowPersonalData pane = setValuesPane();
        jPanel2.removeAll();
        jPanel2.add(pane, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_buttonInformationActionPerformed

    /*
    Method that allows the access to the previous diagnosis of the corresponding
    patient each time a button is clicked.
    */
    private void buttonDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDiagnosisActionPerformed
        jPanel2.removeAll();
        Diagnostics diagnosis = new Diagnostics(id);
        diagnosis.setSize(jPanel2.getWidth(), jPanel2.getHeight());
        diagnosis.setLocation(0, 0);
        jPanel2.add(diagnosis, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_buttonDiagnosisActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    /*
    Method that allows the access to the window of register a new
    patient each time a button is clicked.
    */
    private void buttonNewDiagnosticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewDiagnosticActionPerformed
        AddNewDiagnostic addD = new AddNewDiagnostic(id);
        addD.setLocation(width / 2 - addD.getWidth() / 2, heigth / 2 - addD.getHeight() / 2);
        addD.setVisible(true);
    }//GEN-LAST:event_buttonNewDiagnosticActionPerformed

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
            java.util.logging.Logger.getLogger(ShowInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDiagnosis;
    private javax.swing.JButton buttonInformation;
    private javax.swing.JButton buttonNewDiagnostic;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel panelButtons;
    // End of variables declaration//GEN-END:variables
}
