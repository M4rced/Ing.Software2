package com.mybudget.personalbudget.entity;

import java.util.UUID;

import com.mybudget.personalbudget.crosscutting.utils.UtilUUID;

public class BudgetEntity {
	
	private UUID id;
	private YearEntity year;
	private PersonEntity person;
	
	public BudgetEntity() {
		setId(UtilUUID.DEFAULT_UUID);
		setYear(new YearEntity());
		setPerson(new PersonEntity());
	}
	
	public BudgetEntity(final YearEntity year,final PersonEntity person) {
		setYear(year);
		setPerson(person);
	}

	public final YearEntity getYear() {
		if(year == null) {
			setYear(new YearEntity());
		}
		return year;
	}
	
	public final void setYear(final YearEntity year) {
		this.year = year;
	}
	
	public final PersonEntity getPerson() {
		if(person == null) {
			setPerson((new PersonEntity()));
		}
		return person;
	}
	
	public final void setPerson(final PersonEntity person) {
		this.person = person;
	}

	public final UUID getId() {
		if(id == null) {
			setId(UtilUUID.DEFAULT_UUID);
		}
		return id;
	}

	public final void setId(final UUID id) {
		this.id = id;
	}
	
	
}
