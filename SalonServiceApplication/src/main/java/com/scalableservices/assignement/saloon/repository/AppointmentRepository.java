package com.scalableservices.assignement.saloon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scalableservices.assignement.saloon.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
