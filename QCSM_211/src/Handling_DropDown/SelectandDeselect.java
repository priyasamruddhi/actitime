package Handling_DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectandDeselect {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///E:/basicselenium/basic_selenium/select.html");
		WebElement cskdropdown=driver.findElement(By.id("csk"));
		Select select=new Select(cskdropdown);
		List<WebElement> alloptions=select.getOptions();
		for( int i=0;i<alloptions.size();i++)
		{
			select.selectByIndex(i);
			Thread.sleep(2000);
		}
		for(int i=alloptions.size()-1;i>0;i--)
		{
			select.deselectByIndex(i);
			Thread.sleep(500);
		}
		
	}
}
