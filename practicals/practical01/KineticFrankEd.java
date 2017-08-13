import java.lang.Math;
import java.util.Scanner;

public class KineticFrankEd
{
	{
		int velocity_squared = 0;
		int velocity = 0;
		int mass = 0;
		StringBuffer final_velocity = new StringBuffer();

		Scanner user_input = new Scanner (System.in);


		String velocity_squared;
		System.out.println("What is your velocity");
		velocity_squared = user_input.nextInt();
		
		System.out.println("F V: " + velocity);
		System.out.println("F V squared: " + velocity_squared);

		if( mass != 0 ) {
			velocity_squared = 2 * (kinetic / mass);
			velocity = (int)Math.sqrt(velocity_squared);
			final_velocity.append(velocity);
		}

		else {
			final_velocity.append("Undefined");
		}

		System.out.println("L V: " + velocity);
		System.out.println("L V squared: " + velocity_squared);

		return final_velocity.toString();
	}

	public static void main(String[] args) {
		System.out.println("Calling the computeVelocity method!");
		String velocity = computeVelocity(1000,5);
		System.out.println("The velocity is: " + velocity);
	}
}
