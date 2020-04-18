package edu.northeastern.cs5200.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import edu.northeastern.cs5200.models.users.User;
import edu.northeastern.cs5200.repositories.UserRepository;

@RestController
public class UserController {

  @Autowired
  UserRepository userRepository;

  @Autowired
  AdvisorRepository advisorRepository;

  @Autowired
  StudentRepository studentRepository;

  @Autowired
  AdminRepository adminRepository;



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


  @GetMapping("/api/addUser")
  public String addUser() {
    userRepository.save(new User("alice", "wonder", "username", "pass"));
    return "done";
  }

  @GetMapping("/api/addStudent")
  public String addStudent() {
    studentRepository.save(new Student("alice", "wonder", "username", "pass",2020,2000));
    return "done";
  }

  @GetMapping("/api/addAdvisor")
  public String addStudent() {
    Student s1=new Student("alice", "wonder", "username", "pass",2020,2000);
    Student s2=new Student("Bob", "Mark", "username", "pass",2021,2000);
    List<Student> s=new ArrayList<>();
    s.add(s1);
    s.add(s2);

    advisorRepository.save(new Advisor("Adam", "Copper", "username", "pass","A1",true,s));
    return "done";
  }

}
