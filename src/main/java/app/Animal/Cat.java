package app.Animal;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I'm cat. My name is '" + name + '\'';
    }

}
