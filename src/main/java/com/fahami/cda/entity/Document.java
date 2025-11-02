package com.fahami.cda.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fahami.cda.entity.enumeration.TypeDocument;
import com.fahami.cda.entity.interfaces.iCopy;

import java.util.Objects;

public abstract class Document implements Comparable<Document>, iCopy{
    // Les propriétés
    private int id;
    private String title;
    private LocalDate publishYear;
    private TypeDocument typeDocument;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<Copy> copies = new ArrayList<>();
    
    // Les constructeurs
    public Document(){}

    // Les getters et setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(LocalDate publishYear) {
        this.publishYear = publishYear;
    }

    public TypeDocument getTypeDocument() {
        return this.typeDocument;
    }

    public void setTypeDocument(TypeDocument typeDocument) {
        this.typeDocument = typeDocument;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

        public List<Copy> getCopies() {
        return this.copies;
    }

    public void setCopies(List<Copy> copies) {
        this.copies = copies;
    }

    public abstract String toString();

    /** */
    @Override
    public int compareTo(Document other){
        if(this.getPublishYear() == null && other.getPublishYear() == null) return 0;
        if(this.getPublishYear() == null) return -1;
        if(other.getPublishYear() == null) return 1;

        return this.getPublishYear().compareTo(other.getPublishYear());
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Document document)) return false;

        return id == document.id && Objects.equals(title, document.title) && Objects.equals(publishYear, document.publishYear) && typeDocument == document.typeDocument && Objects.equals(createdAt, document.createdAt) && Objects.equals(updatedAt, document.updatedAt);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(publishYear);
        result = 31 * result + Objects.hashCode(typeDocument);
        result = 31 * result + Objects.hashCode(createdAt);
        result = 31 * result + Objects.hashCode(updatedAt);
        return result;
    }
}
