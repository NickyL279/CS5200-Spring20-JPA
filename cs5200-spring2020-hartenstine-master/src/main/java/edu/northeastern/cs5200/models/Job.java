package edu.northeastern.cs5200.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Job {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private int id;
  private String jobTitle;
  private String jobKey;
  private String company;
  private Date date;
  private String url;
  private String snippet;
  @OneToMany(mappedBy = "job")
  @JsonIgnore
  private List<Favorite> favorites;


  public Job() { }

  public Job(String jobTitle, String jobKey, String company, Date date, String url, String snippet, List<Favorite> favorites) {
    this.jobTitle = jobTitle;
    this.jobKey = jobKey;
    this.company = company;
    this.date = date;
    this.url = url;
    this.snippet = snippet;
    this.favorites = favorites;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public String getJobKey() {
    return jobKey;
  }

  public void setJobKey(String jobKey) {
    this.jobKey = jobKey;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getSnippet() {
    return snippet;
  }

  public void setSnippet(String snippet) {
    this.snippet = snippet;
  }

  public List<Favorite> getFavorites() {
    return favorites;
  }

  public void setFavorites(List<Favorite> favorites) {
    this.favorites = favorites;
  }
}

