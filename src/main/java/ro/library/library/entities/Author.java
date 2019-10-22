package ro.library.library.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "author_table")
public class Author {
    @Id

    private int id;
    private String firstname;
    private String author;

    public void setId(int id) {
        this.id = id;
    }

    public void getAuthor(String firstname) {
        this.firstname = firstname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
