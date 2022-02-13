package com.panpawelw.clientdetailswebapp.service;

import com.panpawelw.clientdetailswebapp.model.Client;
import com.panpawelw.clientdetailswebapp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author  panpawelw
 */

@Service
public class ClientService {

  @Autowired
  private final ClientRepository repository;

  public ClientService(ClientRepository repository) {
    this.repository = repository;
  }

  public List<Client> getAllClientData() {
    return repository.findAll();
  }

  public void addClient(Client client) {
    repository.saveAndFlush(client);
  }
}
