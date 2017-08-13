//*******************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Francisco Quezada
// CMPSC 111 Spring 2016
// Practical 04 Part 1/2 (PaintDrawingCanvas.java)
// Date: 02/17/16
// Purpose: Draw two boxes that display a color and the complement of the color.
// Source: Professor Kapfhammer
//=================================================

import java.awt.*;
import javax.swing.JApplet;

public class PaintDrawingCanvas extends JApplet {

	//-------------------------------------------------
	// Use Graphics methods to add content to the drawing canvas
	//-------------------------------------------------
	public void paint(Graphics page) {


		//----------------------
		// Left Box Code
		//----------------------

		// Created a new Color object called userColor
		Color userColor = new Color(DisplayDrawingCanvas.redValue,
				DisplayDrawingCanvas.greenValue, DisplayDrawingCanvas.blueValue);


		// fill the first half (left-to-right) with the user's color
		// make a call to page.fillRect with the correct parameters
		page.setColor(userColor);
		page.fillRect(0,0,300,400);


		//----------------------------THEORETICAL APPROACH 2 BEGINNING-------------------------
		/*
		   I could have added the code below here but instead decided to do it on
		   DisplayDrawingCanvas since it seemed more efficient and neater but
		   theoretically I would of added it as follows:

		   public static int redComp;
		   public static int greenComp;
		   public static int blueComp;
		   public static int compcolor = 255;

		   redComp = compcolor - DisplayDrawingCanvas.redValue;
		   greenComp = compcolor - DisplayDrawingCanvas.greenValue;
		   blueComp = compcolor - DisplayDrawingCanvas.blueValue;

		   Color userComplementaryColor = new Color(redComp, greenComp, blueComp);
		   page.setColor(userComplementaryColor);
		   page.fillRect(300,0,300,400);
		 */
		//----------------------------THEORETICAL APPROACH 2 ENDING----------------------------

		//----------------------
		// Right Box Code
		//----------------------

		// Created a new Color object called userComplementaryColor. Filled in null value.
		Color userComplementaryColor = new Color(DisplayDrawingCanvas.redComp,
				DisplayDrawingCanvas.greenComp, DisplayDrawingCanvas.blueComp);

		// fill the second half (left-to-right) with the complement of the user's color
		// make a call to page.fillRect with the correct parameters
		page.setColor(userComplementaryColor);
		page.fillRect(300,0,300,400);

	}
}
