package com.map.onetonejpa.controller;

import com.map.onetonejpa.entity.Address;
import com.map.onetonejpa.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/getAddress")
    public List<Address> getEmployees() {
        return addressRepository.findAll();
    }
}
