package UserInput;
import java.util.Scanner;

public class userInput {
	
	public static void main(String args[])
	{
		System.out.print("Enter your name ");
		
	    Scanner name = new Scanner(System.in);

	    System.out.println(name.next());
	}
}

