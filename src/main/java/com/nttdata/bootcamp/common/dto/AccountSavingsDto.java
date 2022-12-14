package com.nttdata.bootcamp.common.dto;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountSavingsDto extends AccountGenericDto{
	private BigDecimal maxMovement;
	  private BigDecimal movement;
	  private List<TransactionDto> transactions;

}
