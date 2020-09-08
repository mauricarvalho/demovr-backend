package com.example.virtualexplorer.repositories;

import com.example.virtualexplorer.models.Family;
import com.example.virtualexplorer.models.Model;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FamilyRepository {

    private static List<Family> families  = pupulateData();

    public Family findByFamilyFame(String familyName){

        return families.stream().filter( e -> e.getFamilyName().equals(familyName)).findAny().get();
    }

    public List<Family> findAll(){
        return families;
    }

    private static List<Family> pupulateData() {

        Model model = new Model("T490");
        Model model2 = new Model("T470");


        Model model3 = new Model("z40");
        Model model4 = new Model("z50");

        List<Model> list1 = new ArrayList<>();
        List<Model> list2 = new ArrayList<>();


        list1.add(model);
        list1.add(model2);

        list2.add(model3);
        list2.add(model4);


        Family think = new Family("Thinkpad", list1);
        Family idea = new Family("Ideapad", list2);

        List<Family> families = new ArrayList<>();
        families.add(think);
        families.add(idea);
        return families;
    }

}
