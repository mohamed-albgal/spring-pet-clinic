package dev.malb.petclinic_web.bootstrap;

import dev.malb.petclinic_data.model.Owner;
import dev.malb.petclinic_data.model.Vet;
import dev.malb.petclinic_data.services.OwnerService;
import dev.malb.petclinic_data.services.VetService;
import dev.malb.petclinic_data.services.map.OwnerServiceMap;
import dev.malb.petclinic_data.services.map.VetMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final VetService vetService;
    private final OwnerService ownerService;

    @Autowired
    public DataLoader(VetService vetService, OwnerService ownerService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glennon");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axel");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("George");
        vet2.setLastName("Takaki");

        vetService.save(vet2);

        System.out.println("Loaded vets...");


    }
}
