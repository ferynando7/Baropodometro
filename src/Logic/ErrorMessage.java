/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ErrorMessage {
    
    public void codeSwitch(String errorCode){
        String message;
     switch(errorCode) {
         
         case "Exception 001" :
            message = "ID must contain only numbers";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            break;
         case "Exception 002":
             message = "ID length is wrong";
             JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);             
             break;
        case "Exception 003" :
            message = "ID number is invalid";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            break;
        case "Exception 004" :
            message = "Weight value must be numeric";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            break;
        case "Exception 005" :
            message = "There are empty fields";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            break;
        case "Exception 006" :
            message = "Height value is out of range";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            break;
        case "Exception 007" :
            message = "Height must be a numeric value";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            break;
        case "Exception 008" :
            message = "Weight value is out of range";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            break;            
        case "Exception 009" :
            message = "Wrong first name or last name format";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            break;            
         default:
             break;
     }
        
    }
}
