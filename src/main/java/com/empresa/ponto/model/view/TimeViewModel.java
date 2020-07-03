package com.empresa.ponto.model.view;

import com.empresa.ponto.model.entity.People;

import java.util.Date;

public class TimeViewModel {

    private Long id;
    private People employee;
    private Date date;
    private Long markingIn;
    private Long markingOut;
    private String justification;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public People getEmployee() {
        return employee;
    }

    public void setEmployee(People employee) {
        this.employee = employee;
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
