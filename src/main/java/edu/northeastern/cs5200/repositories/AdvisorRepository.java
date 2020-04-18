package edu.northeastern.cs5200.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.models.users.Advisor;

@Repository
public interface AdvisorRepository extends CrudRepository<Advisor, Integer> {
}
