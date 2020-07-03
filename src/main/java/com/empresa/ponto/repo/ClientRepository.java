package com.empresa.ponto.repo;

import com.empresa.ponto.model.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {

}
