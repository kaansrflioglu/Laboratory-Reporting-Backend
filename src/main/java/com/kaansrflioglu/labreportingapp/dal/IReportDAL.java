package com.kaansrflioglu.labreportingapp.dal;

import com.kaansrflioglu.labreportingapp.entities.*;
import java.util.List;

public interface IReportDAL {
	List<Report> getAll();
	void add(Report report);
	void update(Report report);
	void delete(Report report);
	Report getById(Long id);
}