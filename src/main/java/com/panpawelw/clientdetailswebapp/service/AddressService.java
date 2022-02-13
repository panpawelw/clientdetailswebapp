package com.panpawelw.clientdetailswebapp.service;

import com.panpawelw.clientdetailswebapp.model.Address;
import com.panpawelw.clientdetailswebapp.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  panpawelw
 */

@Service
public class AddressService {

  @Autowired
  private final AddressRepository repository;

  public AddressService(AddressRepository repository) {
    this.repository = repository;
  }

  public void addAddress(Address address) {
    repository.saveAndFlush(address);
  }
}
