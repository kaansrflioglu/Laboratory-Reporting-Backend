package com.kaansrflioglu.labreportingapp.dal;

import com.kaansrflioglu.labreportingapp.entities.*;
import java.util.List;

public interface ITechnicianDAL {
	List<LaboratoryTechnician> getAll();
	void add(LaboratoryTechnician technician);
	void update(LaboratoryTechnician technician);
	void delete(LaboratoryTechnician technician);
	LaboratoryTechnician getById(Long id);
	LaboratoryTechnician getByName(String name);
	LaboratoryTechnician getBySurname(String surname);
}
