package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlinhNotificationPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.myntra.com/");
	driver.findElement(By.className("desktop-searchBar")).sendKeys("highlander" + Keys.ENTER);
	driver.navigate().to("https://www.makemytrip.com/");
	
	
	
	}
}
