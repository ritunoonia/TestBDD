package sayHello;

public class SwapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pvalue(2,3);
		mCompare(2,5);
		addvalue(25);
	}
	
	public static void pvalue(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		int c;
		c=b;
		b=a;
		a=c;
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void mCompare(int a, int b){
		
		if (a<b) {
			System.out.println("Larger number is " + b);
		}
		else {
			System.out.println("Larger number is " + a);
		}
		
	}
	
	public static void addvalue(int sourcea) {
		
		
		
		if(sourcea<10||sourcea>99) {
			System.out.println("Please enter two digt no");
		}
		else{
		int tenthdigit = sourcea/10;
		System.out.println(tenthdigit);
		int firstdigit =  sourcea-tenthdigit*10;
		System.out.println(firstdigit);
		System.out.println(tenthdigit+firstdigit);
		}
	}
	
}
