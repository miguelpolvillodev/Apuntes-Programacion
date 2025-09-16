package c08_InheritanceExercises;

public class AnimalesAL {
	    String name;
	    String sound;

	    public void makeSound() {
	        System.out.println("El " + name + " hace " + sound);
	    }

	    public static class Perro extends Animal {
	        public Perro(String name, String sound) {
	            this.name = name;
	            this.sound = sound;
	        }
	    }

	    public static class Gato extends Animal {
	        public Gato(String name, String sound) {
	            this.name = name;
	            this.sound = sound;
	        }
	    }

	    public static class Pajaro extends Animal {
	        public Pajaro(String name, String sound) {
	            this.name = name;
	            this.sound = sound;
	        }
	    }
	}

