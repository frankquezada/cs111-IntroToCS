import java.util.Scanner;
public class ifstatements
{

	public static void main(String[] args) {

		int Value1;
		int Value2;

		Scanner scan = new Scanner(System.in);

		System.out.println("Input Value1: ");
		Value1 = scan.nextInt();
		
		System.out.println("Input Value2: ");
		Value2 = scan.nextInt();
		
		if (Value1 == Value2) {
			System.out.println("Value 1: " + Value1 + " is equal to Value2: " + Value2);
		}
		else if (Value1 != Value2) {
			System.out.println(" Value1 is: " + Value1 + " is not equal to Value2: " + Value2);
		}
	}
}

