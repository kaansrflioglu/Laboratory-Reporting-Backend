package com.kaansrflioglu.labreportingapp.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kaansrflioglu.labreportingapp.entities.*;
import java.util.List;

import com.kaansrflioglu.labreportingapp.business.IReportService;

@RestController
@RequestMapping("/reportApi")
public class ReportController {
    private final IReportService reportService;

    @Autowired
    public ReportController(IReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/reports")
    public List<Report> getAllInpatients() {
        return reportService.getAll();
    }
    
    @PostMapping("/add")
    public void add(@RequestBody Report report) {
    	reportService.add(report);
    }

    @PostMapping("/update")
    public void update(@RequestBody Report report) {
    	reportService.update(report);
    }
    
    @PostMapping("/delete")
    public void delete(@RequestBody Report report) {
    	reportService.delete(report);
    }
    
    @GetMapping("/reports/{id}")
    public Report getById(@PathVariable Long id) {
    	return reportService.getById(id);
    }
    
}
