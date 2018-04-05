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
    
    /*Inform abou an error while connecting to a database*/
    public String conexionError(){
        
        return "Error while connecting to database";
        
    }
    
    /*Inform about errors that can occur while inserting values to 
    a database*/
    public String insertionError(){
        
        return "Error while inserting values to database";
        
    }
    
    /*Inform about an error that can ocurr while getting information from
    a database*/
    public String obtainingError(){
        
        return "Error while getting information from database";
        
    }
    
    /*Inform about an error that can happen when values are been deleted
    from a database*/
    public String deletingError(){
        
        return "Error while deleting information from database";
        
    }
    
    
    
}
