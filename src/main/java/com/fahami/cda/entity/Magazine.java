package com.fahami.cda.entity;

import com.fahami.cda.entity.interfaces.iDocument;

public class Magazine extends Document implements iDocument{
    private int editionNumber;

    public int getEditionNumber() {
        return this.editionNumber;
    }

    public void setEditionNumber(int editionNumber) {
        this.editionNumber = editionNumber;
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
            ", editionNumber='" + getEditionNumber() + "'" +
            ", publishYear='" + getPublishYear() + "'" +
            ", typeDocument='" + getTypeDocument() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            ", copies='" + getCopies() + "'" +
            "}";
    }
}
