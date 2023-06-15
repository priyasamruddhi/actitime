package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfCopyPasteUsingKeys {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    WebElement emailtextfield=driver.findElement(By.id("email"));
	    emailtextfield.sendKeys("abc@gmail.com");
	    Thread.sleep(2000);
	    emailtextfield.sendKeys(Keys.CONTROL+"a");
	    Thread.sleep(2000);
	    emailtextfield.sendKeys(Keys.CONTROL+"c");
	    driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"V");
	    driver.quit();
	    
	}

}
