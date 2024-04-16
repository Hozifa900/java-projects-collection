package com.lab6.lab6;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.*;

import com.lab6.lab6.model.Address;
import com.lab6.lab6.model.Appointment;
import com.lab6.lab6.model.Dentist;
import com.lab6.lab6.model.Patient;
import com.lab6.lab6.model.Surgery;
import com.lab6.lab6.services.DentistService;
import com.lab6.lab6.services.PatientService;

import lombok.experimental.var;

@SpringBootApplication
public class Lab7Application implements CommandLineRunner {
	@Autowired
	PatientService patientService;
	@Autowired
	DentistService dentistService;

	public static void main(String[] args) {
		SpringApplication.run(Lab7Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// <------------ Add the 1st patient ------------------------------->
		List<Address> l = new ArrayList<>();
		var patient = new Patient(1, "p100", "Gillian White", "3479863996", "hozifa.dev@gmail.com", null);
		var address = new Address(1, "Fairfield", "IA", "1234", patient, null);
		l.add(address);
		patient.setAddress(l);
		var patient1 = patientService.addPatient(patient);

		// <------------ Add the 2nd patient ------------------------------->
		l.clear();
		patient = new Patient(2, "p105", "Jill Bell", "3479863996", "hozifa.dev@gmail.com", null);
		address = new Address(2, "Fairfield", "IA", "1234", patient, null);
		l.add(address);
		patient.setAddress(l);
		var patient2 = patientService.addPatient(patient);

		// <------------ Add the 3rd patient ------------------------------->
		l.clear();
		patient = new Patient(3, "p108", "Ian Mackay", "3479863996", "hozifa.dev@gmail.com", null);
		address = new Address(3, "Fairfield", "IA", "1234", patient, null);
		l.add(address);
		patient.setAddress(l);
		var patient3 = patientService.addPatient(patient);

		// <------------ Add the 4th patient ------------------------------->
		l.clear();
		patient = new Patient(4, "p110", "John Walker", "3479863996", "hozifa.dev@gmail.com", null);
		address = new Address(4, "Fairfield", "IA", "1234", patient, null);
		l.add(address);
		patient.setAddress(l);
		var patient4 = patientService.addPatient(patient);

		// <------------ Create three dentists ----------------------------->
		var dentist1 = dentistService.addDentist(new Dentist(1, "Tony Smith", "748778767", "gmail1@gmail.com"));
		var dentist2 = dentistService.addDentist(new Dentist(2, "Helen Person", "748778767", "gmail2@gmail.com"));
		var dentist3 = dentistService.addDentist(new Dentist(3, "Robin Plevin", "748778767", "gmail3@gmail.com"));

		// <----------- Add all appointments for 12-sep-13 date --------------------->
		var appointment1 = patientService
				.addAppointment(new Appointment(1, LocalDate.of(2013, 9, 12), "10.00", patient1, dentist1, null));
		var appointment2 = patientService
				.addAppointment(new Appointment(2, LocalDate.of(2013, 9, 12), "12.00", patient2, dentist1, null));
		var appointment3 = patientService
				.addAppointment(new Appointment(3, LocalDate.of(2013, 9, 12), "10.00", patient3, dentist2, null));
		var appointment4 = patientService
				.addAppointment(new Appointment(4, LocalDate.of(2013, 9, 12), "14.00", patient3, dentist2, null));
		var appointment5 = patientService
				.addAppointment(new Appointment(5, LocalDate.of(2013, 9, 12), "16.30", patient2, dentist3, null));
		var appointment6 = patientService
				.addAppointment(new Appointment(6, LocalDate.of(2013, 9, 12), "18.00", patient4, dentist3, null));

		// <------------------ Add the All surgeries ------------------------------>
		List<Appointment> appointmentList = new ArrayList<>();

		// <--------- 1st surgery ------------------------------------------>
		var surgery1 = patientService.addSurgery(new Surgery(1, "S15", "Surgery1",
				appointmentList, null));

		// <--------- 2nd surgery ------------------------------------------>
		var surgery2 = new Surgery(2, "S10", "Surgery2",
				appointmentList, null);
		surgery2 = patientService.addSurgery(surgery2);

		// <--------- 3rd surgery ------------------------------------------>
		var surgery3 = new Surgery(3, "S13", "Surgery3",
				appointmentList, null);
		surgery3 = patientService.addSurgery(surgery3);

		// <-------- update the appointment data update the surgery_id ------->
		// <------- update appointment one ----------------------------------->
		appointment1.setSurgery(surgery1);
		patientService.addAppointment(appointment1);

		// <------- update appointment two ----------------------------------->
		appointment2.setSurgery(surgery1);
		patientService.addAppointment(appointment2);

		// <------- update appointment three ----------------------------------->
		appointment3.setSurgery(surgery2);
		patientService.addAppointment(appointment3);

		// <------- update appointment four ----------------------------------->
		appointment4.setSurgery(surgery2);
		patientService.addAppointment(appointment4);

		// <------- update appointment five ----------------------------------->
		appointment5.setSurgery(surgery1);
		patientService.addAppointment(appointment5);

		// <------- update appointment six --------
		appointment6.setSurgery(surgery3);
		patientService.addAppointment(appointment6);

		// get the whole data
		List<Object[]> data = patientService.getAppointmentDetails();
		System.out.println("List of all appointment with data: ");
		System.out.println("------------------------------------------------------");
		System.out.println("|DentistName | PatientName | patNo | AppoDate | SurNo|");
		System.out.println("-----------------------------------------------------");
		for (Object[] objects : data) {
			for (Object o : objects) {
				System.out.print(o + ", ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------");

		}

	}

}
