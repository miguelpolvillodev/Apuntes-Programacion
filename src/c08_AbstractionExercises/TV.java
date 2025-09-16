package c08_AbstractionExercises;

public class TV extends Appliance {


	@Override
	public void turnOn() {
		System.out.println("La TV se ha encendido");
	}
	
	@Override
	public void turnOff() {
		System.out.println("La TV se ha apagado");
	}

}
