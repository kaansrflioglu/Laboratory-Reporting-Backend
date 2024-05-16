package com.kaansrflioglu.labreportingapp.business;

import com.kaansrflioglu.labreportingapp.entities.*;
import java.util.List;

public interface ITechnicianService {
	List<LaboratoryTechnician> getAll();
	void add(LaboratoryTechnician technician);
	void update(LaboratoryTechnician technician);
	void delete(LaboratoryTechnician technician);
	LaboratoryTechnician getById(Long id);
}
