package dev.malb.petclinic_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {
    @RequestMapping("owners")
    public String getOwners(){
        return "owners/index";
    }
}
