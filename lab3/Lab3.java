//*******************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Francisco Quezada
// CMPSC 111 Spring 2016
// Lab 3
// Date: 02/03/16
//
// Purpose: Understanding how to use and implement java.util.Scanner.
//*******************************
import java.util.Date; // needed for printing today's date
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab3 // replace # with file name
{
	//-----------------------
	// main method: program execution begins here
	//-----------------------
	public static void main(String [] args)
	{
		//Label output with name and date:
		System.out.println("Francisco Quezada\nLab 3\n" + new Date() + "\n");

		// Variable dictionary:
		String cname;
		int split;
		double bill, tip, newtip, newbill, splitbill;
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.##");	// decimal format pg.136
		
		// Name + Thank You Message
		System.out.println("     Mckinley's Expensive Food	");
		System.out.println("+++++++++++++++++++++++++++++++++++");

		System.out.println("Hello, what is your full name?");
		cname = scan.nextLine();
		System.out.println("Thank you " + cname);

		// Bill
		System.out.println(cname + " please enter the amount listed on your bill:");
		bill = scan.nextDouble();
		System.out.println("Thank you " + cname);
		System.out.println("The amount you entered is: $" + bill);

		//Tip
		System.out.println("\n Tip");
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println("As always, " + cname + " we appreciate your business");
		System.out.println(cname + " how much would you like to tip your waiter?");
		System.out.println("Note: Please put a value between 0% and 100%");
		tip = scan.nextDouble();

		newtip = bill * tip/100;	// tip calculation
		System.out.println("Thank you for your $" + fmt.format(newtip) + " tip");

		// Total Bill
		newbill = bill + newtip;	// total calculation
		System.out.println("Your total is : $" + fmt.format(newbill));

		// Summary of Bill
		System.out.println("\n Summary of Bill");
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println("Your subtotal (before tips) is: $" + bill);
		System.out.println("Your tip is :" + tip + "% or $:" + fmt.format(newtip) + " of the bill");
		System.out.println(cname + " your total is : $" + fmt.format(newbill));
		
		// Splitting the bill mate?
		System.out.println("\n Bill Share");
		System.out.println("+++++++++++++++++++++++++++++++++++");		
		System.out.println("How many people will split the bill " + cname + "?");
		split = scan.nextInt();
		splitbill = newbill/split;	// split calculation
		System.out.println("The bill for each person is: $" + fmt.format(splitbill));
		System.out.println("Thank you " + cname + ", hope you have an awesome day!");

		System.out.println("");
		System.out.println(" /__  ___/                                           ");
		System.out.println("   / /  / __      ___       __     / ___      ___    ");
		System.out.println("  / /  //   ) ) //   ) ) //   ) ) //\\ \\     ((   ) ) ");
		System.out.println(" / /  //   / / //   / / //   / / //  \\ \\     \\ \\     ");
		System.out.println("/ /  //   / / ((___( ( //   / / //    \\ \\ //   ) )");
		System.out.println("\nsource of ASCII Art:");
		System.out.println("http://www.retrojunkie.com/asciiart/holidays/thankyou.htm");


	}
}

