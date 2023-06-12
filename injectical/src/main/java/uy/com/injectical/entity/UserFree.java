package uy.com.injectical.entity;


import java.util.Collection;

public class UserFree extends UserGral implements UserService{

	private Collection<Banners> baners;
	
	public UserFree() {super();}
	public UserFree(String name, String email, String codeName, Integer id, String lastName) {
		super(name, email, codeName, id, lastName);
	}

	@Override public Integer getUserRol() {return ROL_USER_FREE;}

	
	public Collection<Banners> getBaners() {
		return baners;
	}
	public void setBaners(Collection<Banners> baners) {
		this.baners = baners;
	}

	
}
