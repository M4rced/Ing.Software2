package com.mybudget.personalbudget.domain.builder;

import java.util.UUID;

import com.mybudget.personalbudget.crosscutting.utils.UtilUUID;
import com.mybudget.personalbudget.domain.BudgetDomain;
import com.mybudget.personalbudget.domain.PersonDomain;
import com.mybudget.personalbudget.domain.YearDomain;

public class BudgetDomainBuilder {
	
	private UUID id;
	private YearDomain year;
	private PersonDomain person;
	
	private BudgetDomainBuilder() {
		setId(UtilUUID.DEFAULT_UUID);
		setYear(year);
		setPerson(person);
	}
	
	public static final BudgetDomainBuilder get() {
		return new BudgetDomainBuilder();
	}
	
	public final BudgetDomainBuilder setId(final UUID id) {
		this.id = (id == null) ? UtilUUID.DEFAULT_UUID : id;
		return this;
	}
	
	public final BudgetDomainBuilder setYear(final YearDomain year) {
		this.year = (year == null) ? YearDomainBuilder.get().build() :year;
		return this;
	}
	
	private final BudgetDomainBuilder setPerson(final PersonDomain person) {
		this.person = (person == null) ? PersonDomainBuilder.get().build(): person;
		return this;
	}
	
	public final BudgetDomain build() {
		return BudgetDomain.build(id, year, person);
	}

}
