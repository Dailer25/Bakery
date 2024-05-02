package com.pana.pana.Repositories;

import com.pana.pana.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByName(String name);
    Client findById(long id);
}
