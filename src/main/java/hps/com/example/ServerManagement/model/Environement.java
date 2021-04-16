package hps.com.example.ServerManagement.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="environements")
public class Environement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="properties")
    private String properties;
    //ORM RELATION TO PROJECT
    @ManyToOne
    private Set<Project> projects;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "environement_id")
    private Set<Server> servers;

//NO ARGS CONSTRUCTOR
    public Environement() {
    }
//CONSTRUCTOR


    public Environement(Long id, String name, String properties, Set<Project> projects, Set<Server> servers) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.projects = projects;
        this.servers = servers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String propperties) {
        this.properties = propperties;
    }

    @Override
    public String toString() {
        return "Environement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", propperties='" + properties + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Environement that = (Environement) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
