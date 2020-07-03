package com.empresa.ponto.service;

import com.empresa.ponto.exception.PeopleException;
import com.empresa.ponto.model.entity.ClientPeople;
import com.empresa.ponto.model.entity.People;
import com.empresa.ponto.model.entity.PeopleTimes;
import com.empresa.ponto.model.view.PeopleViewModel;
import com.empresa.ponto.repo.ClientPeopleRepository;
import com.empresa.ponto.repo.Mapper;
import com.empresa.ponto.repo.PeopleRepository;
import com.empresa.ponto.repo.PeopleTimesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

@Service
public class PeopleService {

    @Autowired
    private ClientPeopleRepository clientPeopleRepository;
    @Autowired
    private PeopleRepository peopleRepository;
    @Autowired
    private PeopleTimesRepository peopleTimesRepository;

    private Mapper mapper;

    public PeopleService(Mapper mapper,
                         ClientPeopleRepository clientPeopleRepository,
                         PeopleRepository peopleRepository,
                         PeopleTimesRepository peopleTimesRepository) {
        this.mapper = mapper;
        this.clientPeopleRepository = clientPeopleRepository;
        this.peopleRepository = peopleRepository;
        this.peopleTimesRepository = peopleTimesRepository;
    }

    @Transactional
    public People save(PeopleViewModel viewModel) throws PeopleException {
        try {
            People people = this.peopleRepository.save(mapper.convertViewToEntity(viewModel));
            if (people != null) {
                clientPeopleRepository.deleteAllByClientPeopleId_PeopleId(people.getId());
                if (((Collection<ClientPeople>) viewModel.getClients()).size() > 0) {
                    viewModel.getClients().forEach(obj ->
                            clientPeopleRepository.save(new ClientPeople(
                                    obj.getClientPeopleId().getClientId(),
                                    people.getId(),
                                    obj.getStartDate()))
                    );
                }
                if (viewModel.getScale() != null) {
                    viewModel.getScale().forEach(obj ->
                            peopleTimesRepository.save(new PeopleTimes(
                                    people.getId(), obj.getWeekday(),
                                    obj.getMarkingIn(),
                                    obj.getMarkingOut()))
                    );
                } else {
                    peopleTimesRepository.deleteAllByPeopleId(people.getId());
                }
                return people;
            } else throw new PeopleException("Erro ao criar novo funcionário");
        } catch (Exception e) {
          throw new PeopleException(e);
        }
    }

    public Iterable<People> list() {
        Iterable<People> people = peopleRepository.findAll();
        people.forEach(obj ->
            obj.setClients((List<ClientPeople>)
                    clientPeopleRepository.findAllByClientPeopleId_PeopleId(obj.getId()))
        );
        people.forEach(obj ->
                obj.setScale((List<PeopleTimes>)
                        peopleTimesRepository.findAllByPeopleId(obj.getId()))
        );
        return people;
    }

    @Transactional
    public void delete(Long id) {
        try {
            clientPeopleRepository.deleteAllByClientPeopleId_PeopleId(id);
            peopleTimesRepository.deleteAllByPeopleId(id);
            peopleRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new PeopleException(e);
        } catch (Exception e) {
            throw new PeopleException(e);
        }
    }
}
