package com.max.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.max.entity.AppPhoto;

public interface AppPhotoDAO extends JpaRepository<AppPhoto, Long> {
}