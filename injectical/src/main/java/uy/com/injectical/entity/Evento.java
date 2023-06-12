package uy.com.injectical.entity;

import java.util.Collection;
import java.util.Date;

public class Evento {
	
	private Integer 				id;
	private String 					pais;
	private String 					name;
	private Date 					dateStart;
	private Date 					dateFinish;
	private boolean 				_inicio;
	private boolean 				_final;
	private Disciplina  			discipline;
	private Collection<Detalles> 	detailsList;
	
	public Evento() {}
	public Evento(Integer id, String pais, String name, Date dateStart, Date dateFinish, boolean _inicio,boolean _final,Disciplina discipline,Collection<Detalles> detailsList) {
		this.id 		= id;
		this.pais		= pais;
		this.name 		= name;
		this.dateStart 	= dateStart;
		this.dateFinish = dateFinish;
		this._inicio 	= _inicio;
		this._final 	= _final;
		this.discipline	= discipline;
		this.detailsList= detailsList;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateStart() {
		return dateStart;
	}
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}
	public Date getDateFinish() {
		return dateFinish;
	}
	public void setDateFinish(Date dateFinish) {
		this.dateFinish = dateFinish;
	}
	public boolean is_inicio() {
		return _inicio;
	}
	public void set_inicio(boolean _inicio) {
		this._inicio = _inicio;
	}
	public boolean is_final() {
		return _final;
	}
	public void set_final(boolean _final) {
		this._final = _final;
	}
	public Disciplina getDiscipline() {
		return discipline;
	}
	public void setDiscipline(Disciplina discipline) {
		this.discipline = discipline;
	}
	public Collection<Detalles> getDetailsList() {
		return detailsList;
	}
	public void setDetailsList(Collection<Detalles> detailsList) {
		this.detailsList = detailsList;
	}
	
	
	
	

}
