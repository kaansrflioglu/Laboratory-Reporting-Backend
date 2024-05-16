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
    private Inpatient inpatiens;
    
    @ManyToOne
    @JoinColumn(name = "report_technician_id", referencedColumnName = "technician_id")
    private LaboratoryTechnician technician;
    
    @ManyToOne
    @JoinColumn(name = "report_hospital_id", referencedColumnName = "hospital_city_id")
    private Hospitals hospital;
    
    @ManyToOne
    @JoinColumn(name = "report_diagnosis_id", referencedColumnName = "diagnosis_id")
    private Diagnosis diagnosis;

	public Report(Long id, String description, Date date, Inpatient inpatiens, LaboratoryTechnician technician,
			Hospitals hospital, Diagnosis diagnosis) {
		super();
		this.id = id;
		this.description = description;
		this.date = date;
		this.inpatiens = inpatiens;
		this.technician = technician;
		this.hospital = hospital;
		this.diagnosis = diagnosis;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Inpatient getInpatiens() {
		return inpatiens;
	}

	public void setInpatiens(Inpatient inpatiens) {
		this.inpatiens = inpatiens;
	}

	public LaboratoryTechnician getTechnician() {
		return technician;
	}

	public void setTechnician(LaboratoryTechnician technician) {
		this.technician = technician;
	}

	public Hospitals getHospital() {
		return hospital;
	}

	public void setHospital(Hospitals hospital) {
		this.hospital = hospital;
	}

	public Diagnosis getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(Diagnosis diagnosis) {
		this.diagnosis = diagnosis;
	}
    
   public Report() {}
}
