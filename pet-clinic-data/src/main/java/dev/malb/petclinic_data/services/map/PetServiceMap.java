package dev.malb.petclinic_data.services.map;

import dev.malb.petclinic_data.model.Owner;
import dev.malb.petclinic_data.model.Pet;
import dev.malb.petclinic_data.services.DataService;
import dev.malb.petclinic_data.services.PetService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.Set;

@ComponentScan
@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Pet findById(Long id) {
        return (Pet) super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet save(Pet object) {
        return (Pet) super.save(object.getId(),object);
    }
}
