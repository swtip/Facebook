package FileUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	static FileInputStream fin;
	static Properties prop;
	public static String getProperty (String key)
	{
		String value=null;
		
			try {
				fin=new FileInputStream("Input/ObjecRepositery.Properties");
				prop=new Properties();
					prop.load(fin);
					value=prop.getProperty(key);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return value;
		
		
	}

}
