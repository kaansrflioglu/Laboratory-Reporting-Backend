package com.kaansrflioglu.labreportingapp.business;

import java.util.List;

import com.kaansrflioglu.labreportingapp.entities.Inpatient;

public interface IInpatientsService {
	List<Inpatient> getAll();
	void add(Inpatient inpatient);
	void update(Inpatient inpatient);
	void delete(Inpatient inpatient);

}
