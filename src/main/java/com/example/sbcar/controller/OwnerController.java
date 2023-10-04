
package com.example.sbcar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.sbcar.model.Owner;
import com.example.sbcar.repository.OwnerRepository;

@RestController

@RequestMapping("/api/owners")
public class OwnerController {

    @Autowired
    private OwnerRepository oRepository;

    @GetMapping
    public Iterable<Owner> getOwners() {
        return oRepository.findAll();
    }

    @PostMapping("/addOwner")
    public Owner addOwner(@RequestBody Owner owner) {
        return oRepository.save(owner);
    }
}
