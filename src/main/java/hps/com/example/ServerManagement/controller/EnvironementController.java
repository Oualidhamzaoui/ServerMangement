package hps.com.example.ServerManagement.controller;

import hps.com.example.ServerManagement.model.Environement;
import hps.com.example.ServerManagement.model.Project;
import hps.com.example.ServerManagement.repository.EnvironementRepository;
import hps.com.example.ServerManagement.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/v1")
public class EnvironementController {

    @Autowired
    private EnvironementRepository environementRepository;

    //getALLProject
    @GetMapping("environements")
    public List<Environement> getAllEnvironements (){
        return (List<Environement>) environementRepository.findAll();
    }
}
