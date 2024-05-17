package com.kaansrflioglu.labreportingapp.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kaansrflioglu.labreportingapp.dal.IReportDAL;
import com.kaansrflioglu.labreportingapp.entities.Report;

@Service
public class ReportManager implements IReportService {

	
	private IReportDAL reportDAL;
	
	@Autowired
	public ReportManager(IReportDAL reportDAL) {
		this.reportDAL = reportDAL;
	}

	@Override
	@Transactional
	public List<Report> getAll() {
		return this.reportDAL.getAll();
	}

	@Override
	@Transactional
	public void add(Report report) {
		this.reportDAL.add(report);
	}

	@Override
	@Transactional
	public void update(Report report) {
		this.reportDAL.update(report);
		
	}

	@Override
	@Transactional
	public void delete(Report report) {
		this.reportDAL.delete(report);
		
	}

	@Override
	@Transactional
	public Report getById(Long id) {
		return this.reportDAL.getById(id);
	}

	@Override
	@Transactional
	public List<Report> getAllByDateDesc() {
		return this.reportDAL.getAllByDateDesc();
	}

	@Override
	@Transactional
	public List<Report> getAllByDateAsc() {
		return this.reportDAL.getAllByDateAsc();
	}

	@Override
	@Transactional
	public List<Report> getIdByDateDesc(String id) {
		return this.reportDAL.getIdByDateDesc(id);
	}

	@Override
	@Transactional
	public List<Report> getIdByDateAsc(String id) {
		return this.reportDAL.getIdByDateAsc(id);
	}

}
