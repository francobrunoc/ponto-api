package com.empresa.ponto.control;

import com.empresa.ponto.exception.PeopleException;
import com.empresa.ponto.model.entity.ClientPeople;
import com.empresa.ponto.model.entity.People;
import com.empresa.ponto.model.entity.PeopleTimes;
import com.empresa.ponto.model.view.PeopleViewModel;
import com.empresa.ponto.repo.ClientPeopleRepository;
import com.empresa.ponto.repo.Mapper;
import com.empresa.ponto.repo.PeopleRepository;
import com.empresa.ponto.repo.PeopleTimesRepository;
import com.empresa.ponto.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private PeopleService peopleService;

    public EmployeeController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping("/list")
    public Iterable<People> list() {
        return peopleService.list();
    }

    @PostMapping("/save")
    public People save(@RequestBody PeopleViewModel viewModel) throws PeopleException {
        return peopleService.save(viewModel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        peopleService.delete(id);
    }
}
