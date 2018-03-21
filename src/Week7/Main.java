/*
 * @project Week7
 * @author  Osbardo Rodriguez
 * Date:    3/20/18
 */
package Week7;

/*
 * Import the Random java package.
 */
import java.util.Random;
/*
 * Import the Scanner java package.
 */
import java.util.Scanner;

/**
 * Define class Main.
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * Write a program that simulates rolling a 6-sided die 6 million times.
		 * Each roll we will keep track of the number of times a given number
		 * appears. When the simulation is done, we show the number of times
		 * each value appeared.
		 *
		 * Only the final results will appear when we run the simulation.
		 *
		 * One thing we need to figure out is how to simulate rolling a die.
		 * In this case, that means generating a random number from 1-6.
		 *
		 * From 1 to 6,000,000
		 * 1. "roll" the die
		 * 2. store the number in a result
		 * 3. Tally the results
		 *
		 * When the loop is done, print the results.
		 */
		int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0, ten = 0;

		// Instantiate the Scanner
		Scanner input = new Scanner( System.in );
		System.out.print( "How many sides does the die have?: " );
		int userVar = input.nextInt();

		for ( int counter = 1; counter <= 6000000; counter++ ) {
			int die = roll( userVar );

			switch ( die ) {

				case 1:
					one++;
					break;
				case 2:
					two++;
					break;
				case 3:
					three++;
					break;
				case 4:
					four++;
					break;
				case 5:
					five++;
					break;
				case 6:
					six++;
					break;
				case 7:
					seven++;
					break;
				case 8:
					eight++;
					break;
				case 9:
					nine++;
					break;
				default:
					ten++;
					break;
			}
		}

		int total = one + two + three + four + five + six + seven + eight + nine + ten;

		System.out.printf( "One: %10d\n", one );
		System.out.printf( "Two: %10d\n", two );
		System.out.printf( "Three: %8d\n",three );
		System.out.printf( "Four: %9d\n",four );
		System.out.printf( "Five: %9d\n",five );
		System.out.printf( "Six: %10d\n",six );
		System.out.printf( "Seven: %8d\n",seven );
		System.out.printf( "Eight: %8d\n",eight );
		System.out.printf( "Nine: %9d\n",nine );
		System.out.printf( "Ten: %10d\n",ten );
		System.out.printf( "There were a total of %d results.\n",total );
	}

	public static int roll( int sides ) {
		Random rand = new Random();
		int die = rand.nextInt( sides ) + 1;

		return die;
	}

	/*
	 * Exercise 5
	 *
	 * Write a program that asks the user for the following:
	 * 1. How many dice to roll (up to 6)?
	 * 2. How many sides per die (all dice can be the same number of sides)?
	 * 3. How many times to repeat rolling the dice?
	 */
}
