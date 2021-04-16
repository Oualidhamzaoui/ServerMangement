package hps.com.example.ServerManagement.controller;

import hps.com.example.ServerManagement.model.Project;
import hps.com.example.ServerManagement.model.Server;
import hps.com.example.ServerManagement.repository.ProjectRepository;
import hps.com.example.ServerManagement.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/v1")
public class ServerController {

    @Autowired
    private ServerRepository serverRepository;

    //getALLProject
    @GetMapping("severs")
    public List<Server> getAllServers (){
        return (List<Server>)  serverRepository.findAll();
    }
}
