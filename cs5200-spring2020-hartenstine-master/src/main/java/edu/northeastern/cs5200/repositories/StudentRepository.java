package edu.northeastern.cs5200.repositories;


import edu.northeastern.cs5200.models.users.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
