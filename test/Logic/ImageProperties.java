/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexample;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.System.in;
import java.util.Iterator;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author USE
 */
public class ImageProperties {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String file = "C:\\Users\\USER\\Desktop\\Nueva carpeta\\2.jpg"; 
        Formato(file);
        Size(file);
        Width(file);
        Height(file);
    }

    /**
     *
     * @param fecha
     * @return
     */
        public static String Formato(String file) throws IOException{

	//Create Image File
	File imageFile = new File(file);
	//Create ImageInputStream using Image File
	ImageInputStream imageInputStream = ImageIO.createImageInputStream(imageFile);

	//Get the image readers for that file
	Iterator<ImageReader> imageReadersList = ImageIO.getImageReaders(imageInputStream);

	if (!imageReadersList.hasNext()) {
		throw new RuntimeException("Image Readers Not Found!!!");
	}

	//Get the image type
	ImageReader reader = imageReadersList.next();
        
        if (reader.getFormatName().equals("JPEG")){ 
            //Close stream (best practice)
            imageInputStream.close();
            System.out.println("Image format:" + reader.getFormatName());
            return reader.getFormatName();
	} else {
            System.out.println("Image format is not correct. Expected: JPEG. Returned:" + reader.getFormatName());
            return "Image format is not correct.";
        }
    }
    
    public static String Size(String file){
        
        File imagefile = new File(file);
        double bytes = imagefile.length();
        double kilobytes = (bytes / 1024);
		
		if(kilobytes <= 25.00){

                        System.out.println("kilobytes:" + kilobytes);
                        return "Size is ok";

		}else{
                         System.out.println("File exceeds size. Expected under 25kb. Returned:" + kilobytes);
			 return "File exceeds size";
		}
		
    }
    
    
    
    public static int Width(String file) throws IOException{
        File imageFile = new File(file);
        int Width = 0;
        BufferedImage image = ImageIO.read(imageFile);
        Width = image.getWidth();
       
            if (Width == 560){
                    System.out.println("Image width:" + Width);
                    return Width;
            }else{
                System.out.println("Image width is not correct. Expected: 560. Returned:" + Width);
                return 0;
            }

    }
    
        public static int Height(String file) throws IOException{
        File imageFile = new File(file);
        int Height = 0;
        BufferedImage image = ImageIO.read(imageFile);
        Height = image.getHeight();
       
            if (Height == 350){
                    System.out.println("Image height:" + Height);
                    return Height;
            }else{
                System.out.println("Image height is not correct. Expected: 350. Returned:" + Height);
                return 0;
            }
        
    }
 }
 
