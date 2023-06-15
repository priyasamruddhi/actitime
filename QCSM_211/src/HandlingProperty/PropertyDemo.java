package HandlingProperty;

import java.awt.AWTException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties pobj=new Properties();
		pobj.load(fis);
		String url=pobj.getProperty("url");
		String un=pobj.getProperty("username");
		String pwd=pobj.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		
	}
}
