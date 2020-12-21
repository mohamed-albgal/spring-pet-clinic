package dev.malb.petclinic_web;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan(basePackages={"dev.malb.petclinic_data.services","dev.malb.petclinic_web"})
public class SpringPetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPetClinicApplication.class, args);
    }

}
