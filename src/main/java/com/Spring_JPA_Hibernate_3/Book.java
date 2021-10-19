package com.Spring_JPA_Hibernate_3;

import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    String BookName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    Author Author;

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public Author getAuthorId() {
        return Author;
    }

    public void setAuthorId(Author authorId) {
        Author = authorId;
    }
}
