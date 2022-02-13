package com.panpawelw.clientdetailswebapp.controller;

import com.panpawelw.clientdetailswebapp.model.Client;
import com.panpawelw.clientdetailswebapp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author  panpawelw
 */

@RestController
@RequestMapping("/client")
public class ClientController {

  private final ClientService service;

  @Autowired
  public ClientController(ClientService service) {
    this.service = service;
  }

  @GetMapping("/all")
  public List<Client> getAllClientData() {
    return service.getAllClientData();
  }

  @PostMapping
  public void addClient(Client client){
    service.addClient(client);
  }
}
