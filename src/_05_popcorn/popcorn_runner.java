package _05_popcorn;

import javax.swing.JOptionPane;

public class popcorn_runner {
	public static void main(String[] args) {
		Microwave hi = new Microwave(30, "cold pizza");

		hi.setTime(20);
		int i=0;
		String lol = JOptionPane.showInputDialog("What type of pizza do you want");
		lol = lol.toLowerCase();
		if (lol.equals("pineapple") || lol.equals("hawaiian")) {
			System.out.println("No you psycho");
		} else {
			Popcorn pizza = new Popcorn(lol);
			for (i = 0; i < 20; i++) {
				String doing=JOptionPane.showInputDialog("Eat or continue microwave or stare");
				doing=doing.toLowerCase();
				if(doing.equals("stare")) {
					System.out.println("In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters. \n And God said, Let there be light: and there was light. And God saw the light, that it was good: and God divided the light from the darkness. And God called the light Day, and the darkness he called Night. And the evening and the morning were the first day.");
				}
				if(doing.equals("microwave")) {
					System.out.println("microwaving");
					pizza.applyHeat();
					i-=2;
				}
				if(doing.equals("eat")) {
					pizza.eat();
				}
				if (pizza.isburned()) {
					i+=20;
				}
			}
			if (i == 20) {
				System.out.println("Uh oh the pizza's moldy!");
			}
		}

	}
}
