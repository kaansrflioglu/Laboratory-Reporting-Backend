package com.kaansrflioglu.labreportingapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "diagnosis")
@Data
public class Diagnosis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diagnosis_id")
    private Long id;

    @Column(name = "diagnosis_title")
    private String diagnosisTitle;

    @Column(name = "diagnosis_details")
    private String diagnosisDetails;

    @ManyToOne
    @JoinColumn(name = "diagnosis_tc", referencedColumnName = "inpatients_tc")
    private Inpatients inpatient;
}
