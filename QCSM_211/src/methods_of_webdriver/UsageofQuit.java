package methods_of_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofQuit {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	}
	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.quit();
	}

	}
