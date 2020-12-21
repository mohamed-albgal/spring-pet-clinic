package dev.malb.petclinic_web.controllers;

import dev.malb.petclinic_data.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping("vets")
    public String getVets(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
