//*******************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Francisco Quezada
import java.util.Date; // needed for printing today's date

public class dummy // replace # with file name
{
	//-----------------------
	// main method: program execution begins here
	//-----------------------
	public static void main(String [] args)
	{
		//Label output with name and date:
		System.out.println("Francisco Quezada\ndummy\n" + new Date() + "\n");

		// Variable dictionary:
		int count=1;

		do {
		System.out.println(count);
		count ++;
		} while (count < 1000000000);
	}
}

