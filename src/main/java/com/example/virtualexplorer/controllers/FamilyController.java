package com.example.virtualexplorer.controllers;

import com.example.virtualexplorer.models.Family;
import com.example.virtualexplorer.services.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class FamilyController {

    @Autowired
    FamilyService service;

    @RequestMapping(value = "/families", method = RequestMethod.GET)
    public List<Family> getFamilies(){
        return service.getFamilies();
    }

    @RequestMapping(value = "/family", method = RequestMethod.GET)
    public Family getFamily(@RequestParam String name){
        return service.getFamily(name);
    }


}
