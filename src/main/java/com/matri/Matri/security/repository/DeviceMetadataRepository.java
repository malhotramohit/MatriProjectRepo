package com.matri.Matri.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matri.Matri.security.model.DeviceMetadata;

public interface DeviceMetadataRepository extends JpaRepository<DeviceMetadata, Long> {

    List<DeviceMetadata> findByUserId(Long userId);
}
