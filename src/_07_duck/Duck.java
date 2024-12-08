package _07_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	public Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	public void askForFood() {
		System.out.println("Got any "+favoriteFood+"?");
	}
	public void hangOut() {
		System.out.println("Haging out with my " +numberOfFriends+" friends");
	}
}
