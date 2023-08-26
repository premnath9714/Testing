import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Readconfigurationdata {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Properties prop=new Properties();
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\config.properties");

		prop.load(file);
		
		System.out.println(prop.getProperty("Url"));
		
		System.out.println(prop.getProperty("browser"));
		
		System.out.println(prop.getProperty("username"));
		
		System.out.println(prop.getProperty("password"));
		
		
	}

}
