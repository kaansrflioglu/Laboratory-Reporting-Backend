package com.kaansrflioglu.labreportingapp.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kaansrflioglu.labreportingapp.dal.IDiagnosisDAL;
import com.kaansrflioglu.labreportingapp.entities.Diagnosis;

@Service
public class DiagnosisManager implements IDiagnosisService {

	
	private IDiagnosisDAL diagnosisDAL;
	
	@Autowired
	public DiagnosisManager(IDiagnosisDAL diagnosisDAL) {
		this.diagnosisDAL = diagnosisDAL;
	}

	@Override
	@Transactional
	public List<Diagnosis> getAll() {
		return this.diagnosisDAL.getAll();
	}

	@Override
	@Transactional
	public void add(Diagnosis diagnosis) {
	    if (diagnosis.getInpatient() != null && diagnosis.getInpatient().getTc() != null) {
	        this.diagnosisDAL.add(diagnosis);
	    } else {
	        throw new IllegalArgumentException("Hasta bulunamadı. Lütfen geçerli bir hasta seçin.");
	    }
	}

	@Override
	@Transactional
	public void update(Diagnosis diagnosis) {
		this.diagnosisDAL.update(diagnosis);
		
	}

	@Override
	@Transactional
	public void delete(Diagnosis diagnosis) {
		this.diagnosisDAL.delete(diagnosis);
		
	}

	@Override
	@Transactional
	public Diagnosis getById(Long id) {
		return this.diagnosisDAL.getById(id);
	}

}
