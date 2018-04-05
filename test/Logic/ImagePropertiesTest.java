/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

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
    
    
    //This test function verifies if an image has a specific 
    //The first two images loaded have .jpeg format, so "formato" function
    //in "ImagePropoerties" will return "JPEG"; the other three images have
    //".png" extension, so "Image format is not correct" is expected from the same function
    //We can test any image by attaching its path
    @Test
    public void testFormato() throws Exception {
        System.out.println("");
        System.out.println("Image format");
        
        assertEquals("JPEG", ImageProperties.formato("C:\\Users\\USER\\Desktop\\Nueva carpeta\\1.jpg"));
        assertEquals("JPEG", ImageProperties.formato("C:\\Users\\USER\\Desktop\\Nueva carpeta\\2.jpg"));
        assertEquals("Image format is not correct.", ImageProperties.formato("C:\\Users\\USER\\Desktop\\Nueva carpeta\\3.png"));
        assertEquals("Image format is not correct.", ImageProperties.formato("C:\\Users\\USER\\Desktop\\Nueva carpeta\\4.png"));
        assertEquals("Image format is not correct.", ImageProperties.formato("C:\\Users\\USER\\Desktop\\Nueva carpeta\\5.png"));
    }

    /**
     * Test of Size method, of class TestExample.
     */
    @Test
    //The following test function verifies if an image has a size inferior to a
    //specified one in "ImageProperties". If size is less than specified, function "Size" in ImagePropoerties
    //will return "Size is ok", else "File exceeds size" is expected.
    //We can verify the size of any image by giving its path
    public void testSize() {
        System.out.println("");     
        System.out.println("Image size");
        
        assertEquals("Size is ok", ImageProperties.size("C:\\Users\\USER\\Desktop\\Nueva carpeta\\1.jpg"));
        assertEquals("File exceeds size", ImageProperties.size("C:\\Users\\USER\\Desktop\\Nueva carpeta\\2.jpg"));
        assertEquals("File exceeds size", ImageProperties.size("C:\\Users\\USER\\Desktop\\Nueva carpeta\\3.png"));
        assertEquals("File exceeds size", ImageProperties.size("C:\\Users\\USER\\Desktop\\Nueva carpeta\\4.png"));
        assertEquals("File exceeds size", ImageProperties.size("C:\\Users\\USER\\Desktop\\Nueva carpeta\\5.png"));
    }

    /**
     * Test of Width method, of class TestExample.
     * @throws java.io.IOException
    */ 
    @Test
    //This test function verifies if a the width of an image is equal to a specific
    //value defined in "ImagePropoerties". If the width of the image is correct, "Width" function 
    //will return the specified value; else it should return 0 
    //We can verify the width of any image by giving its path
    public void testWidth() throws IOException {
        System.out.println("");
        System.out.println("Image Width");
        
        assertEquals(560, ImageProperties.width("C:\\Users\\USER\\Desktop\\Nueva carpeta\\1.jpg"));
        assertEquals(0, ImageProperties.width("C:\\Users\\USER\\Desktop\\Nueva carpeta\\2.jpg"));
        assertEquals(560, ImageProperties.width("C:\\Users\\USER\\Desktop\\Nueva carpeta\\3.png"));
        assertEquals(0, ImageProperties.width("C:\\Users\\USER\\Desktop\\Nueva carpeta\\4.png"));
        assertEquals(0, ImageProperties.width("C:\\Users\\USER\\Desktop\\Nueva carpeta\\5.png"));
    }

    /**
     * Test of Height method, of class TestExample.
     * @throws java.io.IOException
    */ 
    @Test
    //This test function verifies if a the height of an image is equal to a specific
    //value defined in "ImagePropoerties". If the width of the image is correct, "Height" function 
    //will return the specified value; else it should return 0 
    //We can verify the height of any image by giving its path
    public void testHeight() throws IOException {
        System.out.println("");
        System.out.println("Image Height");
        
        assertEquals(350, ImageProperties.height("C:\\Users\\USER\\Desktop\\Nueva carpeta\\1.jpg"));
        assertEquals(0, ImageProperties.height("C:\\Users\\USER\\Desktop\\Nueva carpeta\\2.jpg"));
        assertEquals(350, ImageProperties.height("C:\\Users\\USER\\Desktop\\Nueva carpeta\\3.png"));
        assertEquals(0, ImageProperties.height("C:\\Users\\USER\\Desktop\\Nueva carpeta\\4.png"));
        assertEquals(0, ImageProperties.height("C:\\Users\\USER\\Desktop\\Nueva carpeta\\5.png"));
    }
  
}
