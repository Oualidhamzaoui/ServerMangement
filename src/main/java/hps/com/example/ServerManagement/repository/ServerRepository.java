package hps.com.example.ServerManagement.repository;

import hps.com.example.ServerManagement.model.Server;
import org.springframework.data.repository.CrudRepository;

public interface ServerRepository extends CrudRepository<Server,Long> {
}
