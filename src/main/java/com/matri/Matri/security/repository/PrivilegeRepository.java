package com.matri.Matri.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matri.Matri.security.model.Privilege;

public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {

    Privilege findByName(String name);

    @Override
    void delete(Privilege privilege);

}
