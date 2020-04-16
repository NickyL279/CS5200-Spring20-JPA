package edu.northeastern.cs5200.models.users;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Phone {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String phone;
  private Boolean primary;
  @ManyToOne
  private User user;

  public Phone() {

  }

  public Phone(String phone, Boolean primary) {
    this.phone = phone;
    this.primary = primary;
  }

  public Phone(int id, String phone, Boolean primary, User user) {
    this.id = id;
    this.phone = phone;
    this.primary = primary;
    this.user = user;
  }

  public Phone(Integer id, String phone, boolean primary) {
    this.id = id;
    this.phone = phone;
    this.primary = primary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Boolean getPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
