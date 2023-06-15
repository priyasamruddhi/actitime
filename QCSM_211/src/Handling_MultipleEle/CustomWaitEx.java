package Handling_MultipleEle;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWaitEx {
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
		 driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		 int i=0;
		 //while(i<2000)
		 for(;;)
			 try
		 {
				 driver.findElement(By.id("logoutLink")).click();
				 break;
		 }catch(NoSuchElementException e)
		 {
			 i++;
		 }

	System.out.println(i);
}
}
