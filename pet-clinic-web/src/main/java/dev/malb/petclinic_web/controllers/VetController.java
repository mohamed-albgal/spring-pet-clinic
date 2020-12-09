package dev.malb.petclinic_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    @RequestMapping("vets")
    public String getVets(){
        return "vets/index";
    }
}
