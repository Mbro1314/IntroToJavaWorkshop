package day1.robot;

import javax.swing.JOptionPane;

public class t {

	public static void main(String[] args) {
		for (int i = 0; i < 9999 * 9999; i++) {

			String name = JOptionPane.showInputDialog("what is your name");
			JOptionPane.showMessageDialog(null, name + " your name is now jeff");
		}
	}
}