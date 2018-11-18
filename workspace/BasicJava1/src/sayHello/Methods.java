package sayHello;

public class Methods {

	public static void main(String[] args) {
	
		addition1();
		addition2(2,3);
		addition1();
		addition2(4,5,6);
		int result = multiplication(2,4);
		System.out.println(result);
		addition2(5, result);
		

	}
   public static void addition1() {
	int a=1;
	int b=2;
	int sum =a+b;
	System.out.println(sum);
	
}
   
   public static void addition2(int a, int b) {
	   int sum = a+b;
	   System.out.println(sum);
   }
   
   public static void addition2(int a, int b, int c) {
	   int sum = a+b+c;
	   System.out.println(sum);
			   
   }
   
   public static int multiplication(int a, int b) {
	   int mul = a*b;
	   return mul;
   }
}
