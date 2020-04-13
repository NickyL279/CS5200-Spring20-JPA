package edu.northeastern.cs5200.models.users;

import javax.persistence.Entity;

@Entity
public class Admin extends User{

    public Admin() {
        super();
    }

    public Admin(int id, String firstName, String lastName, String username, String password) {
        super(id, firstName, lastName, username, password);
    }

    public Admin(String firstName, String lastName, String username, String password) {
        super(firstName, lastName, username, password);
    }
}
