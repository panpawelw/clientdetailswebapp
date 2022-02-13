package com.panpawelw.clientdetailswebapp.repository;

import com.panpawelw.clientdetailswebapp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface AddressRepository extends JpaRepository<Address, Long> {
}
