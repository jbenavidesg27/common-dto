package com.nttdata.bootcamp.common.event;

import java.util.Date;
import java.util.UUID;

import com.nttdata.bootcamp.common.dto.AccountPassiveDto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AccountEvent implements Event {
	private UUID eventId=UUID.randomUUID();
    private Date eventDate=new Date();
    private AccountPassiveDto accountPassiveDto;
    private AccountStatus accountStatus;
	@Override
	public UUID getEventId() {
		return eventId;
	}
	@Override
	public Date getDate() {
		return eventDate;
	}
	public AccountEvent(AccountPassiveDto accountPassiveDto, AccountStatus accountStatus) {
		this.accountPassiveDto = accountPassiveDto;
		this.accountStatus = accountStatus;
	}
	
	

}
