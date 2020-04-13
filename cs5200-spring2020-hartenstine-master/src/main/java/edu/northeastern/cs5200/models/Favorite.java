package edu.northeastern.cs5200.models;

import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import edu.northeastern.cs5200.models.users.Applicant;

@Entity
public class Favorite {

  @EmbeddedId
  private FavoriteKey id;

  private Date followup;

  @ManyToOne
  @MapsId("applicant")
  private Applicant applicant;

  @ManyToOne
  @MapsId("job")
  private Job job;

  public Favorite() {
  }

  public Favorite(FavoriteKey id, Date followup, Applicant applicant, Job job) {
    this.id = id;
    this.followup = followup;
    this.applicant = applicant;
    this.job = job;
  }

  public Favorite(Applicant applicant, Job job) {
    this.applicant = applicant;
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

  public Applicant getApplicant() {
    return applicant;
  }

  public void setApplicant(Applicant applicant) {
    this.applicant = applicant;
  }

  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }


}
