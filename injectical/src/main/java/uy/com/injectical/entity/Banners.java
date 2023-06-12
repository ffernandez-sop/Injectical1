package uy.com.injectical.entity;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.DatatypeConverter;

public class Banners {
	
	private Integer idBaners;
	private	String name;
	private String img;
	
	public Banners() {}
	public Banners(Integer idBaners, String name, String img) {
		super();
		this.idBaners = idBaners;
		this.name = name;
		this.img = img;
	}
	
	public String encode(String paths) throws IOException {
		return  DatatypeConverter.printBase64Binary(Files.readAllBytes(Paths.get(paths)));
	}
	
	public Integer getIdBaners() {
		return idBaners;
	}
	public void setIdBaners(Integer idBaners) {
		this.idBaners = idBaners;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
}
