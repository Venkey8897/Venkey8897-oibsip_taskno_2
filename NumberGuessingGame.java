import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
	public static void main(String[] args)
	{
		Random random = new Random();
		//Generates a random number between 1 and 100 
		int targetNumber = random.nextInt(100) + 1;
		int attempts = 0;
		boolean hasWon = false;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("I have selected a number between 1 and 100.");
		System.out.println("Let's see if you can guess it!");

		while (!hasWon)
		{
			System.out.println("==============================");
			System.out.print("Enter your guess: ");
			int guess = sc.nextInt();
			attempts++;

			if (guess == targetNumber)
			{
				hasWon = true;
				System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
			}
			else if(guess < targetNumber)
			{
				System.out.println("Too low! Try again.");
			}
			else
			{
				System.out.println("Too high! Try again.");
			}
		}
	}
}