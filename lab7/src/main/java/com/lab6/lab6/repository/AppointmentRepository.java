package com.lab6.lab6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.*;

import com.lab6.lab6.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
    @Query("SELECT a.dentist.name AS dentistName, " +
            "a.patient.name AS patientName, " +
            "a.patient.patientNumber AS patientNumber, " +
            "a.date AS appointmentDate, " +
            "a.time AS appointmentTime, " +
            "a.surgery.surgeryNumber AS surgeryNumber " +
            "FROM Appointment a")
    List<Object[]> getAppointmentDetails();

}
