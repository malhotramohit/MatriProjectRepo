package com.matri.Matri.repository.profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matri.Matri.model.profile.MatriUserRegisterationModel;

@Repository
public interface UserRegistrationServiceRepository extends JpaRepository<MatriUserRegisterationModel, Long> {

}
