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

import com.kaansrflioglu.labreportingapp.business.IDiagnosisService;

@RestController
@RequestMapping("/diagnosisApi")
public class DiagnosisController {
    private final IDiagnosisService diagnosisService;

    @Autowired
    public DiagnosisController(IDiagnosisService diagnosisService) {
        this.diagnosisService = diagnosisService;
    }

    @GetMapping("/diagnosis")
    public List<Diagnosis> getAllDiagnosis() {
        return diagnosisService.getAll();
    }
    
    @PostMapping("/add")
    public void add(@RequestBody Diagnosis diagnosis) {
    	diagnosisService.add(diagnosis);
    }

    @PostMapping("/update")
    public void update(@RequestBody Diagnosis diagnosis) {
    	diagnosisService.update(diagnosis);
    }
    
    @PostMapping("/delete")
    public void delete(@RequestBody Diagnosis diagnosis) {
    	diagnosisService.delete(diagnosis);
    }
    
    @GetMapping("/diagnosis/{id}")
    public Diagnosis getById(@PathVariable Long id) {
    	return diagnosisService.getById(id);
    }
    
}
