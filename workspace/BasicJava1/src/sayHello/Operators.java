package sayHello;

public class Operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		int c = 3;
		
		if(a>b & a>c) {
			System.out.println("A is largest " +a);
		} else if (b>c) {
			System.out.println("B is largest " +b);
		} else {
			System.out.println("C is largest " +c);
		}
		}

	}

