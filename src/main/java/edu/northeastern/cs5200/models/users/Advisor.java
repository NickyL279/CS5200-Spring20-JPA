package edu.northeastern.cs5200.models.users;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import edu.northeastern.cs5200.models.job.JobList;

@Entity
public class Advisor extends User {
  private String office;
  private Boolean tenured;

  @OneToMany(mappedBy = "advisor")
  private List<Student> advisedStudents;

  @OneToMany(mappedBy = "advisor")
  private List<JobList> jobLists;

  public Advisor(){}

  public Advisor(String office, Boolean tenured, List<Student> advisedStudents) {
    this.office = office;
    this.tenured = tenured;
    this.advisedStudents = advisedStudents;
  }

  public Advisor(String firstName, String lastName, String username, String password, String office, Boolean tenured, List<Student> advisedStudents, String dtype) {
    super(dtype, firstName, lastName, username, password);
    this.office = office;
    this.tenured = tenured;
    this.advisedStudents = advisedStudents;
  }

  public Advisor(int id, String firstName, String lastName, String username, String password, List<Phone> phones, List<Address> addresses, String office, Boolean tenured, List<Student> advisedStudents, String dtype) {
    super(id, dtype, firstName, lastName, username, password, phones, addresses);
    this.office = office;
    this.tenured = tenured;
    this.advisedStudents = advisedStudents;
  }

  public Advisor(int id, String firstName, String lastName, String username, String password, List<Phone> phones, List<Address> addresses, String office, Boolean tenured, List<Student> advisedStudents, List<JobList> jobLists, String dtype) {
    super(id, dtype, firstName, lastName, username, password, phones, addresses);
    this.office = office;
    this.tenured = tenured;
    this.advisedStudents = advisedStudents;
    this.jobLists = jobLists;
  }
  public void set(Advisor newAdvisor) {
    this.office = newAdvisor.office;
    this.tenured = newAdvisor.tenured;
    this.advisedStudents = newAdvisor.advisedStudents;
    this.jobLists = newAdvisor.jobLists;
  }
  public List<JobList> getJobLists() {
    return jobLists;
  }

  public void setJobLists(List<JobList> jobLists) {
    this.jobLists = jobLists;
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

  public List<Student> getAdvisedStudents() {
    return advisedStudents;
  }

  public void setAdvisedStudents(List<Student> advisedStudents) {
    this.advisedStudents = advisedStudents;
  }
}

