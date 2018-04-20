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
            message = "Exception 001";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            break;
         case "Exception 002" :
             message = "Exception 002";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);             
             break;
        case "Exception 003" :
            message = "Exception 003";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            break;
        case "Exception 004" :
            message = "Exception 004";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            break;
        case "Exception 005" :
            message = "Exception 005";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            break;
        case "Exception 006" :
            message = "Exception 006";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            break;
        case "Exception 007" :
            message = "Exception 007";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            break;
        case "Exception 008" :
            message = "Exception 008";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            break;            
        case "Exception 009" :
            message = "Exception 009";
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            break;            
         default:
             break;
             
         
         
     
     
     }
        
    }
}
