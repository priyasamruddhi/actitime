package HandlingMouseoptions;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMousedemo {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
	WebElement target = driver.findElement(By.linkText("Resources"));
	WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"));
	Actions actions = new Actions(driver);
	//make use of build while performing composite action
	actions.moveToElement(target).pause(2000).click(link).build().perform();
	//String details = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/..//p[2]")).getText();
	//String details = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]")).getText();
	String details = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/..")).getText();
	System.out.println(details);
	}
}
