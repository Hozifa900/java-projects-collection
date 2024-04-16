package com.lab6.lab6.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab6.lab6.model.Appointment;
import com.lab6.lab6.model.Patient;
import com.lab6.lab6.model.Surgery;
import com.lab6.lab6.repository.AppointmentRepository;
import com.lab6.lab6.repository.PatientRepository;
import com.lab6.lab6.repository.SurgeryRepository;
import com.lab6.lab6.services.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    AppointmentRepository appointmentRepository;
    @Autowired
    SurgeryRepository surgeryRepository;

    @Override
    public Patient addPatient(Patient p) {
        return patientRepository.save(p);
    }

    @Override
    public Appointment addAppointment(Appointment a) {
        return appointmentRepository.save(a);

    }

    @Override
    public Surgery addSurgery(Surgery s) {
        return surgeryRepository.save(s);

    }

    @Override
    public List<Object[]> getAppointmentDetails() {
        return appointmentRepository.getAppointmentDetails();

    }

}
