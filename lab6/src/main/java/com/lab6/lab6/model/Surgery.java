package com.lab6.lab6.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

@Entity
@Table(name = "surgery")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Surgery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String surgeryNumber;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Appointment> appointments;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

}
