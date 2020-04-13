package edu.northeastern.cs5200.models.users;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import edu.northeastern.cs5200.models.Favorite;

@Entity
public class Applicant extends User {

  private Integer gradYear;
  private Integer scholarship;

  @OneToMany(mappedBy = "applicant")
  private List<Favorite> favorites;

  @ManyToOne()
  private Advisor advisor;

  public Applicant() {
  }

  public Applicant(int id, String firstName, String lastName, String username, String password, Integer gradYear, Integer scholarship, List<Favorite> favorites) {
    super(id, firstName, lastName, username, password);
    this.gradYear = gradYear;
    this.scholarship = scholarship;
    this.favorites = favorites;
  }

  public Applicant(String firstName, String lastName, String username, String password, Integer gradYear, Integer scholarship) {
    super(firstName, lastName, username, password);
    this.gradYear = gradYear;
    this.scholarship = scholarship;
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

  public List<Favorite> getFavorites() {
    return favorites;
  }

  public void setFavorites(List<Favorite> enrolledSections) {
    this.favorites = enrolledSections;
  }
}
