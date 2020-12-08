package dev.malb.petclinic_data.services;

import dev.malb.petclinic_data.model.Owner;
import dev.malb.petclinic_data.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
