package sayHello;

public class Loops {

	public static void main(String[] args) { 
		
		//While loop
		int a = 1;
		while(a<=10) {
			System.out.println("The value of a is" +a);
			a=a+1;
		}
		
		//Do-while loop
		int b = 11;
		do {
			System.out.println("The value of b is " +b);
			b = b+1;
		}while (b<=20);
		
		//For loop
		for(int c=21; c<=30; c=c+1) {
			System.out.println("The value of c is " + c);
		}
			
		//For loop
		for(int d = 1; d<=20; d=d+2) {
			System.out.println("The value of d is " + d);
		}
		
		
	}

}
