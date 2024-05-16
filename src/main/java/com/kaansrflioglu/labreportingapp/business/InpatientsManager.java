package com.kaansrflioglu.labreportingapp.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kaansrflioglu.labreportingapp.dal.IInpatientsDAL;
import com.kaansrflioglu.labreportingapp.entities.Inpatient;

@Service
public class InpatientsManager implements IInpatientsService {

	
	private IInpatientsDAL inpatientsDAL;
	
	@Autowired
	public InpatientsManager(IInpatientsDAL inpatientsDAL) {
		this.inpatientsDAL = inpatientsDAL;
	}

	@Override
	@Transactional
	public List<Inpatient> getAll() {
		return this.inpatientsDAL.getAll();
	}

	@Override
	@Transactional
	public void add(Inpatient inpatient) {
		//ekleme koşulları
		this.inpatientsDAL.add(inpatient);
		
	}

	@Override
	@Transactional
	public void update(Inpatient inpatient) {
		this.inpatientsDAL.update(inpatient);
		
	}

	@Override
	@Transactional
	public void delete(Inpatient inpatient) {
		this.inpatientsDAL.delete(inpatient);
		
	}

	@Override
	@Transactional
	public Inpatient getById(String id) {
		return this.inpatientsDAL.getById(id);
	}

}
