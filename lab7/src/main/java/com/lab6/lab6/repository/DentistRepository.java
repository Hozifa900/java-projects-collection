package com.lab6.lab6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab6.lab6.model.Dentist;

public interface DentistRepository extends JpaRepository<Dentist, Integer> {

}
