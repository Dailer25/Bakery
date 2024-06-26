package com.pana.pana.Repositories;

import com.pana.pana.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
    User findById(long id);
}
