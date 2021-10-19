package com.Spring_JPA_Hibernate_3;


import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Author {
    @Id
    int Id;
    String Name;
    @OneToMany(mappedBy ="Author",cascade = CascadeType.ALL)
    Set<Book> books;

    public Set<Book> getBook() {
        return books;
    }

    public void setBook(Set<Book> books) {
        this.books = books;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void updateBooks(Book book){
        if(book!=null){
            if(books==null){
             books=   new HashSet<>();
            }
            else{
                book.setAuthorId(this);
                books.add(book);
            }
        }
    }

}
