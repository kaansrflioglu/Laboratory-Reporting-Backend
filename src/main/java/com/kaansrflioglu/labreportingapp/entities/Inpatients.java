package com.kaansrflioglu.labreportingapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "inpatients")
@Data
public class Inpatients {

    @Id
    @Column(name = "inpatients_tc")
    private String tc;

    @Column(name = "inpatients_name")
    private String name;

    @Column(name = "inpatients_surname")
    private String surname;

    @Column(name = "inpatients_age")
    private int age;
}
