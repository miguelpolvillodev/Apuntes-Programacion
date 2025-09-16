package c08_InheritanceExercises;

public class Device {

	String name;

	public Device() {

		System.out.println("Device created");

	}

	public static class Phone extends Device {
		
		public Phone() {

			System.out.println("Phone Ready");

		}
	}

}
