package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenDivisionPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
	}
}
