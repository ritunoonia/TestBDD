package sayHello;

public class Homework1To10 {

	public static void main(String[] args) {

		for (int a = 1; a <= 10; a = a + 1) {
			for (int b = 1; b <= 10; b = b + 1) {
				System.out.println(a + "x" + b + "=" + a * b);
			}
			System.out.println("-------------- ");
		}
	}
}
