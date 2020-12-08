package dev.malb.petclinic_data.services;

import dev.malb.petclinic_data.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
