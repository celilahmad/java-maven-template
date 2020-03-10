package app.StepProject.Dao;

import app.StepProject.Entity.User;

import java.util.Collection;
import java.util.Optional;

public class UserDao implements Dao<User> {
    @Override
    public Optional getUser(int id) {
        return Optional.empty();
    }

    @Override
    public Collection getAllUser() {
        return null;
    }


}
