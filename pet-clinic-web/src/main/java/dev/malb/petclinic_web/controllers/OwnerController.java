package dev.malb.petclinic_web.controllers;

import dev.malb.petclinic_data.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* doing a request mapping at the class level will prefix any mapping attributes
* doing @RequestMapping("/owners") here , and then @RequestMapping("/list") in some method below
* will act as if that attribute was "/owners/list" instead of just "/list". useful for separating methods
* and paths to a single controller
* */
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping("owners")
    public String getOwners(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
