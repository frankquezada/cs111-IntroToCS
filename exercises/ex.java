//*******************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Produced by Francisco Quezada
// Purpose: Look at how to randomize and omit a character from a string.
//*******************************
import java.util.*;

public class ex
{
	//-----------------------
	// main method: program execution begins here
	//-----------------------
	public static void main(String [] args)
	{

	int n1;
	int n2;

	Random r = new Random();

	n1 = r.nextInt();
	System.out.println("Random int: " +n1);
	
	n1 = r.nextInt(10);
	System.out.println("From 0 to 9: " +n1);
	
	n1 = r.nextInt(10) + 1;
	System.out.println("From 1 to 10: " + n1);

}
}
