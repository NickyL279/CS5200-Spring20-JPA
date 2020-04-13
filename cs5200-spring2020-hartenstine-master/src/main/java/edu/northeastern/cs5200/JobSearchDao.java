package edu.northeastern.cs5200;


import edu.northeastern.cs5200.models.users.*;
import org.springframework.stereotype.Component;

@Component
public interface JobSearchDao {

  /*
   * removes all the data from the database. Note that you might need to remove records in a
   * particular order
   **/
  void truncateDatabase();

  User createUser(User user);
  Advisor createAdvisor(Advisor advisor);
  Admin createAdmin(Admin admin);
  Student createStudent(Student student);
  Applicant createApplicant(Applicant applicant);
}
