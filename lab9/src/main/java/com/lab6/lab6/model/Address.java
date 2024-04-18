package com.lab6.lab6.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String city;
    private String state;
    private String zip;

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Patient patient;

    @OneToOne
    @JoinColumn(name = "surgery_id", referencedColumnName = "id")
    private Surgery surgery;

    // public Address(Integer id, String city, String state, String zip) {
    // this.id = id;
    // this.city = city;
    // this.state = state;
    // this.zip = zip;
    // }

}
