/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Forms.NewPatientInsert;
import Forms.NewPatientUpdate;
import javax.swing.JFrame;

/**
 *
 * @author ferynando7
 */
public class PatientGenericState {
    
    
    public PatientGenericState (int mode){
        NewPatientInsert rgf = new NewPatientInsert();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null); 
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public PatientGenericState (String patientID){
        NewPatientUpdate patient = new NewPatientUpdate(patientID);
        patient.setVisible(true);
        patient.pack();
        patient.setLocationRelativeTo(null); 
        patient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
