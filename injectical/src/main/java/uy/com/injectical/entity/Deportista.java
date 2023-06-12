package uy.com.injectical.entity;

import java.util.Date;

public class Deportista {
	
	private Integer 	id;
	private Date 		birthdate;
	private String 		name;
	private String 		lastName;
	private String 		country;
	private Disciplina 	discipline;
	
	public Deportista() {}
	public Deportista(Integer id, Date birthdate, String name, String lastName, String country,Disciplina discipline) {
		this.id 		= id;
		this.birthdate 	= birthdate;
		this.name 		= name;
		this.lastName 	= lastName;
		this.country 	= country;
		this.discipline = discipline;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public Disciplina getDiscipline() {
		return discipline;
	}
	public void setDiscipline(Disciplina discipline) {
		this.discipline = discipline;
	}
	
	
}
