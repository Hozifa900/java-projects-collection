package com.lab6.lab6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab6.lab6.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
