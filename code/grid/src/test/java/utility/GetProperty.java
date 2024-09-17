package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class GetProperty {

	
	public String getProperty(String key) throws Throwable {
		Properties pr=new Properties ();
		String currentDir = System.getProperty("user.dir");
		FileReader reader=new FileReader("config.properties");	
		pr.load(reader);
		String value=pr.getProperty(key);
		return value;
	}
	
}
