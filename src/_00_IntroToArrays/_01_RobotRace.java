package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] Robots = new Robot[5];
		Random r = new Random();
		int winner = 0;
		for (int i = 0; i < Robots.length; i++) {
			Robots[i] = new Robot();
			Robots[i].setY(500);
			Robots[i].setX(50 + (100 * i));
			Robots[i].show();
			Robots[i].setSpeed(30);
		}
		while (Robots[0].getY() > 0 && Robots[1].getY() > 0 && Robots[2].getY() > 0 && Robots[3].getY() > 0
				&& Robots[4].getY() > 0) {
			for (int i = 0; i < Robots.length; i++) {
				Robots[i].move(r.nextInt(50));
				if (Robots[i].getY() <= 0) {
					winner = (i + 1);
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Robot #" + winner + " wins!");
	}
	// 2. create an array of 5 robots.

	// 3. use a for loop to initialize the robots.

	// 4. make each robot start at the bottom of the screen, side by side, facing up

	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.

}
