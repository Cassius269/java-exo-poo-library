package com.fahami.cda.entity;
import java.util.Objects;

import com.fahami.cda.entity.interfaces.iDocument;

public class Copy implements iDocument{
    // Les propriétés
    private int id;
    private String reference;
    private Document document;
    private Library library;
    
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

    public Document getDocument() {
        return this.document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

        public Library getLibrary() {
        return this.library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public String displayDetails(){
        return toString();
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", reference='" + getReference() + "'" +
            ", document='" + getDocument() + "'" +
            ", library='" + getLibrary() + "'" +
            "}";
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Copy copy)) return false;

        return id == copy.id && Objects.equals(reference, copy.reference);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(reference);
        return result;
    }
}
