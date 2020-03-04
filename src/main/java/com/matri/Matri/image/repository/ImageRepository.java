package com.matri.Matri.image.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matri.Matri.image.model.ImageModel;

public interface ImageRepository extends JpaRepository<ImageModel, Long> {

}
