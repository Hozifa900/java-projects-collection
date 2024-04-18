package com.lab6.lab6.model;

import java.util.*;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String patientNumber;
    private String name;
    private String phone;
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> address;

}
