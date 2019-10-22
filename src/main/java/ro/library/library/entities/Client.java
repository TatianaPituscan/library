package ro.library.library.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client_table")
public class Client {

    @Id
    private int id;

    private String firstName;
    private String lastName;
    private String address;
    private String phone;

    public void setId(int id) {
        this.id = id;
    }

}
