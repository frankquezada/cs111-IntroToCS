//*******************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Francisco Quezada
// CMPSC 111 Spring 2016
// Lab 10
// Date: 03/31/16
//
// Purpose: Create and manipulate Mandlebrot images.
//*******************************

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class MandelbrotBW {
    public static void main(String[] args) throws Exception {
        int width = 1920, height = 1080, max = 1000; // width, height, and max declaration
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB); // decalres new variable image from BufferedImage class
        int black = 0x000000, white = 0xFFFFFF; // declares code for color black and white

        for (int row = 0; row < height; row++) { // initializes row = 0, if row is less than height, row = row + 1
            for (int col = 0; col < width; col++) { // initialzies col = 0, if col less than width, col = col +1
                double c_re = (col - width/2)*4.0/width; 
                double c_im = (row - height/2)*4.0/width;
                double x = 0, y = 0; // initializes x and y = 0
                int iterations = 0; // initializes iterations = 0
                while (x*x+y*y < 4 && iterations < max) { // x^2+y^2 is less than 4 and iterations is less than max
                    double x_new = x*x-y*y+c_re;
                    y = 2*x*y+c_im;
                    x = x_new;
                    iterations++; // iterations = iteration = iteration + 1
                } 
                if (iterations < max) image.setRGB(col, row, white); // if iterations are less than the max input at beginning of this code set the image RGB
                else image.setRGB(col, row, black);
            }
        }
        ImageIO.write(image, "png", new File("mandelbrot-bw.png")); // creates a png file
    }
}
