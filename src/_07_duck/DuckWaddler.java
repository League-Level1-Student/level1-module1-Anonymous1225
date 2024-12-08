package _07_duck;

import javax.swing.JOptionPane;

public class DuckWaddler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck theDuck = new Duck("grapes",2);
		theDuck.hangOut();
		theDuck.askForFood();
		String hi = JOptionPane.showInputDialog("");
		if(hi.equals("No we just sell lemonade but, it's cold and it's fresh and it's all homemade!")) {
			System.out.println("then he waddled away waddle waddle");
		}
		if(hi.equals("yes")) {
			System.out.println("Yipee!, duck");
		}
		else {
			System.out.println("Why noooot, duck");
		}
	}

}
