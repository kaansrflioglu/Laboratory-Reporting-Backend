package com.kaansrflioglu.labreportingapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cities")

public class Cities {

    @Id
    @Column(name = "countyID")
    private int countyID;

    @Column(name = "name")
    private String name;

    public int getCountyID() {
        return countyID;
    }

    public void setCountyID(int countyID) {
        this.countyID = countyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
