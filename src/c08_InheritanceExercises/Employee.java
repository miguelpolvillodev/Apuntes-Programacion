package c08_InheritanceExercises;

public class Employee {

	String name;
	int salary;

	public void sayEmploye() {
		System.out.println("Empleado/a " + name + " con salario de " + salary + " euros");
	}

	public static class Manager extends Employee {
		String department;

		public void sayManager() {
			System.out.println("El manager " + name + " con salario de " + salary + " euros "
					+ "trabaja en el departamento de " + department);
		}
	}

}
