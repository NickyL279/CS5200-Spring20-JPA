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
  private Boolean primary_;//can't name it "primary", reserved by SQL
  @ManyToOne
  private User user;

  public Phone() {

  }

  public Phone(String phone, Boolean primary_) {
    this.phone = phone;
    this.primary_ = primary_;
  }

  public Phone(int id, String phone, Boolean primary_, User user) {
    this.id = id;
    this.phone = phone;
    this.primary_ = primary_;
    this.user = user;
  }

  public Phone(Integer id, String phone, boolean primary_) {
    this.id = id;
    this.phone = phone;
    this.primary_ = primary_;
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

  public Boolean getPrimary_() {
    return primary_;
  }

  public void setPrimary_(Boolean primary) {
    this.primary_ = primary;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
