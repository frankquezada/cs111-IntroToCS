//*******************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Francisco Quezada
// CMPSC 111 Spring 2016
// Practical 04
// Date: 03/04/16
//
// Purpose: Using chapter 3 concepts such as the Scanner class to create a Mad Libs program.
//*******************************

import java.util.Scanner;
import java.util.Date;

public class MadLibs
{

	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);

		System.out.println("Francisco Quezada, Practical 05\n" + new Date() +"\n");

		// Noun
		System.out.println("Enter a republican presidential candidate:");
		String pres = scan.nextLine();
		System.out.println("Presidential Candidate is: " + pres + "\n");

		// Adjective
		System.out.println("Enter a funny adjective:");
		String fadj = scan.nextLine();
		System.out.println("Funny adjective is: " + fadj +"\n");

		// Another Adjective
		System.out.println("Enter another funny adjective:");
		String anadj = scan.nextLine();
		System.out.println("Another funny adjective is: " + anadj +"\n");

		// Singular Verb
		System.out.println("Enter a singular verb:");
		String sverb = scan.nextLine();
		System.out.println("Singular verb is: " + sverb +"\n");

		// Non-whole zero whole number
		System.out.println("Enter a non-zero whole number:");
		int nz = scan.nextInt();
		System.out.println("Non-zero whole number is: " + nz +"\n");

		// Another Non-whole zero whole number
		System.out.println("Enter another non-zero whole number:");
		int annz = scan.nextInt();
		System.out.println("Another non-zero while number is: " + annz +"\n");

		// Any Number
		System.out.println("Enter any number:");
		double anynum = scan.nextDouble();
		System.out.println("Any number is: " + anynum +"\n");

		// Story
		System.out.println("Funny Presidential Candidate Word Problem\n");
		System.out.println("Candidate " +pres+ " is extremely " + fadj+",");
		System.out.println("This " +anadj+" " +pres+" is not going to win,");

		int winning = 100 -annz-nz;
		double IQ = anynum - (100.0*anynum);

		System.out.println("Your candidate is "+ sverb+", so how do I know " +pres+ " will lose?\n");
		System.out.println("Answer: Because "+pres+"'s IQ is " + IQ + " giving them a " + winning+" win rate, haha!");
	}
}
