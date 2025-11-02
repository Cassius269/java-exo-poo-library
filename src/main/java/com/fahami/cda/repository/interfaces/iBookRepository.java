package com.fahami.cda.repository.interfaces;

import java.util.Map;

import com.fahami.cda.entity.Book;

public interface iBookRepository {
    /**
     * Méthode pour enregistrer un nouveau livre
     * @param book L'objet livre à enregistre
     */
    void save(Book book);

    /**
     * Méthode pour récupérer un book par son Id
     * @param id L'identifiant du livre
     * @return Un livre
     */
    Book findById(int id);

    /**
     * Méthode pour recupérer tous les les livres
     * @return La liste de tous les livres
     */
    Map<Integer,Book> findAll();

    /**
     * Méthode pour supprimer un livre
     * @param id L'identifiant du livre
     * @return retourner true si livre supprimé, sinon false
     */
    boolean remove(int id);

    /**
     * Méthode pour mettre à jour un livre
     * @param book L'objet livre à mettre à jour
     * @return retourner true si livre mis à jour, sinon false
     */
    boolean update(Book book);
}
