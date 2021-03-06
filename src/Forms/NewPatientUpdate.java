/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Logic.ConnectionPostgres;
import Logic.DataTypesValidation;
import javax.swing.JFrame;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import Logic.ErrorMessage;
import Logic.PatientForm;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class NewPatientUpdate extends javax.swing.JFrame implements PatientForm{

    public String patientID;
    private final DataTypesValidation validate = new DataTypesValidation();
    private final ErrorMessage errors = new ErrorMessage();
    
    
    public NewPatientUpdate(String patientID){
        initComponents();      
        this.patientID = patientID;
        lbScreenTitle.setText("Update Patient");
        getPatientData();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbScreenTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        FName = new javax.swing.JTextField();
        LName = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        Weight = new javax.swing.JTextField();
        Height = new javax.swing.JTextField();
        CancelButton = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        cbGender = new javax.swing.JComboBox<>();
        jdcFecNac = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        lbScreenTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbScreenTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbScreenTitle.setText("Create New Patient");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(lbScreenTitle)
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbScreenTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Date of Birth");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Weight (Kg)");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Height (cm)");

        FName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        LName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Weight.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Height.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        CancelButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.setActionCommand("cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        btSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));

        jdcFecNac.setDateFormatString("yyyy-MM-dd");
        jdcFecNac.setName("jdcFecNac"); // NOI18N
        ((JTextFieldDateEditor)jdcFecNac.getDateEditor()).setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LName, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(FName)
                            .addComponent(ID)
                            .addComponent(cbGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Weight)
                            .addComponent(Height, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jdcFecNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(CancelButton)
                        .addGap(80, 80, 80)
                        .addComponent(btSave)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel6)
                        .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdcFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(Height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbGender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSave)
                    .addComponent(CancelButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Function that closes the current window and opens the Menu form
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        cancelRegister();

    }//GEN-LAST:event_cancelButtonActionPerformed

    /*
    Funcion que recupera los datos de un paciente y los coloca en los correspondientes widgets
    */
    void getPatientData(){
        ConnectionPostgres newConnection = new ConnectionPostgres();
        String patientData = newConnection.recoverPatient(patientID);
        String[] datosSplit;
        datosSplit = patientData.split(",");
        ID.setText(datosSplit[0]);
        FName.setText(datosSplit[1]);
        LName.setText(datosSplit[2]);
        cbGender.setSelectedItem(datosSplit[3]);
        Date dateValue = null;
        try {
            //        java.util.Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateValue);
            jdcFecNac.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(datosSplit[4])); 
        } catch (ParseException ex) {
            Logger.getLogger(NewPatientUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        Height.setText(datosSplit[5]);
        Weight.setText(datosSplit[6]);
        
        
        
    }

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
       savePatient();
    }//GEN-LAST:event_btSaveActionPerformed

    /*
    Funcion que cancela la actualizacin y retorna a la pantalla anterior
    */
    @Override
    public void cancelRegister() {
        ListOfPatients reg = new ListOfPatients();
        reg.setVisible(true);
        reg.pack();
        reg.setLocationRelativeTo(null);
        reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();    }

    /*
    Funcion que guarda los datos del paciente
    */
    @Override
    public void savePatient() {
        String cedula = getTextID();
        if (cedula.contains("Exception")) return;
        
        String nombre = getTextFName();
        if (nombre.contains("Exception")) return;

        String apellido = getTextLName();
        if (apellido.contains("Exception")) return;
        
        String genero = cbGender.getSelectedItem().toString();
        
        String fechNac;
        try{
            fechNac= validate.validateDate(DateFormat.getDateInstance().format(jdcFecNac.getDate()));
        }catch (Exception e){
            fechNac = validate.validateDate("");
            errors.codeSwitch(fechNac);
            return;
        }
        
        String altura = getTextHeight();
        if (altura.contains("Exception")) return;

        String peso = getTextWeight();
        if (peso.contains("Exception")) return;

        String values = "'" + cedula +  "','" + nombre + "','" + apellido + "','" + genero + "','" + fechNac + "'," + altura + "," + peso + ", ' ' , ' '";

        ConnectionPostgres newConnection = new ConnectionPostgres();
        System.out.println(values);

        newConnection.updateData(values);
        ListOfPatients reg = new ListOfPatients();
        reg.setVisible(true);
        reg.pack();
        reg.setLocationRelativeTo(null);
        reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();   
    }
    


    
    //Function that gets the string stored in ID textbox and validates it
   public String getTextID(){
        String id = validate.validateID(ID.getText());
        errors.codeSwitch(id);
        System.out.println("Retorno" + id);
        return id;
    }

   //Function that gets the string stored in weight textbox and validates it
    public String getTextWeight(){
        String weight = validate.validateDouble(Weight.getText());
        errors.codeSwitch(weight);
        return weight;
    }
    
    //Function that gets the string stored in height textbox and validates it
    public String getTextHeight() {
        String height = validate.validateIntegers(Height.getText(), 220);
        errors.codeSwitch(height);
        return height;
    }
    
    //Function that gets the string stored in name textbox and validates it
    public String getTextFName() {
        String fName = validate.validateNames(FName.getText());
        errors.codeSwitch(fName);
        return fName;
    }
 
    //Function that gets the string stored in lastName textbox and validates it
    public String getTextLName() {
        String lName = validate.validateNames(LName.getText());
        errors.codeSwitch(lName);
        return lName;
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
            java.util.logging.Logger.getLogger(NewPatientUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPatientUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPatientUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPatientUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPatientUpdate("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField FName;
    private javax.swing.JTextField Height;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField LName;
    private javax.swing.JTextField Weight;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdcFecNac;
    private javax.swing.JLabel lbScreenTitle;
    // End of variables declaration//GEN-END:variables

    
}
