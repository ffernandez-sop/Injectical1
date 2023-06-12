package uy.com.injectical.entity;

public class UserGral {
	
	private String 	name;
	private String 	email;
	private String 	codeName;
	private Integer id;
	private String 	lastName;
	
	public UserGral() {}
	public UserGral(String name, String email, String codeName, Integer id, String lastName) {
		this.name 		= name;
		this.email 		= email;
		this.codeName 	= codeName;
		this.id 		= id;
		this.lastName 	= lastName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public Integer getDi() {
		return id;
	}
	public void setDi(Integer di) {
		this.id = di;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
