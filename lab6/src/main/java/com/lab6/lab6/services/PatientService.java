package com.lab6.lab6.services;

import com.lab6.lab6.model.Appointment;
import com.lab6.lab6.model.Patient;
import com.lab6.lab6.model.Surgery;

public interface PatientService {
    public Patient addPatient(Patient p);

    public Appointment addAppointment(Appointment a);

    public Surgery addSurgery(Surgery s);

}
