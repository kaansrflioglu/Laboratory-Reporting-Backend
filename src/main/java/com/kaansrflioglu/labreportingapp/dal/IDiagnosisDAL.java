package com.kaansrflioglu.labreportingapp.dal;

import com.kaansrflioglu.labreportingapp.entities.*;
import java.util.List;

public interface IDiagnosisDAL {
	List<Diagnosis> getAll();
	void add(Diagnosis diagnosis);
	void update(Diagnosis diagnosis);
	void delete(Diagnosis diagnosis);
	Diagnosis getById(Long id);
}
