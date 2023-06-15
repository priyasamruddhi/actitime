package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.partialLinkText("Cancel")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	driver.switchTo().alert().dismiss();
	}
}
