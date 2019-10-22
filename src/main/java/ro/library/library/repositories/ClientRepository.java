package ro.library.library.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.library.library.entities.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, String> {
    Client findByPhone(String phone);
}
