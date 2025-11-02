package com.fahami.cda.entity;

public class Book extends Document {
    // La propriété supplémentaire
    private int pagesNumber;

    // Les getter et setter
    public int getPagesNumber() {
        return this.pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }
}
