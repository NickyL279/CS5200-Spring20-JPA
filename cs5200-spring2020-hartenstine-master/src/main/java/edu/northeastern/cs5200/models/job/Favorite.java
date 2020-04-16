package edu.northeastern.cs5200.models.job;

import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import edu.northeastern.cs5200.models.users.Student;

@Entity
public class Favorite {

  @EmbeddedId
  private FavoriteKey id;

  private Date followup;

  @ManyToOne
  @MapsId("student")
  private Student student;

  @ManyToOne
  @MapsId("job")
  private Job job;

  public Favorite() {
  }

  public Favorite(FavoriteKey id, Date followup, Student student, Job job) {
    this.id = id;
    this.followup = followup;
    this.student = student;
    this.job = job;
  }

  public Favorite(Student student, Job job) {
    this.student = student;
    this.job = job;
    this.id = new FavoriteKey();
  }

  public FavoriteKey getId() {
    return id;
  }

  public void setId(FavoriteKey id) {
    this.id = id;
  }

  public Date getFollowup() {
    return followup;
  }

  public void setFollowup(Date grade) {
    this.followup = grade;
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
