package hps.com.example.ServerManagement.bootstrap;

import hps.com.example.ServerManagement.model.Project;
import hps.com.example.ServerManagement.repository.ProjectRepository;
import org.springframework.boot.CommandLineRunner;

public class BoostrapData implements CommandLineRunner {
//DEPENDECIE INJECTION
    private final ProjectRepository projectRepository;
//PROJECT REPOSITORY CONSTRUCTOR
    public BoostrapData(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    // TEST INSTENTIATION
        Project cih = new Project ();
        cih.setClient("banque populaire");
        cih.setFirstName("bp");
        cih.setTeam("devops");
     //SAVING OBJECT THROUGH JPA
        projectRepository.save(cih);

        System.out.println("projetcs save"+projectRepository.findAll());
    }
}
