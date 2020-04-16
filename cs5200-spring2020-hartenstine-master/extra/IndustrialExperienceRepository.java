package edu.northeastern.cs5200.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.northeastern.cs5200.models.resume.IndustrialExperience;

public interface IndustrialExperienceRepository extends CrudRepository<IndustrialExperience, Integer>{

}