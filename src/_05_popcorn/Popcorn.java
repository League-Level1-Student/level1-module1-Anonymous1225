package _05_popcorn;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


/* Your mission and you have to accept it:
 * Create a PopcornMaker class (in the popcorn package) and add a main method to it. 
 * The main method should create a bag of Popcorn and cook it in the microwave.
 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
 * Don't change the existing methods.
 */

class Microwave {
	private int cookTime;
	Popcorn thingToBeCooked;

	Microwave(int cookTime, String thingToBeCooked) {
		this.cookTime=cookTime;
		System.out.println("Microwave says: a Microwave has been made.");
	}

	void putInMicrowave(Popcorn thingToBeCooked) {
		System.out.println("Microwave says: pizza put in microwave.");
		this.thingToBeCooked = thingToBeCooked;
	}

	void setTime(int cookTimeInMinutes) {
		this.cookTime = cookTimeInMinutes;
		System.out.println("Microwave says: cook time is set to " + cookTime + " minutes.");
	}

	void startMicrowave() {
		if (thingToBeCooked == null) {
			System.out.println("Microwave says: there's nothing in the microwave!");
		} else {
			for (int i = 0; i < cookTime * 10 + 1; i++) {
				thingToBeCooked.applyHeat();
			}
			thingToBeCooked.eat();
		}
	}
}

public class Popcorn {

	private int unBurnedChez = 12;
	private String flavor;
	private boolean isBurnt = false;

	Popcorn(String flavor) {
		this.flavor = flavor;
		System.out.println("Microwaving " + this.flavor + " pizza.");
	}

	public void eat() {
		if (unBurnedChez<9) {
			System.out.println("Ready to eat!");
		}
		else {
			System.out.println("It's to cold!");
		}
	}
	
	public void applyHeat() {
		pause();
		unBurnedChez--;
		if (unBurnedChez == 0) {
			isBurnt = true;
			System.out.println("Pizza is dead >:(!");
		}
	}
	public boolean isburned() {
		return isBurnt;
	}
	private void pause() {
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}


