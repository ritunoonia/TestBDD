package sayHello;

public class MyCalculator extends Calculation {

	public static void main(String[] args) {
		
		addition(3,4);
		subtraction(5,3);
		multiplication(4,5);

	}
	
	public static void multiplication (int a, int b) {
		int mul = a*b;
		System.out.println(mul);
	}
	
	public static void addition (int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	 

}
