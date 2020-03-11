package app.StepProject.Entity;

public class User {

    private int id;
    private String name;
    private String surname;

    public User(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public User(String name, String surname) {
        this.name=name;
        this.surname=surname;
    }

    @Override
    public String toString() {
        return String.format("Student[id=%d, name='%s', surname=%s]", id, name, surname);
    }
}
