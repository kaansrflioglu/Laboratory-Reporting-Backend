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
    @Column(name = "TC")
    private String tc;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    private int age;
}
