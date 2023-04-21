package com.sattrix.assesment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sattrix.assesment.entity.Address;
import com.sattrix.assesment.exception.ResourceNotFoundException;
import com.sattrix.assesment.repository.AddressRepository;

@Service
public class AddressService {
   @Autowired
   private AddressRepository addressRepository;

   public List<Address> getAllAddresses() {
      return addressRepository.findAll();
   }

   public Address getAddressById(Long id) {
	      return addressRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());
	   }
}

