package c08_PolymorphismExercises;

public class Personaje {
	public void attack() {
		
	}
	
	public static class Warrior extends Personaje {

		@Override
		public void attack() {
			System.out.println("El guerrero ataca con la espada");
		}
	}

	public static class Archer extends Personaje {

		@Override
		public void attack() {
			System.out.println("El arquero ataca con el arco");
		}
	}
	
	public static class Mage extends Personaje {

		@Override
		public void attack() {
			System.out.println("El mago ataca con el baculo");
		}
	}
}
