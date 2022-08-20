package com.nttdata.bootcamp.common.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountPassiveDto {
	  private String id;	  
	  private Boolean flagSavings;
	  
	  private Boolean flagCurrent;
	  
	  private List<AccountCurrentDto> accountCurrent;
	  
	  private AccountSavingsDto accountSavings;
	  
	  private FixedTermDto fixedTerm;
	  
	  private PersonDto person;
	  
	 

}
