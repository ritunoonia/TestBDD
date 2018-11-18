package sayHello;

public class Employee {
	
	
	public String Name;
	public int Id;
	public int Salary;
	
	public void doInduction() {
		System.out.println("Do induction for " +Name);
	}

	public void paySalary() {
		System.out.println("Pay"+ "Salary"+ "to "+ Name);
	}
	
	public void doTraining() {
		System.out.println("Do Training for "+ Name);
	}
}
