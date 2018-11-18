package sayHello;

public class Arrays {

	public static void main(String[] args) {
		
		String shoppingList[] = new String[4];
		
		shoppingList[0] = "Milk";
		shoppingList[1] = "Eggs";
		shoppingList[2] = "Butter";
		shoppingList[3] = "Bread";
		
		System.out.println(shoppingList.length);
		System.out.println(shoppingList[1]);
		
		for(int a=0; a<shoppingList.length; a=a+1) {
			System.out.println(shoppingList[a]);
		}
				}

}
