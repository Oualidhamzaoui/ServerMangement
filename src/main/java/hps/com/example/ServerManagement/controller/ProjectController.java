package hps.com.example.ServerManagement.controller;

import hps.com.example.ServerManagement.model.Project;
import hps.com.example.ServerManagement.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v1")
public class ProjectController {
    @Autowired
    private ProjectRepository projectRepository;

    //getALLProject
    @GetMapping ("projects")
    public List<Project> getAllProjects (){
        return (List<Project>) projectRepository.findAll();
    }

}
