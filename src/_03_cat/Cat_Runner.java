package _03_cat;

import javax.swing.JOptionPane;

public class Cat_Runner {
	public static void main(String[] args) {
		Cat benjamin = new Cat("Benjamin");
		while(benjamin.getLifes()>0) {
			String act=JOptionPane.showInputDialog("What do you want to do me");
			String otact = act.toLowerCase();
			if (otact.equals("kill")) {
				benjamin.kill();
			}
			if (otact.equals("say your name")) {
				benjamin.printName();
			}
			if (otact.equals("meow")) {
				benjamin.meow();
			}
		}
	}
}