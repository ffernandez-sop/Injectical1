package uy.com.ijectical.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	private static ReadPropertyFile instance;
	
	private ReadPropertyFile() {}
	
	public static ReadPropertyFile getInstance() {
		if(instance == null) instance = new ReadPropertyFile();
		return instance;
	}
	
	public String getProperty(String name) throws IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\fabio\\git\\Injectical1\\injectical\\config.properties"));
		return prop.getProperty(name);
	}

}
