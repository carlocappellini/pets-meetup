package com.chingu.petmeetups.repositories;

import com.chingu.petmeetups.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
}

