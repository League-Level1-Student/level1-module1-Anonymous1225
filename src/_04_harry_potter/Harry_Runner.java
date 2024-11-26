package _04_harry_potter;

import javax.swing.JOptionPane;

public class Harry_Runner {
	public static void main(String[] args) {
	HarryPotter ry = new HarryPotter();
	ry.makeInvisible(true);
	ry.spyOnSnape();
	for (int i=0;i<5;i++) {
	String spell = JOptionPane.showInputDialog("What spell do you want");
	ry.castSpell(spell);
	}
	}
}
