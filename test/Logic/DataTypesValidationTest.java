/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ferynando7
 */
public class DataTypesValidationTest {


    public DataTypesValidationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of validateID method, of class DataTypesValidation. Used to validate the ID of the patient
     */
    @Test
    public void testValidateID() {
        System.out.println("getTextID");

        DataTypesValidation instance = new DataTypesValidation();

        assertEquals("Exception 002", instance.validateID("12345e"));
        assertEquals("Exception 002", instance.validateID("12345"));
        assertEquals("Exception 003", instance.validateID("1104136139"));
        assertEquals("1104136138", instance.validateID("1104136138"));

    }

    /**
     * Test of validateDouble method, of class DataTypesValidation. Used to validate the Weight of the patient
     */
    @Test
    public void testValidateDouble (){
        System.out.println("getTextWeight");
        DataTypesValidation instance = new DataTypesValidation();
        
        assertEquals("Exception 001", instance.validateDouble("A23"));
        assertEquals("45.6", instance.validateDouble("45.6"));
        assertEquals("Exception 004", instance.validateDouble("-45.6"));

    }


    /**
     * Test of validateHeight method, of class DataTypesValidation. Used to validate the height of the patient
     */
    @Test
    public void testValidateHeight() {
        System.out.println("getTextHeight");
        DataTypesValidation instance = new DataTypesValidation();

        assertEquals("175", instance.validateIntegers("175",220));
        assertEquals("Out of range", instance.validateIntegers("300",220));
        assertEquals("Out of range", instance.validateIntegers("-29",220));
        assertEquals("Non numeric", instance.validateIntegers("s34k",220));
    }

    /**
     * Test of validateNames method, of class DataTypesValidation. Used to validate the names of the patient
     */
    @Test
    public void testValidateNames() {
        DataTypesValidation instance = new DataTypesValidation();
        System.out.println("getTextNames");
        assertEquals("The name cannot be null", instance.validateNames(""));
        assertEquals("Wrong name format", instance.validateNames("Carlos@123"));
        assertEquals("ok", instance.validateNames("Carlos"));

    }



}
