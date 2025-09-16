package c08_InheritanceExercises;

public class Account {

	int saldo;

	public void deposit(int deposit) {
		System.out.println("Ha ingresado: " + deposit);
		System.out.println("Su saldo es ahora de: " + (saldo + deposit));
	}

	public void withdraw(int retirar) {
		System.out.println("Ha retirado: " + retirar);
		System.out.println("Su saldo es ahora de: " + (saldo - retirar));
	}

	public static class SavingsAccount extends Account {

		public void addInterest(double interes) {
			double ganancia = saldo * interes;
		    saldo += ganancia;
		    System.out.println("Ha guardado en la cuenta: " + ganancia);
		    System.out.println("Su saldo con interés es ahora de: " + saldo);
		}
	}
}
