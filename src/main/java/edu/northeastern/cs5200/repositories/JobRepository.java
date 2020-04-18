package edu.northeastern.cs5200.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.models.job.Job;

@Repository
public interface JobRepository extends CrudRepository<Job, Integer> {
}
