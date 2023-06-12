package uy.com.injectical.entity;

import java.util.Collection;

public class Equipo {
	
	private Collection<Deportista> sportsmanList;
	private Integer id;
	private String name;
	private String country;
	
	public Equipo() {}
	public Equipo(Collection<Deportista> sportsmanList, Integer id, String name, String country) {
		this.sportsmanList = sportsmanList;
		this.id = id;
		this.name = name;
		this.country = country;
	}
	
	
	public Collection<Deportista> getSportsmanList() {
		return sportsmanList;
	}
	public void setSportsmanList(Collection<Deportista> sportsmanList) {
		this.sportsmanList = sportsmanList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
