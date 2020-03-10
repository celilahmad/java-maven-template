package app.StepProject.Entity;

public class User {

    final int id;
    final String name;
    final String surname;

    public User(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Student[id=%d, name='%s', surname=%s]", id, name, surname);
    }
}
