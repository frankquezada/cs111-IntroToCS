//*******************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Francisco Quezada
// CMPSC 111 Spring 2016
// Lab 4 Part 1/2 (Lab4Display.java)
// Date: 02/10/16
//
// Purpose: Improve our knowledge on uding the graphics methods.
// Familiarize ourselves with how two Java classes interact.
//*******************************

import javax.swing.*;

public class Lab4Display
{
  public static void main(String[] args)
  {
    JFrame window = new JFrame(" Francisco Quezada "); // added my name

    // Add the drawing canvas and do necessary things to
    // make the window appear on the screen!
    window.getContentPane().add(new Lab4());
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    window.setSize(600, 400);
  }
}

