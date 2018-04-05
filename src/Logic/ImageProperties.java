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
 * @author USE
 */
public class ImageProperties {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String file = "C:\\Users\\USER\\Desktop\\Nueva carpeta\\2.jpg"; 
        formato(file);
        size(file);
        width(file);
        height(file);
    }

    /**
     *
     * @param file
     * @return
     * @throws java.io.IOException
     */
    
    //The following function obtains the format (file extension) of the image
    //specified by string "file". Inside the function we specify which kind of
    //format we expect to get and return it; if we do not get it we return a warning message
    //In both cases, extension file is displayed in console
        public static String formato(String file) throws IOException{

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
    //The following function obtains the size of the image
    //specified by string "file". Inside the function we specify the size of the 
    //file we expect to get and return a succesful message; if we do not get it we retun a warning message
    //In both cases, size of file is displayed in console
    public static String size(String file){
        
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
    
    //The following function obtains the width of the image
    //specified by string "file". Inside the function we specify the width of the 
    //image we expect to get and return the value; if we do not get it we return zero
    //In both cases, width of file is displayed in console
    
    public static int width(String file) throws IOException{
        File imageFile = new File(file);
        BufferedImage image = ImageIO.read(imageFile);
        int Width = image.getWidth();
       
            if (Width == 560){
                    System.out.println("Image width:" + Width);
                    return Width;
            }else{
                System.out.println("Image width is not correct. Expected: 560. Returned:" + Width);
                return 0;
            }

    }

    //The following function obtains the height of the image
    //specified by string "file". Inside the function we specify the height of the 
    //image we expect to get and return the value; if we do not get it we return zero
    //In both cases, height of file is displayed in console    
        public static int height(String file) throws IOException{
        File imageFile = new File(file);
        BufferedImage image = ImageIO.read(imageFile);
        int Height = image.getHeight();
       
            if (Height == 350){
                    System.out.println("Image height:" + Height);
                    return Height;
            }else{
                System.out.println("Image height is not correct. Expected: 350. Returned:" + Height);
                return 0;
            }
        
    }
 }
 
