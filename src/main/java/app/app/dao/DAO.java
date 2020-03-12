package app.app.dao;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * this DAO doesn't cover any connection problems
 */
public interface DAO<A> {
  Optional<A> get(int id);
  Collection<A> getAll();
  Collection<A> getAllBy(Predicate<A> p);
 // Collection<A> getAllBy(String des, String date, int seats);
  void create(A data);
  void delete(int id);


}
