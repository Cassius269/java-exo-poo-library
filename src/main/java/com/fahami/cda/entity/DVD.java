package com.fahami.cda.entity;

import com.fahami.cda.entity.interfaces.iDocument;

public class DVD extends Document implements iDocument {
    private int duration;

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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
             ", duration='" + getDuration() + "'" +
            ", publishYear='" + getPublishYear() + "'" +
            ", typeDocument='" + getTypeDocument() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            ", copies='" + getCopies() + "'" +
            "}";
    }
}
