package uy.com.injectical.entity;

public class Detalles {
	
	private Integer id;
	private String name;
	
	public Detalles() {}
	public Detalles(Integer id, String name) {
		this.id = id;
		this.name = name;
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
	

}
