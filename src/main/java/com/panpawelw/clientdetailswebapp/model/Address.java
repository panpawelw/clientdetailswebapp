package com.panpawelw.clientdetailswebapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * @author  panpawelw
 */

@Entity
@Table(name = "addresses")
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  private String street;

  private String houseNumber;

  private String flatNumber;

  @NotBlank
  private String postcode;

  @NotBlank
  private String city;

  @NotBlank
  private String country;

  @JoinColumn
  @ManyToOne
  private Client client;

  public Address() {
  }

  public Address(String street, String houseNumber, String flatNumber, String postcode,
                 String city, String country, Client client) {
    this.street = street;
    this.houseNumber = houseNumber;
    this.flatNumber = flatNumber;
    this.postcode = postcode;
    this.city = city;
    this.country = country;
    this.client = client;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public String getFlatNumber() {
    return flatNumber;
  }

  public void setFlatNumber(String flatNumber) {
    this.flatNumber = flatNumber;
  }

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }
}
