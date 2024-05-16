package com.kaansrflioglu.labreportingapp.business;

import com.kaansrflioglu.labreportingapp.entities.*;
import java.util.List;

public interface IReportService {
	List<Report> getAll();
	void add(Report report);
	void update(Report report);
	void delete(Report report);
	Report getById(Long id);
}
