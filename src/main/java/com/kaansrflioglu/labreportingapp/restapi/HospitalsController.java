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

import com.kaansrflioglu.labreportingapp.business.IHospitalsService;

@RestController
@RequestMapping("/hospitalApi")
public class HospitalsController {
    private final IHospitalsService hospitalsService;

    @Autowired
    public HospitalsController(IHospitalsService hospitalsService) {
        this.hospitalsService = hospitalsService;
    }

    @GetMapping("/hospitals")
    public List<Hospitals> getAllHospitalss() {
        return hospitalsService.getAll();
    }
    
    @PostMapping("/add")
    public void add(@RequestBody Hospitals hospitals) {
    	hospitalsService.add(hospitals);
    }

    @PostMapping("/update")
    public void update(@RequestBody Hospitals hospitals) {
    	hospitalsService.update(hospitals);
    }
    
    @PostMapping("/delete")
    public void delete(@RequestBody Hospitals hospitals) {
    	hospitalsService.delete(hospitals);
    }
    
    @GetMapping("/hospitals/{id}")
    public Hospitals getById(@PathVariable Long id) {
    	return hospitalsService.getById(id);
    }
    
}
