package dev.malb.petclinic_data.services.map;

import dev.malb.petclinic_data.model.Vet;
import dev.malb.petclinic_data.services.DataService;

import java.util.Set;


public class VetMapService extends AbstractMapService<Vet,Long> implements DataService<Vet,Long> {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }
}
