/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Logic.ConnectionPostgres;
import Logic.PatientGenericState;
import java.util.ArrayList;
import javax.swing.JTable;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class ListOfPatients extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public ListOfPatients() {
        initComponents();
        getData();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btClose = new javax.swing.JToggleButton();
        btDelete = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btNewAnalysis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("List of Patients");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date of Analysis", "First Name", "Last Name", "Gender", "Date of Birth", "Weight", "Height"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btClose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btClose.setText("Close");
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        btDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btDelete.setText("Delete");
        btDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDeleteMouseClicked(evt);
            }
        });

        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btNewAnalysis.setText("New Analysis");
        btNewAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewAnalysisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btClose)
                .addGap(213, 213, 213)
                .addComponent(btDelete)
                .addGap(81, 81, 81)
                .addComponent(btUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btNewAnalysis)
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClose)
                    .addComponent(btDelete)
                    .addComponent(btUpdate)
                    .addComponent(btNewAnalysis))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//This function closes the current window and opens back the Menu form
    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        Menu rgf = new Menu();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btCloseActionPerformed

    //Function that deletes the data of a clicked row, which belongs to a 
    //specific patient, and refreshes the table
    private void btDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeleteMouseClicked
        deletePatient();
    }//GEN-LAST:event_btDeleteMouseClicked

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        updatePatient();
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btNewAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewAnalysisActionPerformed
        startNewAnalysis();
    }//GEN-LAST:event_btNewAnalysisActionPerformed

    //Function that "constructs" the table, by getting all data stored in DB 
    public void getData() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        modelo.setRowCount(0);
        String datoPaciente;
        String[] datosSplit;
        ConnectionPostgres newConnection = new ConnectionPostgres();
        ArrayList<String> datos = newConnection.recoverData();
        Iterator it = datos.iterator();
        while (it.hasNext()) {
            datoPaciente = it.next().toString();
            datosSplit = datoPaciente.split(",");

            modelo.addRow(new Object[]{datosSplit[0], datosSplit[1], datosSplit[2], datosSplit[3], datosSplit[4], datosSplit[5], datosSplit[6], datosSplit[7]});
        }
    }

    /*
    Funcion que elimina a un paciente de la base de datos
    */
    public void deletePatient() {
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            String info = "Please select a patient first!";
            JOptionPane.showMessageDialog(null, info, "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String conf = "Are you sure to delete patient " + jTable1.getModel().getValueAt(row, 2).toString() + " " + jTable1.getModel().getValueAt(row, 3).toString() + "?";
            int resp = JOptionPane.showConfirmDialog(null, conf, "Warning!", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                String cedula = jTable1.getModel().getValueAt(row, 0).toString();
                ConnectionPostgres newConnection = new ConnectionPostgres();
                newConnection.deleteRegister(cedula);
                getData();
            }
        }
    }

    /*
    Funcion que actualiza la informacion de un paciente de la base de datos
    */
    public void updatePatient() {
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            String info = "Please select a patient first!";
            JOptionPane.showMessageDialog(null, info, "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String cedula = jTable1.getModel().getValueAt(row, 0).toString();
            PatientGenericState updPat = new PatientGenericState(cedula);
            this.dispose();
        }
    }

    /*
    Funcion que llama al ambiente de nuevo analisis
    */
    public void startNewAnalysis() {
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            String info = "Please select a patient first!";
            JOptionPane.showMessageDialog(null, info, "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String id = jTable1.getModel().getValueAt(row, 0).toString();
            String firstName = jTable1.getModel().getValueAt(row, 2).toString();
            String lastName = jTable1.getModel().getValueAt(row, 3).toString();
            String gender = jTable1.getModel().getValueAt(row, 4).toString();
            String birdth = jTable1.getModel().getValueAt(row, 5).toString();
            String weigth = jTable1.getModel().getValueAt(row, 7).toString();
            String height = jTable1.getModel().getValueAt(row, 6).toString();

            ShowInformation shInf = new ShowInformation();
            shInf.setValues(id, firstName, lastName, gender, birdth, weigth, height);
            shInf.createPane();
            shInf.setVisible(true);
            shInf.pack();
            shInf.setLocationRelativeTo(null);
            shInf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }

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
            java.util.logging.Logger.getLogger(ListOfPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListOfPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListOfPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListOfPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListOfPatients().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btClose;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btNewAnalysis;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
