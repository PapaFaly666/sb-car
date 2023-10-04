package com.example.sbcar.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.sbcar.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}