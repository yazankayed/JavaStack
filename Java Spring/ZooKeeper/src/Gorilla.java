
public class Gorilla extends Mammal {
	public Gorilla() {
		super();
	}
	public void throwSomething() {
		health-=5;
		System.out.println("Gorilla had throw something");
	}
	public void eatBananas() {
		health+=10;
		System.out.println("Gorilla had eaten a Banana");

	}
	public void climb() {
		health-=10;
		System.out.println("Gorilla had climbed a Tree");

	}

}
