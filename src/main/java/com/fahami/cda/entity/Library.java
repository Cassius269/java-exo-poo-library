package com.fahami.cda.entity;

import java.util.ArrayList;
import java.util.List;

import com.fahami.cda.entity.interfaces.iCopy;

public class Library implements iCopy {
    // Les propriétés
    private String name;
    private List<Copy> copies = new ArrayList<>();

    // Le constructeur
    public Library(){};

    // Les getter et setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }  
    
    public List<Copy> getCopies() {
        return this.copies;
    }

    public void setCopies(List<Copy> copies) {
        this.copies = copies;
    }
}
