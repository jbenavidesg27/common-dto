package com.nttdata.bootcamp.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonDto {
	  private String id;
	  
	  private String typePerson;
	  
	  private String typeAccount;
	  
	  private String account;
	  
	  private DocumentsDto documents;
	  
	  private ClientDto client;
	  
	  

}
