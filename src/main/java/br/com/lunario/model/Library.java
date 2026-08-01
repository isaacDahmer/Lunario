package br.com.lunario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToOne;
import jakarta.persistence.ManyToMany;
import java.util.List;

@Entity
@Table(name = "library")
public class Library {
    @Id
    private long id;

    @OneToOne
    private User user;

    @ManyToMany
    private List<Book> books;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    protected Library() {}

    public Library(long id, User user, List<Book> books) {
        this.id = id;
        this.user = user;
        this.books = books;
    }
}