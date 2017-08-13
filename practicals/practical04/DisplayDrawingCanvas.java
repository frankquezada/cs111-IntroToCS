//*******************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Francisco Quezada
// CMPSC 111 Spring 2016
// Practical 04 Part 2/2 (DisplayDrawingCanvas.java)
// Date: 02/17/16
// Purpose: This program sets up a window with a "drawing
// canvas". To add things to the drawing, you must
// edit the file "DrawingCanvas.java". Source: Professor Kapfhammer
//==========================================

import javax.swing.*;
import java.util.Date;
import java.util.Scanner;

public class DisplayDrawingCanvas {

	// declare variables that can store the user's color values
	public static int redValue, redComp; // the red value & complementary output
	public static int greenValue, greenComp; // the green value & complementary output
	public static int blueValue, blueComp; // the blue value & complementary output
	public static int compcolor = 255; // the complementary value necessary for the comp equation

	// define the HEIGHT and WIDTH of the graphic
	public static final int WIDTH = 600;
	public static final int HEIGHT = 400;


	// solicit input from the user on the rectangle's color
	public static void main(String[] args) {

		//---------------------------------------
		//Request User for RGB values
		//---------------------------------------
		Scanner scan = new Scanner(System.in);

		// Red Request
		System.out.print("Input the Red Value: ");
		redValue = scan.nextInt(); //line that reads input

		// Green Request
		System.out.print("Input the Green Value: ");
		greenValue = scan.nextInt(); //line that reads input

		// Blue Request
		System.out.print("Input the Blue Value: ");
		blueValue = scan.nextInt(); //line that reads input

		// Print RGB Values given by User
		System.out.println("The RGB value is: ("+redValue+","+greenValue+","+blueValue+")");

		//---------------------------------------
		// Complementary Color Formula
		//---------------------------------------

		// Raw Formula: *Comp = 255 - *Value
		redComp = compcolor - redValue;
		greenComp = compcolor - greenValue;
		blueComp = compcolor - blueValue;

		// Print Complementary RGB Values
		System.out.println("The Complementary RGB value is: ("+redComp+","+greenComp+","+blueComp+")");

		/* Red's complement is blue and it is on the opposite
		   side of the wheel
		 */    


		JFrame window = new JFrame("Francisco Quezada" + new Date());

		// Add the drawing canvas and do necessary things to
		// make the window appear on the screen!
		window.getContentPane().add(new PaintDrawingCanvas()); // added
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setSize(WIDTH, HEIGHT);
	}
}

