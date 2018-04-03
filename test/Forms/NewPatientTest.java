/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ferz
 */
public class NewPatientTest {
    
    public NewPatientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTextID method, of class NewPatient.
     */
    
    
    @Test
    public void testGetTextID_0args() {
        
    }
    

    /**
     * Test of getTextID method, of class NewPatient.
     */
    
     /*Codigos de excepciones
    
    001: Tipo de dato no válido
    002: Longitud de cadena no válida
    003: Numero de cedula no valido
    
    
    */
    
    
    @Test
    public void testGetTextID_String() {
        System.out.println("getTextID");
        NewPatient instance = new NewPatient();
        

        
        assertEquals("Exception 002", instance.getTextID("12345e"));
        assertEquals("Exception 002", instance.getTextID("12345"));
        assertEquals("Exception 003", instance.getTextID("1104136139"));
        assertEquals("1104136138", instance.getTextID("1104136138"));
       
    }

    /**
     * Test of main method, of class NewPatient.
     */
    @Test
    public void testMain() {
        
    }
    
}
