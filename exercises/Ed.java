//*******************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Produced by Francisco Quezada
// Purpose: Look at how to randomize and omit a character from a string.
//*******************************
import java.util.*;

public class Ed
{
	//-----------------------
	// main method: program execution begins here
	//-----------------------
	public static void main(String [] args)
	{

	// Variable Dictionary:
	String strand, mstrand1, mstrand2; // original "strand" and its mutuations
	int randy,slength; // random array from the length of the string
	char c; // the character c will be used to print the random variable as a character
	

	Random r = new Random();


	strand = "GTCAA";

	// Length of strand and randomize an array from that length (Note: by array I mean char)
	slength = strand.length(); //length of strand
	randy = r.nextInt(slength); //random array(char) in strand of slength

	// Print random variable as a character for user
	c = strand.charAt(randy); // random character value (e.g G,T,C,A, or A)
	System.out.println("The random character from: " +strand+" is: " + c);

	// String Substring	
	mstrand1 = strand.substring(0,randy); // substring from 0th array to randyth array(which is omitted)
	mstrand2 = strand.substring(randy+1,5); // substring from array after randyth the last, 5th array 

	System.out.println(mstrand1 + mstrand2); //prints both substrings

}
}

