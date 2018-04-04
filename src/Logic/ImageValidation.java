/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author USER
 */
public class ImageValidation {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String file = ""; 
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
	System.out.println("Image Format: " + reader.getFormatName());

	//Close stream (best practice)
	imageInputStream.close();
        return reader.getFormatName();
	}
    
    
    public static double Size(String file){
        
        File imagefile =new File(file);
        
        double kilobytes = 0;
		
		if(imagefile.exists()){
			
			double bytes = file.length();
			kilobytes = (bytes / 1024);

			System.out.println("kilobytes : " + kilobytes);

		}else{
			 System.out.println("File does not exists!");
		}
    return kilobytes;		
    }
    public static int Width(String file){
        File imageFile = new File(file);
        int Width = 0;
        
        try{

            BufferedImage image = ImageIO.read(imageFile);
            Width = image.getWidth();
            System.out.println("Width: " + image.getWidth());

        } catch (Exception ex){
            ex.printStackTrace();
        }
        
        return Width;
    }
    
        public static int Height(String file){
        File imageFile = new File(file);
        int Height = 0;
        
        try{

            BufferedImage image = ImageIO.read(imageFile);
            Height = image.getHeight();
            System.out.println("Heigth: " + image.getHeight());

        } catch (Exception ex){
            ex.printStackTrace();
        }
        
        return Height;
    }
}
