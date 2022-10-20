package com.mybudget.personalbudget.dto;

public final class BudgetDTO {
	
	private YearDTO year;
	private PersonDTO person;
	
	public BudgetDTO() {
		setYear(YearDTO.build());
		setPerson(PersonDTO.build());
	}
	
	public BudgetDTO(final YearDTO year,final PersonDTO person) {
		setYear(year);
		setPerson(person);
	}

	public final YearDTO getYear() {
		if(year == null) {
			setYear(YearDTO.build());
		}
		return year;
	}
	
	public final void setYear(final YearDTO year) {
		this.year = year;
	}
	
	public final PersonDTO getPerson() {
		if(person == null) {
			setPerson(PersonDTO.build());
		}
		return person;
	}
	
	public final void setPerson(final PersonDTO person) {
		this.person = person;
	}
}
