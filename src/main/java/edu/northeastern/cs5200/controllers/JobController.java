package edu.northeastern.cs5200.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import edu.northeastern.cs5200.models.job.Application;
import edu.northeastern.cs5200.models.job.Job;
import edu.northeastern.cs5200.models.job.JobList;
import edu.northeastern.cs5200.models.users.Admin;
import edu.northeastern.cs5200.models.users.Advisor;
import edu.northeastern.cs5200.models.users.Student;
import edu.northeastern.cs5200.models.users.User;
import edu.northeastern.cs5200.repositories.AdminRepository;
import edu.northeastern.cs5200.repositories.AdvisorRepository;
import edu.northeastern.cs5200.repositories.ApplicationRepository;
import edu.northeastern.cs5200.repositories.JobListRepository;
import edu.northeastern.cs5200.repositories.JobRepository;
import edu.northeastern.cs5200.repositories.StudentRepository;
import edu.northeastern.cs5200.repositories.UserRepository;

@RestController
@CrossOrigin
public class JobController {

  @Autowired
  ApplicationRepository applicationRepository;
  @Autowired
  JobRepository jobRepository;
  @Autowired
  JobListRepository jobListRepository;

//api's for find all

  @GetMapping("/api/allApplications")
  public List<Application> allApplications() {
    return (List<Application>) applicationRepository.findAll();
  }
  @GetMapping("/api/allJobs")
  public List<Job> allJobs() {
    return (List<Job>) jobRepository.findAll();
  }
  @GetMapping("/api/allJobList")
  public List<JobList> allJobList() {
    return (List<JobList>) jobListRepository.findAll();
  }


  //api's for find by id
  @GetMapping("/api/jobById/{jobId}")
  public void findJob
          (@PathVariable("jobId") int id) {
    jobRepository.findById(id);
  }
  @GetMapping("/api/jobListById/{jobListId}")
  public void findJobList
          (@PathVariable("jobListId") int id) {
    jobListRepository.findById(id);
  }
  @GetMapping("/api/applicationById/{applicationId}")
  public void findApplication
          (@PathVariable("applicationId") int id) {
    applicationRepository.findById(id);
  }


// insert api's
  @PostMapping("/api/addapplication")
  public Application createApplication(@RequestBody Application application) {
    return applicationRepository.save(application);
  }

  @PostMapping("/api/addJob")
  public Job createJob(@RequestBody Job job) {
    return jobRepository.save(job);
  }
  @PostMapping("/api/addJobList")
  public JobList createJobList(@RequestBody JobList jobList) {
    return jobListRepository.save(jobList);
  }
  //delete api's
  @DeleteMapping("/api/applications/{applicationId}")
  public void deleteApplication
          (@PathVariable("applicationId") int id) {
    applicationRepository.deleteById(id);
  }

  @DeleteMapping("/api/jobs/{jobId}")
  public void deleteJob
          (@PathVariable("jobId") int id) {
    jobRepository.deleteById(id);
  }

  @DeleteMapping("/api/jobLists/{jobListId}")
  public void deleteJobList
          (@PathVariable("jobListId") int id) {
    jobListRepository.deleteById(id);
  }

  //find all applications received for a job
  @GetMapping("/api/job/{jobId}/applications")
  public List<Application> findAllApplicationsForJob(
          @PathVariable("jobId") int jId) {
    Job job = jobRepository.findById(jId).orElse(null);
    assert job != null;
    return job.getApplications();
  }
}
