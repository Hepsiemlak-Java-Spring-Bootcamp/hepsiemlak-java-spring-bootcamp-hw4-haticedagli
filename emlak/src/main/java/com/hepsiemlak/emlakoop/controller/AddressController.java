package com.hepsiemlak.emlakoop.controller;

import com.hepsiemlak.emlakoop.model.Address;
import com.hepsiemlak.emlakoop.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {
    public final AddressRepository addressRepository;

    @GetMapping
    public List<Address> getAddresses() {
        return addressRepository.findAll();
    }

    @PostMapping
    public void saveAddress(@RequestBody Address address){
        addressRepository.save(address);
    }

    @GetMapping("/{id}")
    public Address getAddress(@PathVariable("id") Integer id) {
        return addressRepository.findById(id).get();
    }
}
