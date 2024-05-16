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

import com.kaansrflioglu.labreportingapp.business.IInpatientsService;

@RestController
@RequestMapping("/inpatientApi")
public class InpatientsController {
    private final IInpatientsService inpatientsService;

    @Autowired
    public InpatientsController(IInpatientsService inpatientsService) {
        this.inpatientsService = inpatientsService;
    }

    @GetMapping("/inpatients")
    public List<Inpatient> getAllInpatients() {
        return inpatientsService.getAll();
    }
    
    @PostMapping("/add")
    public void add(@RequestBody Inpatient inpatients) {
    	inpatientsService.add(inpatients);
    }

    @PostMapping("/update")
    public void update(@RequestBody Inpatient inpatients) {
    	inpatientsService.update(inpatients);
    }
    
    @PostMapping("/delete")
    public void delete(@RequestBody Inpatient inpatients) {
    	inpatientsService.delete(inpatients);
    }
    
    @GetMapping("/inpatients/{id}")
    public Inpatient getById(@PathVariable String id) {
    	return inpatientsService.getById(id);
    }
    
}
