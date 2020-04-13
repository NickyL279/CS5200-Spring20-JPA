package edu.northeastern.cs5200.repositories;

import edu.northeastern.cs5200.models.users.Admin;
import edu.northeastern.cs5200.models.users.Advisor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {
}
