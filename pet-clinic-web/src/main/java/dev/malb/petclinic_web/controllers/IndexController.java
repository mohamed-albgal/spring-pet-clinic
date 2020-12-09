package dev.malb.petclinic_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    /**
     * this must return the name of the html file in the templates dir sans the suffix (.html)
     * note could be some_dir/index as a return value where the templates dir is like: templates/some_dir/index.html
     * */
    @RequestMapping({"","/","index.html","home"})
    public String index(){

        return "index";
    }
}
