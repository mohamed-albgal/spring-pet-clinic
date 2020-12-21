package dev.malb.petclinic_web.bootstrap;

import dev.malb.petclinic_data.model.Owner;
import dev.malb.petclinic_data.model.Vet;
import dev.malb.petclinic_data.services.OwnerService;
import dev.malb.petclinic_data.services.VetService;
import dev.malb.petclinic_data.services.map.OwnerServiceMap;
import dev.malb.petclinic_data.services.map.VetMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setFirstName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setFirstName("Glennon");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axel");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("George");
        vet2.setLastName("Takaki");

        vetService.save(vet2);

        System.out.println("Loaded vets...");


    }
}
