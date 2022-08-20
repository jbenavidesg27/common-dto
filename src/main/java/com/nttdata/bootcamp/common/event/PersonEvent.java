package com.nttdata.bootcamp.common.event;

import java.util.Date;
import java.util.UUID;

import com.nttdata.bootcamp.common.dto.PersonDto;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
public class PersonEvent implements Event {
	private UUID eventId=UUID.randomUUID();
    private Date eventDate=new Date();
    private PersonDto personDto;
    private PersonStatus personStatus;
	@Override
	public UUID getEventId() {
		return eventId;
	}
	@Override
	public Date getDate() {
		return eventDate;
	}
	public PersonEvent(PersonDto personDto, PersonStatus personStatus) {		
		this.personDto = personDto;
		this.personStatus = personStatus;
	}
	
	

}
