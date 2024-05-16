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

import com.kaansrflioglu.labreportingapp.business.ITechnicianService;

@RestController
@RequestMapping("/technicianApi")
public class TechnicianController {
    private final ITechnicianService technicianService;

    @Autowired
    public TechnicianController(ITechnicianService technicianService) {
        this.technicianService = technicianService;
    }

    @GetMapping("/technicians")
    public List<LaboratoryTechnician> getAllInpatients() {
        return technicianService.getAll();
    }
    
    @PostMapping("/add")
    public void add(@RequestBody LaboratoryTechnician technician) {
    	technicianService.add(technician);
    }

    @PostMapping("/update")
    public void update(@RequestBody LaboratoryTechnician technician) {
    	technicianService.update(technician);
    }
    
    @PostMapping("/delete")
    public void delete(@RequestBody LaboratoryTechnician technician) {
    	technicianService.delete(technician);
    }
    
    @GetMapping("/technicians/{id}")
    public LaboratoryTechnician getById(@PathVariable Long id) {
    	return technicianService.getById(id);
    }
    
}
