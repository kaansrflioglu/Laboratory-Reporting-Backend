package com.kaansrflioglu.labreportingapp.dal;

import com.kaansrflioglu.labreportingapp.entities.*;
import java.util.List;

public interface IReportDAL {
	List<Report> getAll();
	List<Report> getAllByDateDesc();
	List<Report> getAllByDateAsc();
	List<Report> getIdByDateDesc(String id);
	List<Report> getIdByDateAsc(String id);
	void add(Report report);
	void update(Report report);
	void delete(Report report);
	Report getById(Long id);
}
