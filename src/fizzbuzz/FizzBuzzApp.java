// starting with
// User Story #1
// The program prints the numbers 1-100 to the console.

// Woot Woot User Story 1 worked just fine

// now onto
// User Story #2
// If a number is divisible by 3 replace the numeric console output with the word “fizz”.


// woot woot User 2 works just like it is supposed to do

// now on to
// User Story #3
// If a number is divisible by 5 replace the numeric console output with the word “buzz”.

// now that was fun!! user story 3 worked as planned

// drum roll please!!!!
// now onto
// User Story #4
// If a number is divisible by both 3 and 5 replace the numeric console output with "fizzbuzz".

// Yippiee Ki-Yay MF!!! it worked!!!!! i may still have a bit of a programmer left in me!


package fizzbuzz;

public class FizzBuzzApp 
{

	public static void main(String[] args) 
	{
		// declare variables
		int counter = 1;
		
		
		// setting up while loop and initially going to just display print out of 1 to 100
		while (counter <= 100)
		{
			// now adding code for printing fizz
			// next adding code for printing buzz
			// next adding code for fizzbuzz - note need to add it first so that it will print fizzbuzz instead of fizz or buzz
			if (((counter % 3) == 0) && ((counter % 5) == 0))
			{
				System.out.println("fizzbuzz");
			}
			else if ((counter % 3) == 0)
			{
				System.out.println("fizz");
				
			}
			else if ((counter % 5) == 0)
			{
				System.out.println("buzz");
			}
			else
			{
				System.out.println(counter);
			}
			counter ++;
		} // end while loop
		

	} // end main

} // end class FizzBuzzApp
