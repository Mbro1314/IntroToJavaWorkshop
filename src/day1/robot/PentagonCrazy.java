package day1.robot;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {

		// 1. Create a new Robot
		Robot bb8 = new Robot();
		// 3. Put the robot's pen down
		bb8.penDown();
		// 8. Make the robot go at maximum speed (10)
		bb8.turn(6);
		bb8.move(6); // 9. Set the pen to a color that you like for the shape
		bb8.setPenColor(random);
		// 4. Make a variable for the number of sides you want (can’t test this
		// one)

		// 5. Make a variable for the angle you want the robot to turn. Hint:
		// you can divide in Java using "/". Can’t test until step 6.

		// 11. Turn the robot one more degree
	}

	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}