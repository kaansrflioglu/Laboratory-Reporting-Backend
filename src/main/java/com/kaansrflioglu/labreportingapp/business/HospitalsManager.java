package com.kaansrflioglu.labreportingapp.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kaansrflioglu.labreportingapp.dal.IHospitalsDAL;
import com.kaansrflioglu.labreportingapp.entities.Hospitals;

@Service
public class HospitalsManager implements IHospitalsService {

	
	private IHospitalsDAL hospitalsDAL;
	
	@Autowired
	public HospitalsManager(IHospitalsDAL hospitalsDAL) {
		this.hospitalsDAL = hospitalsDAL;
	}

	@Override
	@Transactional
	public List<Hospitals> getAll() {
		return this.hospitalsDAL.getAll();
	}

	@Override
	@Transactional
	public void add(Hospitals hospitals) {
	    if (hospitals.getCity() != null) {
	        if (hospitals.getCity().getCityID() >= 1 && hospitals.getCity().getCityID() <= 81) {
	            this.hospitalsDAL.add(hospitals);
	        } else {
	            throw new IllegalArgumentException("City ID 1 ile 81 arasında olmalıdır.");
	        }
	    } else {
	        throw new IllegalArgumentException("Şehir bilgisi boş olamaz. Lütfen geçerli bir şehir seçin.");
	    }
	}


	@Override
	@Transactional
	public void update(Hospitals hospitals) {
		this.hospitalsDAL.update(hospitals);
		
	}

	@Override
	@Transactional
	public void delete(Hospitals hospitals) {
		this.hospitalsDAL.delete(hospitals);
		
	}

	@Override
	@Transactional
	public Hospitals getById(Long id) {
		return this.hospitalsDAL.getById(id);
	}

}
