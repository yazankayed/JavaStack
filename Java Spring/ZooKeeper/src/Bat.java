
public class Bat extends Mammal {
	public Bat() {
		super();
	}
	public void fly() {
		health-=50;
		System.out.println("Bat had flow around the Zoo");

	}
	public void eatHumans() {
		health+=25;
		System.out.println("Bat had ate a human");

	}
	public void attackTown() {
		health-=100;
		System.out.println("Bat had attacken the town");
	}
	
}
