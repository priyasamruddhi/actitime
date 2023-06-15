package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClick {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText ("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Male']/../input[@type='radio']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Female']/../input[@type='radio']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Custom']/../input[@type='radio']")).click();
	}

}
