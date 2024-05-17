package com.kaansrflioglu.labreportingapp.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kaansrflioglu.labreportingapp.dal.ITechnicianDAL;
import com.kaansrflioglu.labreportingapp.entities.Inpatient;
import com.kaansrflioglu.labreportingapp.entities.LaboratoryTechnician;

@Service
public class TechnicianManager implements ITechnicianService {

	
	private ITechnicianDAL technicianDAL;
	
	@Autowired
	public TechnicianManager(ITechnicianDAL technicianDAL) {
		this.technicianDAL = technicianDAL;
	}

	@Override
	@Transactional
	public List<LaboratoryTechnician> getAll() {
		return this.technicianDAL.getAll();
	}

	@Override
	@Transactional
	public void add(LaboratoryTechnician technician) {
	    if (isValidTc(technician.getTc()) && isValidAge(technician.getAge())) {
	        this.technicianDAL.add(technician);
	    } else {
	        throw new IllegalArgumentException("TC kimlik numarası 11 haneli olmalı ve yaş değeri 0'dan büyük olmalıdır.");
	    }
	}

	private boolean isValidTc(String tc) {
	    return tc != null && tc.length() == 11;
	}

	private boolean isValidAge(int age) {
	    return age > 0;
	}

	@Override
	@Transactional
	public void update(LaboratoryTechnician technician) {
		this.technicianDAL.update(technician);
		
	}

	@Override
	@Transactional
	public void delete(LaboratoryTechnician technician) {
		this.technicianDAL.delete(technician);
		
	}

	@Override
	@Transactional
	public LaboratoryTechnician getById(Long id) {
		return this.technicianDAL.getById(id);
	}

	@Override
	public LaboratoryTechnician getByName(String name) {
		return this.technicianDAL.getByName(name);
	}

	@Override
	public LaboratoryTechnician getBySurname(String surname) {
		return this.technicianDAL.getBySurname(surname);
	}

}
