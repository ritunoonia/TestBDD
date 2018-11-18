package sayHello;

public class ObjectsOfEmployee {

	public static void main(String[] args) {
	
		Employee employee1= new Employee();
		employee1.Name = "Sam";
		employee1.Id = 123;
		employee1.Salary = 5000;
		
		employee1.doInduction();
		employee1.doTraining();
		employee1.paySalary();
		
		
		//Employee2
		Employee employee2 = new Employee ();
		employee2.Name = "John";
		employee2.Id = 234;
		employee2.Salary = 6000;
		
	}

}
