package com.example.virtualexplorer.services;

import com.example.virtualexplorer.models.Family;
import com.example.virtualexplorer.repositories.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyService {

    @Autowired
    FamilyRepository repo;


    public List<Family> getFamilies() {
        return repo.findAll();
    }

    public Family getFamily(String name){
        return repo.findByFamilyFame(name);
    }


}
