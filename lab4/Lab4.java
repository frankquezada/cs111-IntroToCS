//*******************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Francisco Quezada
// CMPSC 111 Spring 2016
// Lab 4 Part 2/2 (Lab4.java)
// Date: 02/10/16
//
// Purpose: Improve our knowledge on uding the graphics methods.
// Familiarize ourselves with how two Java classes interact.
//*******************************
import java.awt.*;
import javax.swing.JApplet;

public class Lab4 extends JApplet
{
  //-------------------------------------------------
  // Use Graphics methods to add content to the drawing canvas
  //-------------------------------------------------
  public void paint(Graphics page)
  {

	// Variable Dictionary
	final int width = 600; // width of screen
	final int height = 400; // height of screen
	final int os = 15; // snow ball size
	Color black = Color.black;
	Color white = Color.white;

	//---------------------------
	// Background, Surface, Sun, String Text
	//---------------------------

	// Sky Background
	setBackground(Color.cyan);
	
	// Allegheny Red Brick Ground Surface
	page.setColor(new Color(255,48,48)); //source
	page.fillRect(0, 300, width, 100);

	// Sun
	page.setColor(Color.yellow);
	page.fillOval(0,0,70,70);

	// Text
	page.drawString("Allegheny College - Where it snows randomly!",150,350);
	page.drawString("Author: Francisco Quezada",200,375);

	// ---------------------------
	// Snow
	// ---------------------------

	// Snow - Row 1
	page.setColor(white);
	page.fillOval(120,60,os,os);
	page.fillOval(180,60,os,os);
	page.fillOval(240,60,os,os);
	page.fillOval(300,60,os,os);
	page.fillOval(360,60,os,os);
	page.fillOval(420,60,os,os);
	page.fillOval(480,60,os,os);
	page.fillOval(540,60,os,os);
	page.fillOval(600,60,os,os);

	// Snow - Row 2
	page.setColor(white);
	page.fillOval(30,110,os,os);
	page.fillOval(90,110,os,os);
	page.fillOval(150,110,os,os);
	page.fillOval(210,110,os,os);
	page.fillOval(270,110,os,os);
	page.fillOval(330,110,os,os);
	page.fillOval(390,110,os,os);
	page.fillOval(450,110,os,os);
	page.fillOval(510,110,os,os);
	page.fillOval(570,110,os,os);

	// Snow - Row 3
	page.setColor(white);
	page.fillOval(15,170,os,os);
	page.fillOval(75,170,os,os);
	page.fillOval(135,170,os,os);
	page.fillOval(195,170,os,os);
	page.fillOval(255,170,os,os);
	page.fillOval(315,170,os,os);
	page.fillOval(375,170,os,os);
	page.fillOval(555,170,os,os);

	// Snow - Row 4
	page.setColor(white);
	page.fillOval(30,230,os,os);
	page.fillOval(90,230,os,os);
	page.fillOval(150,230,os,os);
	page.fillOval(210,230,os,os);
	page.fillOval(270,230,os,os);
	page.fillOval(330,230,os,os);
	page.fillOval(390,230,os,os);
	page.fillOval(510,230,os,os);
	page.fillOval(570,230,os,os);

	// ---------------------------
	// Stickman Figure
	// ---------------------------

	// Stickman Head
	page.setColor(new Color(210,180,140)); //source
	page.fillOval(450,150,40,40);

	// Stickman Torso
	page.setColor(black);
	page.drawLine(470,190,470,250);

	// Stickman Left Leg
	page.setColor(black);
	page.drawLine(470,250,450,300);

	// Stickman Right Leg
	page.setColor(black);
	page.drawLine(470,250,490,300);

	// Stickman Left Hand
	page.setColor(black);
	page.drawLine(470,220,450,200);

	// Stickman Right Hand
	page.setColor(black);
	page.drawLine(470,220,490,200);

	// Stickman Left Eye + Pupil
	page.setColor(white);
	page.fillOval(460,160,10,15);

	page.setColor(black);
	page.fillOval(460,165,5,5);

	// Stickman Right Eye + Pupil
	page.setColor(white);
	page.fillOval(470,160,10,15);

	page.setColor(black);
	page.fillOval(470,165,5,5);

	// Stickman Frown
	page.setColor(black);
	page.drawLine(460,180,475,180);
  }
}
