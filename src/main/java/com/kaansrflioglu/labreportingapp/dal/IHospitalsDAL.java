package com.kaansrflioglu.labreportingapp.dal;

import com.kaansrflioglu.labreportingapp.entities.*;
import java.util.List;

public interface IHospitalsDAL {
	List<Hospitals> getAll();
	void add(Hospitals hospital);
	void update(Hospitals hospital);
	void delete(Hospitals hospital);
	Hospitals getById(Long id);

}
