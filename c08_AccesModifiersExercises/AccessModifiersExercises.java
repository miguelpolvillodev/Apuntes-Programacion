package c08_AccesModifiersExercises;

public class AccessModifiersExercises {

	public static void main(String[] args) {
		
		// 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge()
		// para asignar y mostrar valores desde otra clase.		
var person = new Person ();
person.setName("Miguel");
person.setAge(26);
System.out.println("Me llamo "+ person.getName() + " y tengo " + person.getAge() + " años");

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
Product product = new Product();
product.setPrice(20);
		
        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount)
		// que validen las cantidades correctamente.
BankAccount bankAccount = new BankAccount();
bankAccount.setBalance(2000);
bankAccount.setDeposit(100);
bankAccount.setWithdraw(50);
System.out.println("Su deposito ha sido de: " + bankAccount.getDeposit() + ", saldo total: " + (bankAccount.getDeposit() + bankAccount.getBalance()));
System.out.println("Su retiro ha sido de: " + bankAccount.getWithdraw() + ", saldo total: " + (bankAccount.getBalance() - bankAccount.getWithdraw()));

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()).
		// El título debe asignarse solo por el constructor.
Book book = new Book("El principito");
System.out.println(book.getTitle());

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius)
		// solo debe aceptar valores entre -100 y 100.
Temperature temp = new Temperature();
temp.setCelsius(99);

        // 6. Crea una clase User con los atributos privados username y password.
		// Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) 
		// que compare contraseñas.
User user = new User();

user.setUser("Miguel");
user.setPassword("123");

System.out.println(user.getUser());
System.out.println(user.getPassword());
user.checkPassword("123");

        // 7. Crea una clase Employee con el atributo privado salary.
		// Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
Employee employee = new Employee();

employee.setSalary(100);

employee.raiseSalary(1);

        // 8. Crea una clase Rectangle con los atributos privados width y height.
		// Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
Rectangle rectangle = new Rectangle();

rectangle.setHeight(2);
rectangle.setWidth(2);

rectangle.calculateArea(0);

        // 9. Crea una clase Student con el atributo privado grade.
		// Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
Student student = new Student();

student.setGrade(60);

student.isPassed();

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120)
		// y brake(int amount) que reduzca la velocidad (mínimo 0).
Car car = new Car();

car.setSpeed(120);

car.accelerate(1);
car.brake(1);

	}

}
