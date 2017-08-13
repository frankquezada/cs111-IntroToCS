//*******************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Francisco Quezada
// CMPSC 111 Spring 2016
// Lab 10
// Date: 03/31/16
//
// Purpose: Create and manipulate Mandlebrot images.
//*******************************

import java.awt.Color;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class MandelbrotColor {
	public static void main(String[] args) throws Exception {
		int width = 1920, height = 1080, max = 0; // width, height, max declaration
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB); // declares new variable image from BufferedImage class
		int black = 0; // decalres black color = 0
		int[] colors = new int[max]; // colors set with max value

		final long startTime = System.currentTimeMillis(); // starts timer

		for (int i = 0; i<max; i++) {
			colors[i] = Color.HSBtoRGB(i/256f, 1, i/(i+8f)); // hue, saturation, value
		}

		for (int row = 0; row < height; row++) { // initializes row = 0, row less than height, row = row +1
			for (int col = 0; col < width; col++) { // initializes col = 0, col less than width, col = col +1
				double c_re = (col - width/2)*4.0/width;
				double c_im = (row - height/2)*4.0/width;
				double x = 0, y = 0; // sets x and y = 0
				double r2;
				int iteration = 0; // set iteration = 0
				while (x*x+y*y < 4 && iteration < max) {
					double x_new = x*x-y*y+c_re;
					y = 2*x*y+c_im;
					x = x_new;
					iteration++; // iteration = iteration + 1
				}
				if (iteration < max) image.setRGB(col, row, colors[iteration]); // if iteration is less than max set image RGB
				else image.setRGB(col, row, black);
			}
		}

		ImageIO.write(image, "png", new File(max+"mandelbrot-color.png")); // make image file

		final long endTime = System.currentTimeMillis(); // ends timer

		System.out.println("Total execution time for max = " + max +"\t" + (endTime - startTime)); // prints change in time

		}
}
