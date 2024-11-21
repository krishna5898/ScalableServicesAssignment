package com.scalableservices.assignement.saloon.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.scalableservices.assignement.saloon.model.SalonService;

public interface ServiceRepository extends JpaRepository<SalonService, Long> {
}
