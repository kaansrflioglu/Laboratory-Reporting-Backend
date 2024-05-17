package com.kaansrflioglu.labreportingapp.dal;

import com.kaansrflioglu.labreportingapp.entities.*;
import java.util.List;

public interface IInpatientsDAL {
	List<Inpatient> getAll();
	void add(Inpatient inpatient);
	void update(Inpatient inpatient);
	void delete(Inpatient inpatient);
	Inpatient getById(String id);
	Inpatient getByName(String name);
	Inpatient getBySurname(String surname);
}
