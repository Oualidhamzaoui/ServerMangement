package hps.com.example.ServerManagement.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="servers")
public class Server {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="ip_adress")
    private String ip;
    @Column(name="usernames")
    private String username;
    @Column(name="passwords")
    private String password;
    @Column(name="types")
    private String type;
    @Column(name="ports")
    private int port;
    @Column(name="http_ports")
    private int httpPort;

    @ManyToOne
    private Set<Environement> environements;

//CONSTRUCTOR
    public Server(Long id, String ip, String username, String password,
                  String type, int port, int httpPort, Set<Environement> environements) {
        this.id = id;
        this.ip = ip;
        this.username = username;
        this.password = password;
        this.type = type;
        this.port = port;
        this.httpPort = httpPort;
        this.environements = environements;
    }
//NO ARGS CONSTRUCTOR
    public Server() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(int httpPort) {
        this.httpPort = httpPort;
    }

    public Set<Environement> getEnvironements() {
        return environements;
    }

    public void setEnvironements(Set<Environement> environements) {
        this.environements = environements;
    }

    @Override
    public String toString() {
        return "Server{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", port=" + port +
                ", httpPort=" + httpPort +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Server server = (Server) o;

        return id != null ? id.equals(server.id) : server.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
