/**
 * 
 */
package chapter13.notifywait.example2;

import java.util.Random;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class Dice {

	private static String turn = null;

	synchronized public static String getTurn() {
		return turn;
	}

	synchronized public static void setTurn(String player) {
		turn = player;
	}

	// which player starts the game
	public static void setWhoStarts(String name) {
		turn = name;
	}

	// prevent instantiating the class by making it private (we've only static
	// members)
	private Dice() {
	}

	// when we roll the dice, it should give a random result
	private static Random random = new Random();

	// random.nextInt(6) gives values from 0 to 5, so add 1 to result in roll()
	public static int roll() {
		return random.nextInt(6) + 1;
	}

}
