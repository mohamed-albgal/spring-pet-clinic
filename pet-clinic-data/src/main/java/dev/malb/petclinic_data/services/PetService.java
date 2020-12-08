package dev.malb.petclinic_data.services;

import dev.malb.petclinic_data.model.Owner;
import dev.malb.petclinic_data.model.Pet;

import java.util.Set;

public interface PetService {
    Owner findById(Long id);

    Pet save(Owner pet);

    Set<Pet> findAll();
}
