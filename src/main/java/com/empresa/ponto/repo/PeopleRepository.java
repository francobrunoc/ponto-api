package com.empresa.ponto.repo;

import com.empresa.ponto.model.entity.People;
import org.springframework.data.repository.CrudRepository;

public interface PeopleRepository extends CrudRepository<People, Long> {
}
