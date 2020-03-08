package com.matri.Matri.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matri.Matri.security.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    @Override
    void delete(User user);

}
