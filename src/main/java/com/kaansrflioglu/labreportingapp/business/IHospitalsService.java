package com.kaansrflioglu.labreportingapp.business;

import java.util.List;

import com.kaansrflioglu.labreportingapp.entities.Hospitals;

public interface IHospitalsService {
	List<Hospitals> getAll();
	void add(Hospitals hospital);
	void update(Hospitals hospital);
	void delete(Hospitals hospital);
	Hospitals getById(Long id);
}
