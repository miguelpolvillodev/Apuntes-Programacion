package c08_PolymorphismExercises;

class Animal2 {
    public String getType() {
        return "Unknown Animal";
    }
}

class Dogy extends Animal2 {
    @Override
    public String getType() {
        return "Dog";
    }
}

class Caty extends Animal2 {
    @Override
    public String getType() {
        return "Cat";
    }
}

class Horse extends Animal2 {
    @Override
    public String getType() {
        return "Horse";
    }
}
