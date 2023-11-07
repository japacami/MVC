package com.example.AtividadeMVC.controller;

import com.example.AtividadeMVC.models.Hospital;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/Hospital")
public class ApiController {
    private List<Hospital> hospitais = new ArrayList<>();

    public ApiController() {
        hospitais.add(new Hospital("Fernando", "Médico Cardiologista"));
        hospitais.add(new Hospital("Jéssica", "Médica Pediatra"));
        hospitais.add(new Hospital("Ana", "Médica Obstetra"));
    }

    @GetMapping
    public List<Hospital> apiHospital(){
        return hospitais;
    }
}