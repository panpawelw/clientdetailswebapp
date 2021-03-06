package com.panpawelw.clientdetailswebapp.repository;

import com.panpawelw.clientdetailswebapp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * @author  panpawelw
 */

@Transactional
public interface ClientRepository extends JpaRepository<Client, Long> {
}
