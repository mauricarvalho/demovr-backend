package com.example.virtualexplorer.models;

import java.util.List;

public class Family {

    private String familyName;
    private List<Model> models;

    public Family(String familyName, List<Model> models) {
        this.familyName = familyName;
        this.models = models;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }
}
