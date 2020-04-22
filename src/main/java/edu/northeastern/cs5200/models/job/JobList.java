package edu.northeastern.cs5200.models.job;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import edu.northeastern.cs5200.models.users.Advisor;
import edu.northeastern.cs5200.models.users.Student;
import edu.northeastern.cs5200.models.users.StudentMajor;

@Entity
public class JobList {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String title;
  //https://tomee.apache.org/examples-trunk/jpa-enumerated/
  @Enumerated(EnumType.STRING)
  private StudentMajor allowedMajor;
  @ManyToOne
  private Advisor advisor;
  @OneToMany(mappedBy="jobList")
  private List<Job> job;

  @ManyToOne
  private JobList parent;
  @OneToMany(mappedBy="parent")
  private List<JobList> children;

  public JobList() {
  job=new ArrayList<>();
  }

  public JobList(Integer id, String title, StudentMajor allowedMajor, Advisor advisor, List<Job> job, JobList parent, List<JobList> children) {
    this.id = id;
    this.title = title;
    this.allowedMajor = allowedMajor;
    this.advisor = advisor;
    this.job = job;
    this.parent = parent;
    this.children = children;
    job=new ArrayList<>();
  }
  public void addJob(Job job)
  {
    this.job.add(job);
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public StudentMajor getAllowedMajor() {
    return allowedMajor;
  }

  public void setAllowedMajor(StudentMajor allowedMajor) {
    this.allowedMajor = allowedMajor;
  }

  public Advisor getAdvisor() {
    return advisor;
  }

  public void setAdvisor(Advisor advisor) {
    this.advisor = advisor;
  }

  public List<Job> getJob() {
    return job;
  }

  public void setJob(List<Job> job) {
    this.job = job;
  }

  public JobList getParent() {
    return parent;
  }

  public void setParent(JobList parent) {
    this.parent = parent;
  }

  public List<JobList> getChildren() {
    return children;
  }

  public void setChildren(List<JobList> children) {
    this.children = children;
  }
}