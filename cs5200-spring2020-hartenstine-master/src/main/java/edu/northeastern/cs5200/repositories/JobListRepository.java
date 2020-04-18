package edu.northeastern.cs5200.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.models.job.JobList;

@Repository
public interface JobListRepository extends CrudRepository<JobList, Integer> {
}