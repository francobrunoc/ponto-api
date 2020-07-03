package com.empresa.ponto.repo;

import com.empresa.ponto.model.entity.People;
import com.empresa.ponto.model.entity.TimeRegister;
import com.empresa.ponto.model.view.PeopleViewModel;
import com.empresa.ponto.model.view.TimeViewModel;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    public TimeRegister convertViewToEntity(TimeViewModel model) {
        TimeRegister time = new TimeRegister();
        time.setId(model.getId());
        time.setPeople(model.getEmployee());
        time.setDate(model.getDate());
        time.setMarkingIn(model.getMarkingIn());
        time.setMarkingOut(model.getMarkingOut());
        time.setJustification(model.getJustification());
        return time;
    }

    public People convertViewToEntity(PeopleViewModel model) {
        People people = new People();
        people.setId(model.getId());
        people.setName(model.getName());
        people.setEnrolment(model.getEnrolment());
        people.setEmail(model.getEmail());
        people.setCpf(model.getCpf());
        people.setDateOfBirth(model.getDateOfBirth());
        people.setAdmissionDate(model.getAdmissionDate());
        return people;
    }
}
