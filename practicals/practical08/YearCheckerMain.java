//*****************************
// CMPSC 111
// Practical 8
// October 30, 2015
//
// Purpose: a program that determines what activities happen
// during a specific year.
//*****************************

import java.util.Date;
import java.util.Scanner;

public class YearCheckerMain
{
    public static void main ( String[] args)
    {
        //Variable dictionary
        Scanner scan = new Scanner(System.in);
        int userInput;

        System.out.println("Please enter a year between 1000 and 3000!");
        userInput = scan.nextInt();

        YearChecker activities = new YearChecker(userInput);

        if(activities.isLeapYear(tf).equals(true)) {
	System.out.println(y + "is a leap year");
	}
	
	else if() {
	System.out.println(y + "is not a leap year");
	
        System.out.println("Thank you for using this program.");
    }
}
