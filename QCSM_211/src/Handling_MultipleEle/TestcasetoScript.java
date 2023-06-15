package Handling_MultipleEle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestcasetoScript {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("https://demo.actitime.com/login.do");
		 if(wait.until(ExpectedConditions.titleIs("actiTIME - Login")))
		 {
			 System.out.println("login page title is correct upon verification");
			 if(wait.until(ExpectedConditions.urlToBe("https://demo.actitime.com/login.do")))
			 {
				 System.out.println("login page url is correct upon verification");
				 System.out.println("login page  is displayed");
				 WebElement usernameTextField=driver.findElement(By.id("username"));
				 usernameTextField.clear();
				 usernameTextField.sendKeys("admin");
				 WebElement passwordTextField=driver.findElement(By.name("pwd"));
				 passwordTextField.clear();
				 passwordTextField.sendKeys("manager");
				 WebElement loginButton=driver.findElement(By.id("loginButton"));
				 loginButton.click();
				 if(wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track")))
				 {
					 System.out.println("home page title is correct upon verification");
					 if(wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track")))
					 {
						 System.out.println("home page title is correct upon verification");
				 }
			 }
		 }
{
	
}

}
