package com.panpawelw.clientdetailswebapp.controller;

import com.panpawelw.clientdetailswebapp.model.Address;
import com.panpawelw.clientdetailswebapp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  panpawelw
 */

@RestController
@RequestMapping("/address")
public class AddressController {

  private final AddressService service;

  @Autowired
  public AddressController(AddressService service) {
    this.service = service;
  }

  @PostMapping
  public void addAddress(Address address) {
    service.addAddress(address);
  }
}
