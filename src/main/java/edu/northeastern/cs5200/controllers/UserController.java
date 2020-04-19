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


  @CrossOrigin(origins="http://localhost:3000")
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

//find all applications submitted by a student
  @GetMapping("/api/student/{studentId}/applications")
  public List<Application> findAllApplicationsForStudent(
          @PathVariable("studentId") int sId) {
    Student student = studentRepository.findById(sId).orElse(null);
    return student.getApplication();
  }

  //find all applications received for a job
  @GetMapping("/api/job/{jobId}/applications")
  public List<Application> findAllApplicationsForJob(
          @PathVariable("jobId") int jId) {
    Job job = jobRepository.findById(jId).orElse(null);
    return job.getApplications();
  }


//  @GetMapping("/api/addUser")
//  public String addUser() {
//    userRepository.save(new User("alice", "wonder", "username", "pass"));
//    return "done";
//  }
//
//  @GetMapping("/api/addStudent")
//  public String addStudent() {
//    studentRepository.save(new Student("alice", "wonder", "username", "pass",2020,2000));
//    return "done";
//  }
//
//  @GetMapping("/api/addAdvisor")
//  public String addAdvisor() {
//    Student s1=new Student("alice", "wonder", "username", "pass",2020,2000);
//    Student s2=new Student("Bob", "Mark", "username", "pass",2021,2000);
//    List<Student> s=new ArrayList<>();
//    s.add(s1);
//    s.add(s2);
//
//    advisorRepository.save(new Advisor("Adam", "Copper", "username", "pass","A1",true,s));
//    return "done";
//  }




}
