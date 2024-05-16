package com.kaansrflioglu.labreportingapp.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kaansrflioglu.labreportingapp.entities.*;
import java.util.List;

import com.kaansrflioglu.labreportingapp.business.IInpatientsService;

@RestController
@RequestMapping("/api")
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
}
