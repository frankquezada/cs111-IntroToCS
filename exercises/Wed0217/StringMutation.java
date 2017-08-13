public class StringMutation
{
	public static void main(String[] args)
	{
	String phrase = "Change is inevitable";
	String mutation1, mutation2, mutation3, mutation4;

	System.out.println("Original String : \"" +phrase + "\"");
	System.out.println("Length of string: " + phrase.length());

	mutation1 = phrase.concat(", except from the vending machines.");
	mutation2 = mutation1.toLowerCase();
	mutation3 = mutation2.replace('a', 'x');
	mutation4 = mutation3.substring(8, 30);

	System.out.println("Mutation #1: " + mutation1);
	System.out.println("Mutation #2: " + mutation2);
	System.out.println("Mutation #3: " + mutation3);
	System.out.println("Mutation #4: " + mutation4);

	System.out.println("Mutated length: " + mutation4.length());

	}
}
