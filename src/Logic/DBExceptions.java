/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author cbust
 */
public class DBExceptions extends Exception {
    
    public static final long serialVersionUID = 700L;
    
    public DBExceptions(){
        
        super();
        
    }
    
    public String conexionError(){
        
        return "Error while connecting to database";
        
    }
    
    public String insertionError(){
        
        return "Error while inserting values to database";
        
    }
    
    public String obtainingError(){
        
        return "Error while getting information from database";
        
    }
    
    public String deletingError(){
        
        return "Error while deleting information from database";
        
    }
    
    
    
}
