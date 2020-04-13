package edu.northeastern.cs5200;

import edu.northeastern.cs5200.models.users.*;
import edu.northeastern.cs5200.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JobSearchDaoImpl implements JobSearchDao {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private AdvisorRepository advisorRepository;

  @Autowired
  private AdminRepository adminRepository;

  @Autowired
  private StudentRepository studentRepository;

  @Autowired
  private ApplicantRepository applicantRepository;

  @Autowired
  private FavoriteRepository favoriteRepository;

  @Autowired
  private JobRepository jobRepository;

  @Override
  public void truncateDatabase() {
    favoriteRepository.deleteAll();
    userRepository.deleteAll();
    jobRepository.deleteAll();
    advisorRepository.deleteAll();
    adminRepository.deleteAll();
    applicantRepository.deleteAll();
    favoriteRepository.deleteAll();

  }

  @Override
  public User createUser(User user) {
    userRepository.save(user);
    return user;
  }

  @Override
  public Advisor createAdvisor(Advisor advisor) {
    advisorRepository.save(advisor);
    return advisor;
  }

  @Override
  public Admin createAdmin(Admin admin) {
    adminRepository.save(admin);
    return admin;
  }

  @Override
  public Student createStudent(Student student) {
    studentRepository.save(student);
    return student;
  }

  @Override
  public Applicant createApplicant(Applicant applicant) {
    applicantRepository.save(applicant);
    return applicant;
  }
}
