package edu.northeastern.cs5200.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.models.users.Address;


@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
}

