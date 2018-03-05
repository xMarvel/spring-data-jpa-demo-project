package com.example.demoproject.repository;

import com.example.demoproject.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findUserById(Long userId);

}
