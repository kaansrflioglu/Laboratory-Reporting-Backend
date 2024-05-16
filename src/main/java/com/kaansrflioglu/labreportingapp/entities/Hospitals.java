package com.kaansrflioglu.labreportingapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "hospitals")
public class Hospitals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hospital_id")
    private Long id;

    @Column(name = "hospital_name")
    private String hospitalName;

    @Column(name = "hospital_address")
    private String fullAddress;

    @ManyToOne
    @JoinColumn(name = "hospital_city_id", referencedColumnName = "city_id")
    private Cities city;

	public Hospitals(Long id, String hospitalName, String fullAddress, Cities city) {
		super();
		this.id = id;
		this.hospitalName = hospitalName;
		this.fullAddress = fullAddress;
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public Cities getCity() {
		return city;
	}

	public void setCity(Cities city) {
		this.city = city;
	}
    
	public Hospitals() {}
}
