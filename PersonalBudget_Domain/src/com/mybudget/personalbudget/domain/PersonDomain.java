package com.mybudget.personalbudget.domain;

public class PersonDomain {
	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstSurname;
	private String secondSurname;
	
	private PersonDomain(final String id, final String idCard, final String firstName, final String middleName,
	final String firstSurname, final String secondSurname) {
	}
	
	public static final PersonDomain build(final String id, final String idCard, final String firstName, final String middleName,
	final String firstSurname, final String secondSurname) {
		return new PersonDomain(id, idCard, firstName, middleName, firstSurname, secondSurname);
	}

	private final void setId(final String id) {
		this.id = (id == null) ? "" : id.trim();
	}

	public final void setIdCard(final String idCard) {
		this.idCard = (idCard == null) ? "" : idCard.trim();
	}

	public final void setFirstName(final String firstName) {
		this.firstName = (firstName == null) ? "" : firstName.trim();
	}

	public final void setMiddleName(final String middleName) {
		this.middleName = (middleName == null) ? "" : middleName.trim();
	}

	public final void setFirstSurname(final String firstSurname) {
		this.firstSurname = (firstSurname == null) ? "" : firstSurname.trim();
	}

	public final void setSecondSurname(final String secondSurname) {
		this.secondSurname = (secondSurname == null) ? "" : secondSurname.trim();
	}
	
	public final String getId() {
		return id;
	}
	
	public final String getIdCard() {
		return idCard;
	}
	
	public final String getFirstName() {
		return firstName;
	}
	
	public final String getMiddleName() {
		return middleName;
	}
	
	public final String getFirstSurname() {
		return firstSurname;
	}
	
	public final String getSecondSurname() {
		return secondSurname;
	}
	
	public final String getLastName() {
		return (getFirstSurname() + " " + getSecondSurname()).trim();
	}
	
	public final String getName() {
		return (getFirstName() + " " +getMiddleName()).trim();
	}
	
	public final String getCompleteName() {
		return getName() + " " + getLastName();
	}
}
