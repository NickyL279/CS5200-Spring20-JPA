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

  @GetMapping("/api/allUsers")
  public List<User> allUsers() {
    return (List<User>) userRepository.findAll();
  }


  @GetMapping("/api/addUser")
  public String addUser() {
    userRepository.save(new User("alice", "wonder", "username", "pass"));
    System.out.prin("");
    return "done";
  }

}
