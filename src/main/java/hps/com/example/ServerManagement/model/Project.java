package hps.com.example.ServerManagement.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="client")
    private String client;
    @Column(name="team")
    private String team;


    //ORM ONE TO MANY
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id")
    private Set<Environement> environements ;

    //CONSTRUCTOR
    public Project(Long id, String firstName, String client, String team, Set<Environement> environements) {
        this.id = id;
        this.firstName = firstName;
        this.client = client;
        this.team = team;
        this.environements = environements;
    }

    //NO ARGS CONSTRUCTOR
    public Project() {
    }
//GETTERS AND SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


    //TO STRING METHOD

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + firstName + '\'' +
                ", client='" + client + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
    //equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        return id != null ? id.equals(project.id) : project.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }


}



