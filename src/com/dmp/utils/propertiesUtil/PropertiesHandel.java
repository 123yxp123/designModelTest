package utils.propertiesUtil;

import java.util.Locale;
import java.util.ResourceBundle;

public class PropertiesHandel {
	private static ResourceBundle localResource = null;
	public static void readProperties(){
		if(localResource==null){
			Locale locale = Locale.getDefault(); 
			//getBundle(String baseName,Locale locale)  指定目录test，文件名称configure，如：test/configure
			localResource = ResourceBundle.getBundle("configure", locale);
		}
	}
	
	public static String  getProperties(){
		String db = localResource.getString("DB");
		System.out.println("getProperties="+db);
		return db;
	}
	
}
