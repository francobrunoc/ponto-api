package com.empresa.ponto.repo;

import com.empresa.ponto.model.entity.People;
import com.empresa.ponto.model.entity.TimeRegister;
import org.springframework.data.repository.CrudRepository;

public interface TimeRegisterRepository extends CrudRepository<TimeRegister, Long> {

    Iterable<TimeRegister> findAllByPeopleId(Long id);
}
