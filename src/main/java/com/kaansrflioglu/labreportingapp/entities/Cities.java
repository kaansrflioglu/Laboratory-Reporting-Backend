package com.kaansrflioglu.labreportingapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cities")

public class Cities {

    @Id
    @Column(name = "city_id")
    private int cityID;

    @Column(name = "city_name")
    private String name;
    
    public Cities(int cityID, String name) {
		super();
		this.cityID = cityID;
		this.name = name;
	}

	public int getCityID() {
        return cityID;
    }

    public void setCityID(int countyID) {
        this.cityID = countyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Cities() {}
}
