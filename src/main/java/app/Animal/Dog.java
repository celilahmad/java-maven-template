package app.Animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public String toString() {
       return "I'm dog. My name is '" + name + '\'';
    }
}
