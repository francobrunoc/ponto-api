package com.empresa.ponto.model.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ClientPeopleId implements Serializable {

    private Long clientId;
    private Long peopleId;

    public ClientPeopleId() {}

    public ClientPeopleId(Long clientId, Long peopleId) {
        this.clientId = clientId;
        this.peopleId = peopleId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(Long peopleId) {
        this.peopleId = peopleId;
    }
}
