package edu.northeastern.cs5200.models.users;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Advisor extends User {
  private String office;
  private Boolean tenured;

  @OneToMany(mappedBy = "advisor")
  private List<Applicant> advisedApplicants;

  public Advisor(){}

  public Advisor(String office, Boolean tenured, List<Applicant> advisedApplicants) {
    this.office = office;
    this.tenured = tenured;
    this.advisedApplicants = advisedApplicants;
  }

  public Advisor(int id, String firstName, String lastName, String username, String password, String office, Boolean tenured, List<Applicant> advisedApplicants) {
    super(id, firstName, lastName, username, password);
    this.office = office;
    this.tenured = tenured;
    this.advisedApplicants = advisedApplicants;
  }

  public Advisor(String firstName, String lastName, String username, String password, String office, Boolean tenured) {
    super(firstName, lastName, username, password);
    this.office = office;
    this.tenured = tenured;
  }

  public String getOffice() {
    return office;
  }

  public void setOffice(String office) {
    this.office = office;
  }

  public Boolean getTenured() {
    return tenured;
  }

  public void setTenured(Boolean tenured) {
    this.tenured = tenured;
  }

  public List<Applicant> getAdvisedApplicants() {
    return advisedApplicants;
  }

  public void setAdvisedApplicants(List<Applicant> authoredCourses) {
    this.advisedApplicants = authoredCourses;
  }
}

