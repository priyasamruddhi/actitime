package Handling_DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TypeofDropDown {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///E:/basicselenium/basic_selenium/select.html");
		WebElement Dropdown=driver.findElement(By.id("rcb"));
		Select s=new Select(Dropdown);
		if(s.isMultiple())
		{
			System.out.println("dropdown is multi select");
		}
		else
		{
			System.out.println("dropdown is multi select");
		}
}}
