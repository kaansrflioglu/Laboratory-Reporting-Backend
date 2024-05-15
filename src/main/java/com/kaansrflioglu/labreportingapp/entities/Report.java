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
import java.util.Date;

@Entity
@Table(name = "report")
@Data
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private Long id;

    @Column(name = "report_description")
    private String description;

    @Column(name = "report_date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "report_inpatients_tc", referencedColumnName = "inpatients_tc")
    private Inpatients inpatiens;
    
    @ManyToOne
    @JoinColumn(name = "report_technician_id", referencedColumnName = "technician_id")
    private LaboratoryTechnician technician;
    
    @ManyToOne
    @JoinColumn(name = "report_hospital_id", referencedColumnName = "hospital_city_id")
    private Hospitals hospital;
    
    @ManyToOne
    @JoinColumn(name = "report_diagnosis_id", referencedColumnName = "diagnosis_id")
    private Diagnosis diagnosis;
    
   
}
