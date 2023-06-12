package uy.com.injectical.entity;

import java.util.Collection;

public class Masivo extends Evento{
	
	private Collection<Equipo> teamList;

	public Masivo() {}
	public Masivo(Collection<Equipo> teamList) {
		this.teamList = teamList;
	}
	
	public Collection<Equipo> getTeamList() {
		return teamList;
	}
	public void setTeamList(Collection<Equipo> teamList) {
		this.teamList = teamList;
	}
	
	

}
