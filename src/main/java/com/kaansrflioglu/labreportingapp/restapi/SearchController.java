package com.kaansrflioglu.labreportingapp.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kaansrflioglu.labreportingapp.entities.*;

import com.kaansrflioglu.labreportingapp.business.*;

@RestController
@RequestMapping("/api")
public class SearchController {
    private final IInpatientsService inpatientsService;
    private final ITechnicianService technicianService;
    private final IReportService reportService;

    @Autowired
    public SearchController(IInpatientsService inpatientsService, ITechnicianService technicianService, IReportService reportService) {
        this.inpatientsService = inpatientsService;
        this.technicianService = technicianService;
        this.reportService = reportService;
        
    }
    
    //TC Kimlik Numarasına Göre Hastayı Görüntüler
    @GetMapping("/inpatientTC/{id}")
    public Inpatient getById(@PathVariable String id) {
    	return inpatientsService.getById(id);
    }
    
    //İsme Göre Hastayı Görüntüler
    @GetMapping("/inpatientName/{name}")
    public Inpatient getInpatientName(@PathVariable String name) {
        return inpatientsService.getByName(name);
    }
    
    //Soyisime Göre Hastayı Görüntüler
    @GetMapping("/inpatientSurname/{surname}")
    public Inpatient getInpatientSurname(@PathVariable String surname) {
        return inpatientsService.getBySurname(surname);
    }
    
    //İsme Göre Teknikeri Görüntüler
    @GetMapping("/technicianName/{name}")
    public LaboratoryTechnician getTechnicianName(@PathVariable String name) {
    	return technicianService.getByName(name);
    }
    
    //Soyisime Göre Teknikeri Görüntüler
    @GetMapping("/technicianSurname/{surname}")
    public LaboratoryTechnician getTechnicianSurname(@PathVariable String surname) {
    	return technicianService.getBySurname(surname);
    }

    //Tüm Raporları Görüntüler
    @GetMapping("/reports")
    public List<Report> getAllInpatients() {
        return reportService.getAll();
    }
    
    //Azalan Tarihe Göre Raporları Görüntüler
    @GetMapping("/reports/desc")
    public List<Report> getAllInpatientsByDateDesc() {
        return reportService.getAllByDateDesc();
    }
    
    //Artan Tarihe Göre Raporları Görüntüler
    @GetMapping("/reports/asc")
    public List<Report> getAllInpatientsByDateAsc() {
        return reportService.getAllByDateAsc();
    }
    
    //Rapor ID'sine Göre Raporu Görüntüler
    @GetMapping("/report/{id}")
    public Report getById(@PathVariable Long id) {
    	return reportService.getById(id);
    }
    
    //Rapor ID'sine Göre Raporu Azalan Tarihe Göre Görüntüler
    @GetMapping("/report/desc/{id}")
    public List<Report> getIdByDateDesc(@PathVariable String id) {
        return reportService.getIdByDateDesc(id);
    }
    
  //Rapor ID'sine Göre Raporu Artan Tarihe Göre Görüntüler
    @GetMapping("/report/asc/{id}")
    public List<Report> getIdByDateAsc(@PathVariable String id) {
        return reportService.getIdByDateAsc(id);
    }
    
    //Yeni Rapor Oluşturur
    @PostMapping("/report/add")
    public void add(@RequestBody Report report) {
    	reportService.add(report);
    }

    //Var Olan Bir Raporu Günceller
    @PostMapping("/report/update")
    public void update(@RequestBody Report report) {
    	reportService.update(report);
    }
    
    //Var Olan Bir Raporu Siler
    @PostMapping("/report/delete")
    public void delete(@RequestBody Report report) {
    	reportService.delete(report);
    }
        
}
