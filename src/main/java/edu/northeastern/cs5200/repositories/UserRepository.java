package edu.northeastern.cs5200.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import edu.northeastern.cs5200.models.users.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
  @Query("SELECT user from User user WHERE user.username=:username AND user.password=:password")
          public List<User> findUserByCredentials
          (@Param("username") String username,
          @Param("password") String password);
}
