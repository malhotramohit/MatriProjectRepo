package com.matri.Matri.service.profile;

import org.springframework.stereotype.Service;

import com.matri.Matri.model.profile.MatriUserRegisterationModel;
import com.matri.Matri.repository.profile.UserRegistrationServiceRepository;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	private UserRegistrationServiceRepository userRegistrationServiceRepository;

	public UserRegistrationServiceImpl(UserRegistrationServiceRepository userRegistrationServiceRepository) {
		super();
		this.userRegistrationServiceRepository = userRegistrationServiceRepository;
	}

	@Override
	public void registerUser(MatriUserRegisterationModel matriUserRegisterationModel) {
		userRegistrationServiceRepository.save(matriUserRegisterationModel);

	}

}
