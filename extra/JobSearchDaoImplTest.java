package edu.northeastern.cs5200;



import edu.northeastern.cs5200.daos.JobSearchDao;
import edu.northeastern.cs5200.models.users.Admin;
import edu.northeastern.cs5200.models.users.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.northeastern.cs5200.models.users.Advisor;
import edu.northeastern.cs5200.models.users.Student;

@SpringBootTest
class JobSearchDaoImplTest {

  @Autowired
  JobSearchDao jobSearchDao;

  @Test
  public void truncateDatabase() {
    jobSearchDao.truncateDatabase();
  }

  @Test
  public void createUser() {
  }

  @Test
  public void createAdvisor() {
    jobSearchDao.createAdvisor(new Advisor("Alan", "Turin", "alan", "password"));
    jobSearchDao.createAdvisor(new Advisor("Ada", "Lovelace", "ada", "password"));
  }

  @Test
  public void createStudent() {
    jobSearchDao.createStudent(new Student("Mary", "Smith", "Smith", "password"));
    jobSearchDao.createStudent(new Student("John", "Jones", "Jones", "password"));
  }

  @Test
  public void createAdmin() {
    jobSearchDao.createAdmin(new Admin("Taylor", "Robert", "Robert", "password"));
    jobSearchDao.createAdmin(new Admin("Williams", "Michael", "Michael", "password"));
  }

  @Test
  public void createStudent() {
    jobSearchDao.createStudent(new Student("Alice", "Wonderland", "alice", "password", 2020, 12000));
    jobSearchDao.createStudent(new Student("Bob", "Hope", "bob", "password", 2021, 23000));
    jobSearchDao.createStudent(new Student("Charlie", "Brown", "charlie", "password", 2019, 21000));
  }
}