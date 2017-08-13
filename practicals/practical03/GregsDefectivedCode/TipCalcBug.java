
//**************************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Gregory Shemancik
// CMPSC 111 Spring 2016
// Lab 3
// Date: February 3 2016
//
// Purpose: Working with variables and expressions, especially employing java.util.Scanner
// **************************************
import java.util.Date; // needed for printing today's date
import java.util.Scanner;


public class TipCalcBug
{
	//-----------------------------
	// main method: program execution begins here
	//-----------------------------
	public static void main(String[] args)
	{
		// Label output with name and date:
		System.out.println("Gregory Shemancik\nLab 3\n" + new Date() + "\n");
		Scanner scan = new Scanner (System.in);

		System.out.println ("Welcome, please enter your name: ");
		
		// Asks customer to enter name

		String message = scan.nextLine();
		
		System.out.println("\"" + message + "\"" + "welcome to Tip 3000 Calculator!");
		/* added comma instead of a + */

		// Welcomes customer to tip calculator

		int originalbill;
		double dollars, $, tip, hundred; // **declare tip & hundred as doubles

		System.out.print ("Please enter the amount of your bill: ");
		originalbill = scan.nextInt(); // **Capital "O" & "B" when declared as lowercase**

		// Customer enters the amount of the original bill

		System.out.print ("Please enter the percentage that you would like to tip: ");
		dollars = scan.nextFloat();

		// Customer enters the percentage he or she would like to tip

		$ = dollars;
		hundred = 100;
		tip = ($ / hundred);

		System.out.println ("Your original bill was: $" + originalbill);
		System.out.println ("Your tip amount is: $" + tip + originalbill);
		System.out.println ("Your total bill is: $" + (originalbill + (tip * originalbill))); 

		// Original bill amount, tip amount, and total bill are reported

		System.out.print ("How many people will be splitting the bill?");
		int share = scan.nextInt();

		double endamount = ((originalbill + (tip * originalbill)) / share);

		// Total bill is split among desired number of people

		System.out.println ("Each person should pay $" + endamount);
		System.out.println ("Have an excellent day! We appreciate your service.");

		// Reports amount each individual should pay, and ends program in appreciative statement
	}
}
