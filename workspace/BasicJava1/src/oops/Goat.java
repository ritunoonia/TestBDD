package oops;

public class Goat implements Animal {

	public static void main(String[] args) {
		
		Goat goat = new Goat();
		goat.eat();
		goat.travel();
		


	}
	
	public void eat( ) {
		System.out.println("The goat eats grass");
	}
	
	public void travel( ) {
		System.out.println("The goat travels");
	}

}
