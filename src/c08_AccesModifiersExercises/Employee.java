package c08_AccesModifiersExercises;

public class Employee {

	private double salary;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void raiseSalary(double percent) {
		
		if (percent > 0) {
			salary += percent;
			System.out.println(salary);
			
		} else {
			System.out.println("No se puede realizar la operacion");
		}
		
	}
	
}
