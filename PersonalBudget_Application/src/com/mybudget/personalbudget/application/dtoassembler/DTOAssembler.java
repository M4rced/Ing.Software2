package com.mybudget.personalbudget.application.dtoassembler;

public interface DTOAssembler<T, D> {
	
	D assemblerDomain(T dto);
	T assemblerDTO(D domain);

}
