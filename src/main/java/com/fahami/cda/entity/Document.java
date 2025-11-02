package com.fahami.cda.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fahami.cda.entity.enumeration.TypeDocument;

public abstract class Document {
    // Les propriétés
    private int id;
    private String title;
    private LocalDate publishYear;
    private TypeDocument typeDocument;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

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
}
