package edu.northeastern.cs5200.models.users;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Admin extends User{

    public Admin() {
        super();
    }

    public Admin(String firstName, String lastName, String username, String password, String dtype) {
        super(dtype, firstName, lastName, username, password);
    }

    public Admin(int id, String firstName, String lastName, String username, String password, List<Phone> phones, List<Address> addresses, String dtype) {
        super(id, dtype, firstName, lastName, username, password, phones, addresses);
    }



}
