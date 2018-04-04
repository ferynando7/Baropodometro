/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Forms.NewPatient;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ferynando7
 */
public class DataTypesValidationTest {
    
    DataTypesValidation instance = new DataTypesValidation();
    
    public DataTypesValidationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of validateID method, of class DataTypesValidation.
     */
    @Test
    public void testValidateID() {
        System.out.println("getTextID");
        assertEquals("Exception 002", instance.validateID("12345e"));
        assertEquals("Exception 002", instance.validateID("12345"));
        assertEquals("Exception 003", instance.validateID("1104136139"));
        assertEquals("1104136138", instance.validateID("1104136138"));
       
    }
    
    public void testValidateNames() {
        System.out.println("getTextNames");
        assertEquals("The name cannot be null", instance.validateNames(""));
        assertEquals("Wrong format", instance.validateNames("Carlos@123"));
        assertEquals("ok", instance.validateNames("Carlos"));
       
    }
    
}
