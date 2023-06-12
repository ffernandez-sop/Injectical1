package uy.com.injectical.entity;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.DatatypeConverter;

public class Prueba {

	public static void main(String[] args) throws IOException {
		String imgDS = DatatypeConverter.printBase64Binary(Files.readAllBytes(Paths.get("C:\\Users\\fabio\\Pictures\\Saved Pictures\\BAT.jpg")));
		System.out.print(imgDS);
	}

}
