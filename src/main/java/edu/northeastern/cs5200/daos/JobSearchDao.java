package edu.northeastern.cs5200.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.northeastern.cs5200.models.users.Advisor;
import edu.northeastern.cs5200.models.users.Student;
import edu.northeastern.cs5200.models.users.User;
import edu.northeastern.cs5200.repositories.AdvisorRepository;
import edu.northeastern.cs5200.repositories.FavoriteRepository;
import edu.northeastern.cs5200.repositories.JobRepository;
import edu.northeastern.cs5200.repositories.UserRepository;

@Component
public class JobSearchDao {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private AdvisorRepository advisorRepository;

  @Autowired
  private FavoriteRepository favoriteRepository;

  @Autowired
  private JobRepository jobRepository;

  public void truncateDatabase() {
    favoriteRepository.deleteAll();
    userRepository.deleteAll();
    jobRepository.deleteAll();
  }

  public User createUser(User user) {
    userRepository.save(user);
    return user;
  }

  public Advisor createAdvisor(Advisor advisor) {
    advisorRepository.save(advisor);
    return advisor;
  }


}
