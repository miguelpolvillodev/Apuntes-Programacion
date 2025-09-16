package c08_PolymorphismExercises;

public class Notification {
	public void send() {

	}

	public static class EmailNotification extends Notification {

		@Override
		public void send() {
			System.out.println("Enviando correo...");
		}
	}

	public static class SMSNotification extends Notification {

		@Override
		public void send() {
			System.out.println("Enviando notificacion...");
		}
	}

	public static void sendNotification(Notification n) {
		n.send();

	}
}
