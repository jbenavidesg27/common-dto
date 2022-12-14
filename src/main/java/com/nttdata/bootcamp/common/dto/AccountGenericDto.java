package com.nttdata.bootcamp.common.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountGenericDto {
	 private String description;
	  private BigDecimal account;
	  private Date dateTransaction;
	  private Boolean flagPrincipal;

}
