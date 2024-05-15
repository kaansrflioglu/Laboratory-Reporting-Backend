package com.kaansrflioglu.labreportingapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "technician")
@Data
public class LaboratoryTechnician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "technician_id")
    private Long id;

    @Column(name = "technician_tc")
    private String tc;
    
    @Column(name = "technician_age")
    private int age;

    @Column(name = "technician_name")
    private String firstName;

    @Column(name = "technician_surname")
    private String lastName;
}
