package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot jeff = new Robot();
		int x;
		int y;
		jeff.penDown();
		jeff.setSpeed(10000);

		for (int i = 0; i < 1000000; i++) {
			jeff.turn(1);
			jeff.move(1);
			jeff.turn(3);
		}

	}
}