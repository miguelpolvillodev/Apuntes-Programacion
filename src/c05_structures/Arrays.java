package c05_structures;

public class Arrays {

	public static void main(String[] args) {
		
		// Declaracion y creacion
		int[] numbers = new int[3];
		System.out.println(numbers);
		
		String[] names = {"Brais", "Moure", "mouredev"};
		System.out.println(names);
		
																			System.out.println();
		// Acceso
		System.out.println(numbers[1]);
		System.out.println(names[0]);
		
		System.out.println((new String[3])[0]);
		
																			System.out.println();
		// Modificacion
		numbers[0] = 1;
		numbers[1] = 10;
		numbers[2] = 20;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
																			System.out.println();
		// numbers[3] = 2; Error
		
																			
		System.out.println(names[2]);
		names[2] = "mouredev@gmail.com";
		System.out.println(names[2]);
		
		System.out.println(names.length);
		names[2] = null;
		System.out.println(names[2]);
		System.out.println(names.length);
		
																			System.out.println();
		// numbers[2] = null; Error
		
		boolean[] booleans = new boolean[5];
        System.out.println(booleans[4]);
		
				
      // Tamaño fijo y tipo de datos iguales		
				
					
				
	}	

}
