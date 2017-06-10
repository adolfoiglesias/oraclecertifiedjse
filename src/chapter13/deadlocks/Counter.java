/**
 * 
 */
package chapter13.deadlocks;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class Counter implements Runnable {

	public void IncrementBallAfterRun() {
		// since we're updating runs variable first, lock the Runs.class
		// reference first
		synchronized (Runs.class) {
			// now acquire lock on Balls.class variable before updating balls
			// variable
			synchronized (Ball.class) {
				Runs.runs++;
				Ball.balls++;
			}
		}
	}

	public void IncrementRunAfterBall() {
		// since we're updating balls variable first, lock the Balls.class
		// reference first
		synchronized (Ball.class) {
			// now acquire lock on Runs.class variable before updating runs
			// variable
			synchronized (Runs.class) {
				Ball .balls++;
				Runs.runs++;
			}
		}
	}

	@Override
	public void run() {
		IncrementBallAfterRun();
		IncrementRunAfterBall();
	}
}
