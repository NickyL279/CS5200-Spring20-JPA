package edu.northeastern.cs5200.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import edu.northeastern.cs5200.models.users.*;
import edu.northeastern.cs5200.repositories.*;
import edu.northeastern.cs5200.models.job.*;

@RestController
@CrossOrigin
public class UserController {

  @Autowired
  UserRepository userRepository;

  @Autowired
  AdvisorRepository advisorRepository;

  @Autowired
  StudentRepository studentRepository;

  @Autowired
  ApplicationRepository applicationRepository;
  @Autowired
  AdminRepository adminRepository;
  @Autowired
  JobRepository jobRepository;
  @Autowired
  JobListRepository jobListRepository;

//api's for find all
  @GetMapping("/api/allUsers")
  public List<User> allUsers() {
    return (List<User>) userRepository.findAll();
  }
  @GetMapping("/api/allAdvisors")
  public List<Advisor> allAdvisor() {
    return (List<Advisor>) advisorRepository.findAll();
  }
  @GetMapping("/api/allStudents")
  public List<Student> allStudents() {
    return (List<Student>) studentRepository.findAll();
  }
  @GetMapping("/api/allAdmins")
  public List<Admin> allAdmins() {
    return (List<Admin>) adminRepository.findAll();
  }
  @GetMapping("/api/allApplications")
  public List<Application> allApplications() {
    return (List<Application>) applicationRepository.findAll();
  }
  @GetMapping("/api/allJobs")
  public List<Job> allJobs() {
    return (List<Job>) jobRepository.findAll();
  }
  @GetMapping("/api/allJobList")
  public List<JobList> allJobList() {
    return (List<JobList>) jobListRepository.findAll();
  }

  //user login
  @GetMapping("/api/userlogin/{username}/{password}")
  public List<User> userLogin(@PathVariable("username") String username,
                              @PathVariable("password") String password) {
    return userRepository.findUserByCredentials(username,password);
  }
  //api's for find by id
  @GetMapping("/api/userById/{userId}")
  public void findUser
          (@PathVariable("userId") int id) {
    userRepository.findById(id);
  }

  @GetMapping("/api/studentById/{studentId}")
  public void findStudent
          (@PathVariable("studentId") int id) {
    studentRepository.findById(id);
  }
  @GetMapping("/api/advisorById/{advisorId}")
  public void findAdvisor
          (@PathVariable("advisorId") int id) {
    advisorRepository.findById(id);
  }
  @GetMapping("/api/jobById/{jobId}")
  public void findJob
          (@PathVariable("jobId") int id) {
    jobRepository.findById(id);
  }
  @GetMapping("/api/jobListById/{jobListId}")
  public void findJobList
          (@PathVariable("jobListId") int id) {
    jobListRepository.findById(id);
  }
  @GetMapping("/api/applicationById/{applicationId}")
  public void findApplication
          (@PathVariable("applicationId") int id) {
    applicationRepository.findById(id);
  }
  @GetMapping("/api/adminById/{adminId}")
  public void findAdmin
          (@PathVariable("adminId") int id) {
    adminRepository.findById(id);
  }


// insert api's
  @PostMapping("/api/adduser")
  public User createUser(@RequestBody User user) {
    return userRepository.save(user);
  }
  @PostMapping("/api/addadvisor")
  public Advisor createAdviosr(@RequestBody Advisor advisor) {
    return advisorRepository.save(advisor);
  }
  @PostMapping("/api/addstudent")
  public Student createStudent(@RequestBody Student student) {
    return studentRepository.save(student);
  }
  @PostMapping("/api/addadmin")
  public Admin createAdmin(@RequestBody Admin admin) {
    return adminRepository.save(admin);
  }
  @PostMapping("/api/addapplication")
  public Application createApplication(@RequestBody Application application) {
    return applicationRepository.save(application);
  }

  @PostMapping("/api/addJob")
  public Job createJob(@RequestBody Job job) {
    return jobRepository.save(job);
  }
  @PostMapping("/api/addJobList")
  public JobList createJobList(@RequestBody JobList jobList) {
    return jobListRepository.save(jobList);
  }
  //delete api's
  @DeleteMapping("/api/users/{userId}")
  public void deleteUser
          (@PathVariable("userId") int id) {
    userRepository.deleteById(id);
  }

  @DeleteMapping("/api/students/{studentId}")
  public void deleteStudent
          (@PathVariable("studentId") int id) {
    studentRepository.deleteById(id);
  }
  @DeleteMapping("/api/advisors/{advisorId}")
  public void deleteAdvisor
          (@PathVariable("advisorId") int id) {
    advisorRepository.deleteById(id);
  }
  @DeleteMapping("/api/admins/{adminId}")
  public void deleteAdmin
          (@PathVariable("adminId") int id) {
    adminRepository.deleteById(id);
  }

  @DeleteMapping("/api/applications/{applicationId}")
  public void deleteApplication
          (@PathVariable("applicationId") int id) {
    applicationRepository.deleteById(id);
  }

  @DeleteMapping("/api/jobs/{jobId}")
  public void deleteJob
          (@PathVariable("jobId") int id) {
    jobRepository.deleteById(id);
  }

  @DeleteMapping("/api/jobLists/{jobListId}")
  public void deleteJobList
          (@PathVariable("jobListId") int id) {
    jobListRepository.deleteById(id);
  }
 // update user type
 @PutMapping("/api/users/{userId}")
 public User updateUser(
         @PathVariable("userId") int id,
         @RequestBody User newUser) {
   User user = userRepository.findById(id).get();
   user.set(newUser);
   return userRepository.save(user);
  }
  //update student
  @PutMapping("/api/students/{studentId}")
  public Student updateStudent(
          @PathVariable("studentId") int id,
          @RequestBody Student newStudent) {
    Student student = studentRepository.findById(id).get();
    student.set(newStudent);
    return studentRepository.save(student);
  }
  //update advisor
  @PutMapping("/api/advisors/{advisorId}")
  public Advisor updateAdvisor(
          @PathVariable("advisorId") int id,
          @RequestBody Advisor newAdvisor) {
    Advisor advisor = advisorRepository.findById(id).get();
    advisor.set(newAdvisor);
    return advisorRepository.save(advisor);
  }

  //find all applications submitted by a student
  @GetMapping("/api/student/{studentId}/applications")
  public List<Application> findAllApplicationsForStudent(
          @PathVariable("studentId") int sId) {
    Student student = studentRepository.findById(sId).orElse(null);
    assert student != null;
    return student.getApplication();
  }

  //find all applications received for a job
  @GetMapping("/api/job/{jobId}/applications")
  public List<Application> findAllApplicationsForJob(
          @PathVariable("jobId") int jId) {
    Job job = jobRepository.findById(jId).orElse(null);
    assert job != null;
    return job.getApplications();
  }
}
