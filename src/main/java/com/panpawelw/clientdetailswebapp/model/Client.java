package com.panpawelw.clientdetailswebapp.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author  panpawelw
 */

@Entity
@Table(name = "clients")
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  private String username;

  @NotBlank
  private String password;

  @NotBlank
  @Email
  private String email;

  @NotBlank
  private String forename;

  @NotBlank
  private String surname;

  @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
  private List<Address> addresses;

  public Client() {}

  public Client(String username, String password, String email,
                String forename, String surname, List<Address> addresses) {
    this.username = username;
    this.password = password;
    this.forename = forename;
    this.surname = surname;
    this.addresses = addresses;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getForename() {
    return forename;
  }

  public void setForename(String firstname) {
    this.forename = firstname;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }
}
