package edu.northeastern.cs5200.models.job;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import edu.northeastern.cs5200.models.users.Student;

@Entity
public class Application {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String description;
  private String referral;
  //https://tomee.apache.org/examples-trunk/jpa-enumerated/
  @Enumerated(EnumType.STRING)
  private ApplicationStatus applicationStatus;
  @ManyToOne
  private Student student;
  @ManyToOne
  private Job job;

  public Application() {

  }

  public Application(Integer id, String description, String referral, ApplicationStatus applicationStatus, Student student, Job job) {
    this.id = id;
    this.description = description;
    this.referral = referral;
    this.applicationStatus = applicationStatus;
    this.student = student;
    this.job = job;
  }

  public Application(String description, String referral, ApplicationStatus applicationStatus, Student student, Job job) {
    this.description = description;
    this.referral = referral;
    this.applicationStatus = applicationStatus;
    this.student = student;
    this.job = job;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getReferral() {
    return referral;
  }

  public void setReferral(String referral) {
    this.referral = referral;
  }

  public ApplicationStatus getApplicationStatus() {
    return applicationStatus;
  }

  public void setApplicationStatus(ApplicationStatus applicationStatus) {
    this.applicationStatus = applicationStatus;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }
}