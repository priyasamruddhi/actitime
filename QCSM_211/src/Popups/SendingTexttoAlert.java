package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingTexttoAlert {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demo.automationtesting.in/Alerts.html");
	Thread.sleep(2000);
	//driver.findElement(By.linkText("Alert with Textbox ")).click();
	driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().sendKeys("hello");
	String s = driver.switchTo().alert().getText();
	System.out.println(s);
	String msg = driver.findElement(By.id("demo1")).getText();
    System.out.println(msg);
	
	}
}
