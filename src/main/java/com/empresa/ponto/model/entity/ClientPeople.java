package com.empresa.ponto.model.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.Date;

@Entity
public class ClientPeople {

   public ClientPeople() {}

   public ClientPeople(Long client, Long people, Date startDate) {
      clientPeopleId = new ClientPeopleId(client, people);
      this.startDate = startDate;
   }

   /****************************************************************************************/

   @EmbeddedId
   private ClientPeopleId clientPeopleId;

   private Date startDate;

   @Transient
   private Long clientId;

   /***************************************************************************************/

   public ClientPeopleId getClientPeopleId() {
      return clientPeopleId;
   }

   public void setClientPeopleId(ClientPeopleId clientPeopleId) {
      this.clientPeopleId = clientPeopleId;
   }

   public Date getStartDate() {
      return startDate;
   }

   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   public Long getClientId() {
      return clientId;
   }

   public void setClientId(Long clientId) {
      this.clientId = clientId;
   }
}
