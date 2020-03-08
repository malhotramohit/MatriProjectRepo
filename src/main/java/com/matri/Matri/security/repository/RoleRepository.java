package com.matri.Matri.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matri.Matri.security.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

    @Override
    void delete(Role role);

}
