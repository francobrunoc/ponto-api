package com.empresa.ponto.model.view;

import com.empresa.ponto.model.entity.ClientPeople;
import com.empresa.ponto.model.entity.PeopleTimes;

import java.time.LocalDate;

public class PeopleViewModel {

    private Long id;
    private String name;
    private String enrolment;
    private String cpf;
    private LocalDate dateOfBirth;
    private String email;
    private LocalDate admissionDate;
    private Iterable<ClientPeople> clients;
    private Iterable<PeopleTimes> scale;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrolment() {
        return enrolment;
    }

    public void setEnrolment(String enrolment) {
        this.enrolment = enrolment;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Iterable<ClientPeople> getClients() {
        return clients;
    }

    public void setClients(Iterable<ClientPeople> clients) {
        this.clients = clients;
    }

    public Iterable<PeopleTimes> getScale() {
        return scale;
    }

    public void setScale(Iterable<PeopleTimes> scale) {
        this.scale = scale;
    }
}
