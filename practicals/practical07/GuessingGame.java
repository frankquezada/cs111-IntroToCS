import java.util.Random; // Random package
import java.util.Scanner; // Scanner package
import java.util.Date; // Date package



public class GuessingGame
{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in); // Declare scan
		Random random = new Random(); // Declare random

		int answer = random.nextInt(100-1); // random variable between 1 and 100

		// Introduction
		System.out.println("++++++++Guessing Game++++++++");
		System.out.println("Francisco Quezada " + new Date()); // Name and Date
		System.out.println("Our random generator has created a number between 1 and 100!");
		System.out.println("Your goal is to guess the number while I provide you with hints");

		int g = 0; // user guess variable
		int c = 0; // counter variable


		while (answer != g) { // while answer is not equal to guess iterate
			c++; // c = c+1
			System.out.println("\nWhat is your " + c + " guess?"); // Number of guess

			g = scan.nextInt(); // reads user input

			if (g > answer) { // if g is greater than the answer
				System.out.println("Too High"); // print too high
			}

			else if (g < answer) { // if g is less than the answer
				System.out.println("Too Low"); // print too low
			}

			else if (g == answer) { // if print is equal to the answer
				System.out.println("You got it!"); // print you got it
				System.out.println("It took you " + c + " tries, good job"); // prints number of attempts it took user to guess correctly
				break; // end program
			}


		}
	}
}
