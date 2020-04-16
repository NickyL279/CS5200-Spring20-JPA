package edu.northeastern.cs5200.models.job;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Job {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String title;
  private String description;
  private String company;
  private String location;
  private String requirement;


  @OneToMany(mappedBy = "job")
  private List<Application> applications;

  public Job(){

  }

  public Job(String title, String description, String company, String location, String requirement) {
    this.title = title;
    this.description = description;
    this.company = company;
    this.location = location;
    this.requirement = requirement;
  }


  public void addApplication(Application a) {
    applications.add(a);
  }

  public void removeApplication(Application a) {
    applications.remove(a);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getRequirement() {
    return requirement;
  }

  public void setRequirement(String requirement) {
    this.requirement = requirement;
  }

  public List<Application> getApplications() {
    return applications;
  }

  public void setApplications(List<Application> applications) {
    this.applications = applications;
  }
}
