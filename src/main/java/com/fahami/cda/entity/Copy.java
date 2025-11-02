package com.fahami.cda.entity;
import java.util.Objects;

public class Copy {
    // Les propriétés
    private int id;
    private String reference;

    // Le constructeur vide
    public Copy(){};
    
    // Les getters et setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
