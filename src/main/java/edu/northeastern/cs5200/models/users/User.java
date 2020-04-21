package edu.northeastern.cs5200.models.users;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(insertable = false, updatable = false)
  private String dtype;
  private String firstName;
  private String lastName;
  private String username;
  private String password;
  @OneToMany(cascade = javax.persistence.CascadeType.ALL, orphanRemoval=true, mappedBy = "user")
  private List<Phone> phones;
  @OneToMany(cascade = javax.persistence.CascadeType.ALL, orphanRemoval=true, mappedBy = "user")
  private List<Address> addresses;

  public User() {
  }

  public User(String dtype, String firstName, String lastName, String username, String password) {
    this.dtype = dtype;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
  }

  public User(int id, String dtype, String firstName, String lastName, String username, String password, List<Phone> phones, List<Address> addresses) {
    this.id = id;
    this.dtype = dtype;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
    this.phones = phones;
    this.addresses = addresses;
  }
  public void set(User newUser) {
    this.username = newUser.username;
    this.password = newUser.password;
    this.firstName = newUser.firstName;
    this.lastName = newUser.lastName;
    this.dtype=newUser.dtype;
  }

  public String getDtype() {
    return dtype;
  }

  public void setDtype(String dtype) {
    this.dtype = dtype;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Phone> getPhones() {
    return phones;
  }

  public void setPhones(List<Phone> phones) {
    this.phones = phones;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }
}