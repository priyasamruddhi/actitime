package Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfExplicitWait {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.id("loginButton")).click();
	    wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
		System.out.println(driver.getTitle());
		driver.findElement(By.id("logoutLink")).click();
		//It will search both html and webpage
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		//It will search only in html page
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logoutLink")));
		System.out.println(wait.until(ExpectedConditions.urlContains("https://demo.actitime.com")));
		
	}
}
