package com.matri.Matri.bean.base;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import com.matri.Matri.model.profile.MatriUserRegisterationModel;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class HomeBean {

	private MatriUserRegisterationModel matriUserRegisterationModel = new MatriUserRegisterationModel();

	@PostConstruct
	public void init() {
	}

	public MatriUserRegisterationModel getMatriUserRegisterationModel() {
		return matriUserRegisterationModel;
	}

	public void setMatriUserRegisterationModel(MatriUserRegisterationModel matriUserRegisterationModel) {
		this.matriUserRegisterationModel = matriUserRegisterationModel;
	}

	@PreDestroy
	public void preDestroy() {
		matriUserRegisterationModel = null;
	}

}
