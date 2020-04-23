package edu.northeastern.cs5200.models.job;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import edu.northeastern.cs5200.models.users.Student;

@Entity
public class Favorite {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private Date followup;

  @ManyToOne
  private Student student;

  @ManyToOne
  private Job job;

  public Favorite() {
  }

  public Favorite(Integer id, Date followup, Student student, Job job) {
    this.id = id;
    this.followup = followup;
    this.student = student;
    this.job = job;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getFollowup() {
    return followup;
  }

  public void setFollowup(Date followup) {
    this.followup = followup;
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
