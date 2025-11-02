package com.fahami.cda.entity;

import com.fahami.cda.entity.interfaces.iDocument;
import java.util.Objects;

public class Book extends Document implements iDocument {
    // La propriété supplémentaire
    private int pagesNumber;

    // Les getter et setter
    public int getPagesNumber() {
        return this.pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }


    @Override
    public String displayDetails(){
        return toString();
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", pagesNumber='" + getPagesNumber() + "'" +
            ", publishYear='" + getPublishYear() + "'" +
            ", typeDocument='" + getTypeDocument() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            ", copies='" + getCopies() + "'" +
            "}";
    }


}
