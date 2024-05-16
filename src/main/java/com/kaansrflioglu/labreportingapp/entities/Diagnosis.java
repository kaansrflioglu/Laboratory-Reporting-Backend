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
    private Inpatient inpatient;

	public Diagnosis(Long id, String diagnosisTitle, String diagnosisDetails, Inpatient inpatient) {
		super();
		this.id = id;
		this.diagnosisTitle = diagnosisTitle;
		this.diagnosisDetails = diagnosisDetails;
		this.inpatient = inpatient;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDiagnosisTitle() {
		return diagnosisTitle;
	}

	public void setDiagnosisTitle(String diagnosisTitle) {
		this.diagnosisTitle = diagnosisTitle;
	}

	public String getDiagnosisDetails() {
		return diagnosisDetails;
	}

	public void setDiagnosisDetails(String diagnosisDetails) {
		this.diagnosisDetails = diagnosisDetails;
	}

	public Inpatient getInpatient() {
		return inpatient;
	}

	public void setInpatient(Inpatient inpatient) {
		this.inpatient = inpatient;
	}
    
    public Diagnosis() {}
}
