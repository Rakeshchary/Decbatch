package basic.test.util;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args)throws Exception {
		
		String envName = System.getProperty("app.env.name");
		Properties properties = new Properties();
		
		
		//properties.load(new FileInputStream("C:\\Users\\suroj\\workspace\\com.test.basic\\src\\basic\\test\\util\\app.dev.properties"));
		System.out.println("Loading Env :"+envName);
		//class path
		properties.load(PropertiesExample.class.getResourceAsStream("app." +envName+".properties"));
		
		System.out.println(properties);
		System.out.println(properties.get("DBIP"));
		System.out.println(properties.get("LDAP"));
		System.out.println(properties.get("DBUSERNAME"));
		System.out.println(properties.get("DBPASSWORD"));
		
	}

}
