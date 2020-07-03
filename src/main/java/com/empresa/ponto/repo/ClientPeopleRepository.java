package com.empresa.ponto.repo;

import com.empresa.ponto.model.entity.ClientPeople;
import org.springframework.data.repository.CrudRepository;

public interface ClientPeopleRepository extends CrudRepository<ClientPeople, Long> {

    void deleteAllByClientPeopleId_PeopleId(Long id);

    Iterable<ClientPeople> findAllByClientPeopleId_PeopleId(Long peopleId);
}
