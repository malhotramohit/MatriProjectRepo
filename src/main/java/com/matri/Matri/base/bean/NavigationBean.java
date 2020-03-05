package com.matri.Matri.base.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import com.matri.Matri.image.model.ImageModel;
import com.matri.Matri.image.service.ImageService;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class NavigationBean {

	private ImageService imageService;

	public NavigationBean(ImageService imageService) {
		super();
		this.imageService = imageService;
	}

	@PostConstruct
	public void init() {

	}

	public List<ImageModel> loadAllImagesByProfileId(String profileId) {
		List<ImageModel> imageModels = imageService.loadAllImagesByProfileId(profileId);
		return imageModels;
	}

	@PreDestroy
	public void preDestroy() {
	}

}
