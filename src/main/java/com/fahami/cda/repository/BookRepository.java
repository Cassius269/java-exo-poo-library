package com.fahami.cda.repository;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import com.fahami.cda.entity.Book;
import com.fahami.cda.repository.interfaces.iBookRepository;

public class BookRepository implements iBookRepository {
    // La propriété
    private Map<Integer,Book> booksInMemory = new TreeMap<>();

    // Les getter et setter
    Map<Integer,Book> getBooksInMemory() {
        return this.booksInMemory;
    }

    void setBooksInMemory(Map<Integer,Book> booksInMemory) {
        this.booksInMemory = booksInMemory;
    }
    

    // Implémenter les méthodes de l'interface iBookRepository
    @Override
    public void save(Book book){
        int idBook = generateId();
        book.setId(idBook);  // Assigner l'id généré au nouvel objet livre
        getBooksInMemory().put(idBook, book); // ajouter l'objet livre au stockage en mémooire des livres
    }

    @Override
    public Book findById(int id) {
         return getBooksInMemory().get(id);
    }


    @Override
    public Map<Integer, Book> findAll(){
        // Créer une copie des livres stockés en mémoires
      Map<Integer, Book>  copyBooksInMemory = new TreeMap<>();
        copyBooksInMemory.putAll(getBooksInMemory());

        // Retourner une collection non modifiable
        return  Collections.unmodifiableMap(copyBooksInMemory);
    }

    @Override
    public boolean update(Book book) {
       if(getBooksInMemory().containsKey(book.getId())){
        getBooksInMemory().put(book.getId(), book);
        return true;
       }
        return false;
    }

    @Override
    public boolean remove(int id){
        if(getBooksInMemory().containsKey(id)){
            getBooksInMemory().remove(id);
            return true;
        }

        return false;
    }

    public int generateId(){
        // Vérifier si la map n'est pas vide
        if(getBooksInMemory().isEmpty()){
            return 1;
        }

        // Rechercher l'index le plus élevé
        int maxKey = Integer.MIN_VALUE;
         for (Integer key : getBooksInMemory().keySet()) {
            if (key > maxKey) {
                maxKey = key;
            }
        }

        return ++maxKey;
}
}