package edu.northeastern.cs5200.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.models.Favorite;
import edu.northeastern.cs5200.models.users.Applicant;

@Repository
public interface ApplicantRepository extends CrudRepository<Applicant, Integer> {
}
