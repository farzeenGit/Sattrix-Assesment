package com.sattrix.assesment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sattrix.assesment.entity.Address;
import com.sattrix.assesment.service.AddressService;

@RestController
@RequestMapping("/addresses")
public class AddressController {
   @Autowired
   private AddressService addressService;

   @GetMapping("/")
   public List<Address> getAllAddresses() {
      return addressService.getAllAddresses();
   }

   @GetMapping("/{id}")
   public Address getAddressById(@PathVariable Long id) {
      return addressService.getAddressById(id);
   }
}

