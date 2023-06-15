package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClear {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("abc@gmail.com");
	}
}
