package com.lab6.lab6.model;

import java.time.LocalDate;

import java.util.*;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "appointment")
@Entity

public class Appointment {
    @Id
    private Integer id;
    private LocalDate date;
    private String time;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Patient patient;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dentist_id", referencedColumnName = "id")
    private Dentist dentist;
    @ManyToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "surgery_id", referencedColumnName = "id")
    private Surgery surgery;

}
