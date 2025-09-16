package c08_InheritanceExercises;

public class Bird {

	public void fly() {
		System.out.println("vuela");
	}

	public static class Eagle extends Bird {
		public void fly() {
			System.out.print("El aguila ");
			super.fly();
			

		}
	}

}
