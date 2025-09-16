package c05_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {

	public static void main(String[] args) {
		
		// 1. Crea un Array con 5 valores e imprime su longitud.
int [] numb = new int [5];
System.out.println(numb.length);
        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
System.out.println(numb[2]);
numb[2] = 10;
System.out.println(numb[2]);

        // 3. Crea un ArrayList vacío.
ArrayList<Integer> numbers = new ArrayList<>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.add(4);
System.out.println(numbers);

        // 5. Crea un HashSet con 2 valores diferentes.
HashSet<String> names = new HashSet<>();
names.add("Miguel");
names.add("Marina");
System.out.println(names);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
names.add("Miguel");
names.add("Rafa");
System.out.println(names);

        // 7. Elimina uno de los elementos del HashSet.
names.remove("Rafa");
System.out.println(names);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
HashMap<String, Integer> contacto = new HashMap<>();
contacto.put("Miguel", 673509115);
contacto.put("Erosa", 673509225);
contacto.put("Rafa", 673509335);


        // 9. Modifica uno de los contactos y elimina otro.
contacto.replace("Rafa", 673509445);
System.out.println(contacto);
contacto.remove("Erosa");
System.out.println(contacto);


        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
Integer[] array = {1, 2, 3, 4, 2, 3}; 

// Paso 1: Array → ArrayList
ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
System.out.println("ArrayList: " + arrayList);

// Paso 2: ArrayList → HashSet
HashSet<Integer> hashSet = new HashSet<>(arrayList);
System.out.println("HashSet: " + hashSet);

// Paso 3: HashSet → HashMap con clave=valor
HashMap<Integer, Integer> hashMap = new HashMap<>();
for (Integer num : hashSet) {
	hashMap.put(num, num);	// clave = valor
}
System.out.println("HashMap: " + hashMap);
	}

}
