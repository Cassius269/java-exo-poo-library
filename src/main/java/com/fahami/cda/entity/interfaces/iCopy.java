package com.fahami.cda.entity.interfaces;

import java.util.List;

import com.fahami.cda.entity.Copy;

public interface iCopy {
    List<Copy> getCopies(); // propriété stockée sous forme de méthode

    /**
     * Méthode pour ajouter un nouvel exemplaire
     * @param copy L'exemplaire à ajouter
     */
    public default void addCopy(Copy copy){
        if(!getCopies().contains(copy)){
            getCopies().add(copy);
        }
    }

    /**
     * Méthode pour supprimer un exemplaire
     * @param copy L'exemplaire à supprimer
     */
    public default boolean removeCopy(Copy copy){
        return getCopies().remove(copy); // renvoie true si la copie a été trouvée avant d'être supprimée, sinon false
    }
}
