/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexample;

import java.io.IOException;
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
public class ImagePropertiesTest {
    
    public ImagePropertiesTest() {
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
     * Test of main method, of class TestExample.
     * @throws java.lang.Exception     
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        TestExample.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Formato method, of class TestExample.
     */
    @Test
    public void testFormato() throws Exception {
        System.out.println("");
        System.out.println("Image format");
        TestExample instance = new TestExample();
        
        assertEquals("JPEG", instance.Formato("C:\\Users\\USER\\Desktop\\Nueva carpeta\\1.jpg"));
        assertEquals("JPEG", instance.Formato("C:\\Users\\USER\\Desktop\\Nueva carpeta\\2.jpg"));
        assertEquals("Image format is not correct.", instance.Formato("C:\\Users\\USER\\Desktop\\Nueva carpeta\\3.png"));
        assertEquals("Image format is not correct.", instance.Formato("C:\\Users\\USER\\Desktop\\Nueva carpeta\\4.png"));
        assertEquals("Image format is not correct.", instance.Formato("C:\\Users\\USER\\Desktop\\Nueva carpeta\\5.png"));
        //assertEquals(expResult, result);
    }

    /**
     * Test of Size method, of class TestExample.
     */
    @Test
    public void testSize() {
        System.out.println("");     
        System.out.println("Image size");
        TestExample instance = new TestExample();
        
        assertEquals("Size is ok", instance.Size("C:\\Users\\USER\\Desktop\\Nueva carpeta\\1.jpg"));
        assertEquals("File exceeds size", instance.Size("C:\\Users\\USER\\Desktop\\Nueva carpeta\\2.jpg"));
        assertEquals("File exceeds size", instance.Size("C:\\Users\\USER\\Desktop\\Nueva carpeta\\3.png"));
        assertEquals("File exceeds size", instance.Size("C:\\Users\\USER\\Desktop\\Nueva carpeta\\4.png"));
        assertEquals("File exceeds size", instance.Size("C:\\Users\\USER\\Desktop\\Nueva carpeta\\5.png"));
    }

    /**
     * Test of Width method, of class TestExample.
    */ 
    @Test
    public void testWidth() throws IOException {
        System.out.println("");
        System.out.println("Image Width");
        TestExample instance = new TestExample();
        
        assertEquals(560, instance.Width("C:\\Users\\USER\\Desktop\\Nueva carpeta\\1.jpg"));
        assertEquals(0, instance.Width("C:\\Users\\USER\\Desktop\\Nueva carpeta\\2.jpg"));
        assertEquals(560, instance.Width("C:\\Users\\USER\\Desktop\\Nueva carpeta\\3.png"));
        assertEquals(0, instance.Width("C:\\Users\\USER\\Desktop\\Nueva carpeta\\4.png"));
        assertEquals(0, instance.Width("C:\\Users\\USER\\Desktop\\Nueva carpeta\\5.png"));
    }

    /**
     * Test of Height method, of class TestExample.
    */ 
    @Test
    public void testHeight() throws IOException {
        System.out.println("");
        System.out.println("Image Height");
        TestExample instance = new TestExample();
        
        assertEquals(350, instance.Height("C:\\Users\\USER\\Desktop\\Nueva carpeta\\1.jpg"));
        assertEquals(0, instance.Height("C:\\Users\\USER\\Desktop\\Nueva carpeta\\2.jpg"));
        assertEquals(350, instance.Height("C:\\Users\\USER\\Desktop\\Nueva carpeta\\3.png"));
        assertEquals(0, instance.Height("C:\\Users\\USER\\Desktop\\Nueva carpeta\\4.png"));
        assertEquals(0, instance.Height("C:\\Users\\USER\\Desktop\\Nueva carpeta\\5.png"));
    }
  
}
