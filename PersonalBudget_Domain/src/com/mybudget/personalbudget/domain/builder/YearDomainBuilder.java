package com.mybudget.personalbudget.domain.builder;

import java.util.UUID;

import com.mybudget.personalbudget.crosscutting.utils.UtilUUID;
import com.mybudget.personalbudget.domain.YearDomain;

public class YearDomainBuilder {
	
	private  UUID id;
	private  int year;
	
	private YearDomainBuilder() {
		setId(UtilUUID.DEFAULT_UUID);
		setYear(0);
	}
	
	public static final YearDomainBuilder get() {
		return new YearDomainBuilder();
	}
	
	public final YearDomainBuilder setId(UUID id) {
		this.id = (id == null) ? UtilUUID.DEFAULT_UUID: id;
		return this;
	}

	public final YearDomainBuilder setYear(int year) {
		this.year = year;
		return this;
	}

	private final String getId() {
		return id;
	}

	private final int getYear() {
		return year;
	}
	
	public YearDomain build() {
		return YearDomain.build(getId(), getYear());
	}
	
}
