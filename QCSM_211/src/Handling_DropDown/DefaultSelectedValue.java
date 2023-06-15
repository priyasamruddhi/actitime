package Handling_DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DefaultSelectedValue {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/signup");
		 WebElement day=driver.findElement(By.id("day"));
		 Select dayoption=new Select(day);
		 System.out.println(dayoption.getFirstSelectedOption().getText());
		 
		 WebElement month=driver.findElement(By.id("month"));
		 Select monthoption=new Select(month);
		 System.out.println(monthoption.getFirstSelectedOption().getText());
		 
		 WebElement year=driver.findElement(By.id("year"));
		 Select yearoption=new Select(year);
		 System.out.println(yearoption.getFirstSelectedOption().getText());
		
	}
}
