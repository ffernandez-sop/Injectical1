package uy.com.injectical.entity;

public class UserAdmin extends UserGral implements UserService{
	
	private final String prefix = "adm_";
	
	public UserAdmin() {super();}
	public UserAdmin(String name, String email, String codeName, Integer id, String lastName) {
		super(name, email, codeName, id, lastName);
	}
	
	@Override public Integer getUserRol() {return ROL_USER_ADM;}
	
	public String getPrefix() {
		return prefix;
	}
	
	
}
