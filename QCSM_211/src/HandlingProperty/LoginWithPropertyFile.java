package HandlingProperty;

import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithPropertyFile {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties pobj=new Properties();
		pobj.load(fis);
		String url=pobj.getProperty("url");
		String un=pobj.getProperty("username");
		String pwd=pobj.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}
}
