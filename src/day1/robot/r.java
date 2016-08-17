package day1.robot;

import javax.swing.JOptionPane;

public class r {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "   press ok to start                                ");
		String number = JOptionPane.showInputDialog("what is your phone number");
		String name = JOptionPane.showInputDialog("what    is   your       name");
		String last = JOptionPane.showInputDialog("what    is   your  last name");
		String age = JOptionPane.showInputDialog("what     is    your       age");
		String were = JOptionPane.showInputDialog("were    do   you        live");
		String money = JOptionPane.showInputDialog("how much money do  you have");
		System.out.println(number);
		System.out.println(name);
		System.out.println(age);
		System.out.println(last);
		System.out.println(were);
		System.out.println(money);
		JOptionPane.showMessageDialog(null, "thank you " + name + " " + last + " with phone number " + number
				+ " the age " + age + " wealth of " + money + " and the house at" + were + "");

	}

}