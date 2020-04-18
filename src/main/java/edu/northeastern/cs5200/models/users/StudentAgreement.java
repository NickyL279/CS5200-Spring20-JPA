package edu.northeastern.cs5200.models.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentAgreement {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Boolean submitted;
  private Boolean verified;
  @OneToOne(mappedBy = "agreement")
  private Student student;

  public StudentAgreement(){}

  public StudentAgreement(Boolean submitted, Boolean verified, Student student) {
    this.submitted = submitted;
    this.verified = verified;
    this.student = student;
  }

  public StudentAgreement(Integer id, Boolean submitted, Boolean verified, Student student) {
    this.id = id;
    this.submitted = submitted;
    this.verified = verified;
    this.student = student;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Boolean getSubmitted() {
    return submitted;
  }

  public void setSubmitted(Boolean submitted) {
    this.submitted = submitted;
  }

  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }
}
