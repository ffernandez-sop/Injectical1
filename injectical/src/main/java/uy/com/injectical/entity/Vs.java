package uy.com.injectical.entity;

public class Vs extends Evento{
	
	private Equipo team1;
	private Equipo team2;
	private	String result_team1; 
	private String result_team2;
	
	public Vs() {}
	public Vs(Equipo team1, Equipo team2, String result_team1, String result_team2) {
		this.team1 			= team1;
		this.team2 			= team2;
		this.result_team1 	= result_team1;
		this.result_team2 	= result_team2;
	}
	
	public Equipo getTeam1() {
		return team1;
	}
	public void setTeam1(Equipo team1) {
		this.team1 = team1;
	}
	public Equipo getTeam2() {
		return team2;
	}
	public void setTeam2(Equipo team2) {
		this.team2 = team2;
	}
	public String getResult_team1() {
		return result_team1;
	}
	public void setResult_team1(String result_team1) {
		this.result_team1 = result_team1;
	}
	public String getResult_team2() {
		return result_team2;
	}
	public void setResult_team2(String result_team2) {
		this.result_team2 = result_team2;
	}
	
	
}
