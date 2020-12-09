package dev.malb.petclinic_data.services;

import java.util.Set;

public interface DataService<T,ID>{
    T findById(Long id);
    T save(T object);
    Set<T> findAll();
    void delete(T object);
    void deleteById(ID id);
}
