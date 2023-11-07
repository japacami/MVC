package com.example.AtividadeMVC.controller;

import com.example.AtividadeMVC.models.Hospital;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Hospital")
public class HospitalController {
    private static final List<Hospital> hospitais = new ArrayList<>();

    public HospitalController() {
        hospitais.add(new Hospital("Fernando", "Médico Cardiologista"));
        hospitais.add(new Hospital("Jéssica", "Médica Pediatra"));
        hospitais.add(new Hospital("Ana", "Médica Obstetra"));
    }

    @GetMapping
    public String getHospital(Model model) {
        model.addAttribute("hospitais", hospitais);
        return "hospitais";
    }
}