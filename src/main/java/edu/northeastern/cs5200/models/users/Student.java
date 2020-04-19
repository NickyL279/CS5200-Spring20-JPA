package edu.northeastern.cs5200.models.users;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import edu.northeastern.cs5200.models.job.Favorite;

@Entity
public class Student extends User {

  private Integer gradYear;
  private Integer scholarship;
  private StudentMajor major;
  @OneToOne
  private StudentAgreement agreement;


  @OneToMany(mappedBy = "student")
  private List<Favorite> favorites;
  @OneToMany(mappedBy = "student")
  private List<Application> application;

  @ManyToOne()
  private Advisor advisor;

  public Student() {
  }

  public Student(String firstName, String lastName, String username, String password, Integer gradYear, Integer scholarship) {
    super(firstName, lastName, username, password);
    this.gradYear = gradYear;
    this.scholarship = scholarship;
  }

  public Student(Integer gradYear, Integer scholarship, StudentMajor major, List<Favorite> favorites, Advisor advisor) {
    this.gradYear = gradYear;
    this.scholarship = scholarship;
    this.major = major;
    this.favorites = favorites;
    this.advisor = advisor;
  }

  public Student(String firstName, String lastName, String username, String password, Integer gradYear, Integer scholarship, StudentMajor major, List<Favorite> favorites, Advisor advisor) {
    super(firstName, lastName, username, password);
    this.gradYear = gradYear;
    this.scholarship = scholarship;
    this.major = major;
    this.favorites = favorites;
    this.advisor = advisor;
  }

  public Student(int id, String firstName, String lastName, String username, String password, List<Phone> phones, List<Address> addresses, Integer gradYear, Integer scholarship, StudentMajor major, List<Favorite> favorites, Advisor advisor) {
    super(id, firstName, lastName, username, password, phones, addresses);
    this.gradYear = gradYear;
    this.scholarship = scholarship;
    this.major = major;
    this.favorites = favorites;
    this.advisor = advisor;
  }

  public Student(int id, String firstName, String lastName, String username, String password, List<Phone> phones, List<Address> addresses, Integer gradYear, Integer scholarship, StudentMajor major, StudentAgreement agreement, List<Favorite> favorites, Advisor advisor) {
    super(id, firstName, lastName, username, password, phones, addresses);
    this.gradYear = gradYear;
    this.scholarship = scholarship;
    this.major = major;
    this.agreement = agreement;
    this.favorites = favorites;
    this.advisor = advisor;
  }

  public StudentAgreement getAgreement() {
    return agreement;
  }

  public void setAgreement(StudentAgreement agreement) {
    this.agreement = agreement;
  }

  public Integer getGradYear() {
    return gradYear;
  }

  public void setGradYear(Integer gradYear) {
    this.gradYear = gradYear;
  }

  public Integer getScholarship() {
    return scholarship;
  }

  public void setScholarship(Integer scholarship) {
    this.scholarship = scholarship;
  }

  public StudentMajor getMajor() {
    return major;
  }

  public void setMajor(StudentMajor major) {
    this.major = major;
  }

  public List<Favorite> getFavorites() {
    return favorites;
  }

  public void setFavorites(List<Favorite> favorites) {
    this.favorites = favorites;
  }

  public List<Application> getApplication() {
    return application;
  }

  public void setApplication(List<Application> application) {
    this.application = application;
  }

  public Advisor getAdvisor() {
    return advisor;
  }

  public void setAdvisor(Advisor advisor) {
    this.advisor = advisor;
  }
}


