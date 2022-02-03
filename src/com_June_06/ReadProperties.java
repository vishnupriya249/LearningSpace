package com_June_06;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("src\\com_June_06\\emp.properties");

		Properties p = new Properties();
		p.load(fis);
		String id = p.getProperty("Eid");
		System.out.println(id);
		System.out.println(p.getProperty("Enm"));
		System.out.println(p.getProperty("Phno"));
		
	}

}
