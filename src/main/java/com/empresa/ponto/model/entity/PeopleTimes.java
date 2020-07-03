package com.empresa.ponto.model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
public class PeopleTimes {

    public PeopleTimes() {}

    public PeopleTimes(Long peopleId, Integer weekday, Integer markingIn, Integer markingOut) {
        this.peopleId = peopleId;
        this.weekday = weekday;
        this.markingIn = markingIn;
        this.markingOut = markingOut;
    }

    /*****************************************************************************************/

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long peopleId;

    @Nullable
    private Integer weekday;
    @Nullable
    private Integer markingIn;
    @Nullable
    private Integer markingOut;

    /***********************************************************************************/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPeople() {
        return peopleId;
    }

    public void setPeople(Long people) {
        this.peopleId = peopleId;
    }

    public Integer getWeekday() {
        return weekday;
    }

    public void setWeekday(Integer weekday) {
        this.weekday = weekday;
    }

    public Integer getMarkingIn() {
        return markingIn;
    }

    public void setMarkingIn(Integer markingIn) {
        this.markingIn = markingIn;
    }

    public Integer getMarkingOut() {
        return markingOut;
    }

    public void setMarkingOut(Integer markingOut) {
        this.markingOut = markingOut;
    }
}
