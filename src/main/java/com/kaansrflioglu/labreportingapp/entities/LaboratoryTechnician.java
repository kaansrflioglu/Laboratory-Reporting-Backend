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

	public LaboratoryTechnician(Long id, String tc, int age, String firstName, String lastName) {
		super();
		this.id = id;
		this.tc = tc;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    
    public LaboratoryTechnician() {}
}
