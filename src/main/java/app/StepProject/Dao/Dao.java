package app.StepProject.Dao;

import java.util.Collection;
import java.util.Optional;

public interface Dao<A> {

    Optional<A> getUser(int id);
    Collection<A> getAllUser();


}
