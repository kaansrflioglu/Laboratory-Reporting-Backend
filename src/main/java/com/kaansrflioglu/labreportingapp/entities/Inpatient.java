package com.kaansrflioglu.labreportingapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inpatients")
public class Inpatient {

    @Id
    @Column(name = "inpatients_tc")
    private String tc;

    @Column(name = "inpatients_name")
    private String name;

    @Column(name = "inpatients_surname")
    private String surname;

    @Column(name = "inpatients_age")
    private int age;
    
    public Inpatient(String tc, String name, String surname, int age) {
		super();
		this.tc = tc;
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Inpatient() {}
    
}
