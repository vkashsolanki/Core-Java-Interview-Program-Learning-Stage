package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
	
	
	
	
	public static String readProperty(String key)
	{
		try {
		Properties properties = new Properties();
		
		InputStream inputStream	= new FileInputStream(System.getProperty("user.dir")+"\\resources\\"+"db.properties"); 
		
		properties.load(inputStream);
		return (String) properties.get(key);

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return key;
		
	}
	
	

}
