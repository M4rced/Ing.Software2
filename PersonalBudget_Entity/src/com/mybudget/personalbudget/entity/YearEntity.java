package com.mybudget.personalbudget.entity;

import java.util.UUID;

import com.mybudget.personalbudget.crosscutting.utils.UtilUUID;

public class YearEntity {
	private UUID id;
	private int year;
	
	public YearEntity() {
		setId(UtilUUID.DEFAULT_UUID);
		setYear(0);
	}
	
	public YearEntity(final UUID id,final int year) {
		setId(id);
		setYear(year);
	
	}
	
	public final UUID getId() {
		if(id == null) {
			setId(UtilUUID.DEFAULT_UUID);
		}
		return id;
	}
	
	public final void setId(UUID id) {
		this.id = id;
	}
	
	public final int getYear() {
		if(year < 0) {
			setYear(0);
		}
		return year;
	}
	
	public final void setYear(int year) {
		this.year = year;
	}
}
