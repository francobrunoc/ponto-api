package com.empresa.ponto.model.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class TimeRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private People people;

    private Date date;

    @Nullable
    private Long markingIn;

    @Nullable
    private Long markingOut;

    @Nullable
    private String justification;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getMarkingIn() {
        return markingIn;
    }

    public void setMarkingIn(Long markingIn) {
        this.markingIn = markingIn;
    }

    public Long getMarkingOut() {
        return markingOut;
    }

    public void setMarkingOut(Long markingOut) {
        this.markingOut = markingOut;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }
}
