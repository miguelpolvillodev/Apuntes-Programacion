package c08_AbstractionExercises;

public class WashingMachine extends Appliance {


	@Override
	public void turnOn() {
		System.out.println("La lavadora se ha encendido");
	}
	
	@Override
	public void turnOff() {
		System.out.println("La lavadora se ha apagado");
	}

}
