package HandlingMouseoptions;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraAssignment {
	//write a script to mouse over am Men dropdown menu present in myntra.com and in Men section click on T-shirt.
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		 WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
	//driver.findElement(By.xpath("//picture[@class='img-responsive']/../.."));
		//Actions action = new Actions(driver);
		//action.moveToElement(men).pause(1000).build().perform();
			
	     WebElement parent= driver.findElement(By.className("desktop-navLinks"));
 WebElement navmenu = parent.findElement(By.className("desktop-navContent"));
	Actions action = new Actions(driver);

		action.moveToElement((WebElement) navmenu).pause(2000).build().perform();
		driver.findElement(By.linkText("T-shirts")).click();
	}
	
	}
	

