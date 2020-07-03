package com.empresa.ponto.repo;

import com.empresa.ponto.model.entity.PeopleTimes;
import org.springframework.data.repository.CrudRepository;

public interface PeopleTimesRepository extends CrudRepository<PeopleTimes, Long> {

    void deleteAllByPeopleId(Long id);

    Iterable<PeopleTimes> findAllByPeopleId(Long id);

}

