package edu.northeastern.cs5200.models.users;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.*;

@Entity
public class Application {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String description;
  private String status;
  @ManyToOne
  private Student student;
  @ManyToOne
  private Job job;

  public Application(String description, String status, Student student, Job job) {
    this.description = description;
    this.status = status;
    this.student = student;
    this.job = job;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
    student.addApplication(this);
  }

  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
    job.addApplication(this);
  }
}