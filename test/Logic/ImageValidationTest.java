/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class ImageValidationTest {
    
    public ImageValidationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Formato method, of class ImageValidation.
     */
    @Test
    public void testFormato() throws Exception {
        System.out.println("Formato");
        String file = "C:\\Users\\USER\\Desktop\\Nueva carpeta\\3.png";
        String expResult = "JPEG";
        String result = ImageValidation.Formato(file);
        assertEquals(expResult, result);
        if (!result.equals(expResult)){
        // TODO review the generated test code and remove the default call to fail.
            fail("Image format is not correct");
        }
    }

    /**
     * Test of Size method, of class TestExample.
     */
    @Test
    public void testSize() {
        System.out.println("Size");
        String file = "C:\\Users\\USER\\Desktop\\Nueva carpeta\\3.png";
        double expResult = 25.0;
        double result = ImageValidation.Size(file);
        assertEquals(expResult, result, 25.0);
        if (result >= expResult){
        // TODO review the generated test code and remove the default call to fail.
            fail("Size of image is greater than required");
        }
    }

    /**
     * Test of Width method, of class TestExample.
     */
    @Test
    public void testWidth() {
        System.out.println("Width");
        String file = "C:\\Users\\USER\\Desktop\\Nueva carpeta\\3.png";
        int expResult = 560;
        int result = ImageValidation.Width(file);
        assertEquals(expResult, result);
        if (result != expResult){
        // TODO review the generated test code and remove the default call to fail.
            fail("Width of the image is not correct");
        }
    }

    /**
     * Test of Height method, of class TestExample.
     */
    @Test
    public void testHeight() {
        System.out.println("Height");
        String file = "C:\\Users\\USER\\Desktop\\Nueva carpeta\\3.png";
        int expResult = 350;
        int result = ImageValidation.Height(file);
        assertEquals(expResult, result);
        if (result != expResult){
        // TODO review the generated test code and remove the default call to fail.
            fail("Height of the image is not correct");
        }
    }
}
