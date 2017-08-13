
//*******************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Francisco Quezada
// CMPSC 111 Spring 2016
// Lab 2
// Date: 01/27/2015
//
// Purpose: Calculates End to End Delays of packages being
// sent over the network.
// Note: Equations and values for variables come from CS381 example problem.
//*******************************
import java.util.Date; // needed for printing today's date
import java.lang.Math; // needed for using math operations

public class Lab2
{
	//-----------------------
	// main method: program execution begins here
	//-----------------------
	public static void main(String [] args)
	{
		//Label output with name and date:
		System.out.println("Francisco Quezada\nLab 2\n" + new Date() + "\n");

		// Variable dictionary:
		double dis = (1*(Math.pow(10,3)));			// distance in meters
		final double lightspeed = (3*(Math.pow(10,8)));		// speed of light in meters per sec
		double Lsize = (1.2*(Math.pow(10,4)));			// size of package in bits
		double Rband = (1*(Math.pow(10,8)));			// transmission rate in bits per sec
		double endtoend;

		/* Math.pow is to raise a number to a power.
		 * So you type Math.pow followed by a paranthesis
		 * as seen above. Within the paranthesis (a,b),
		 * the variable a should be the base number and
		 * b should be the number which the base is raised to.
		 * For example, 10^5 is Math.pow(10,5).
		 */

		// Computation of End to End Delay
		endtoend = (dis/lightspeed) + (Lsize/Rband);	//formula used for end to end delays

		/* The formula above calculates end to end delay times.
		 * It is given by the delay time equal to the distance
		 * from where the package is being sent to the point it
		 * will be delivered, divided by the speed of light because
		 * that is what approximately the speed of the package is,
		 * the quantity added to the package size divided my the bandwidth
		 * or the transmission rate.
		 */

		// Output
		System.out.println("");
		System.out.println("Hello there!");
		System.out.println("Today we will calculate package end to end delays");
		System.out.println("over a network." + "\n");
		System.out.println("The following are the given parameters:" + "\n");
		System.out.println("Distance package is sent = " + dis + " meters");
		System.out.println("The Speed of light is = " + lightspeed + " meters/second");
		System.out.println("The packet size is = " + Lsize + " bits");
		System.out.println("The bandwidth is = " + Rband + " bits/second" + "\n");
		System.out.println("The end to end delay time is = " + endtoend + " seconds" + "\n");
		System.out.println("You can change the distance in my code to see how");
		System.out.println("distance affects delay times." + "\n");
		System.out.println("Author: Francisco Quezada");
	}
}

