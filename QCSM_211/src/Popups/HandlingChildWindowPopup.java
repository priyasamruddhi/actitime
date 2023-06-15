package Popups;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindowPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("login-google-button")).click();
	String parentid = driver.getWindowHandle();
	Set<String> allwh = driver.getWindowHandles();
	
	for(String op:allwh) {
		System.out.println(op);
		System.out.println("parent id:"+ parentid);
	}
}
}
