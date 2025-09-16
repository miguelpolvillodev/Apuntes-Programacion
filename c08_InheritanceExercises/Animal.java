package c08_InheritanceExercises;

public class Animal {
    String name;
    String sound;

    public void makeSound() {
        System.out.println("El " + name + " hace " + sound);
    }

    public static class Dog extends Animal {
        public Dog(String name, String sound) {
            this.name = name;
            this.sound = sound;
        }
    }

    public static class Cat extends Animal {
        public Cat(String name, String sound) {
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