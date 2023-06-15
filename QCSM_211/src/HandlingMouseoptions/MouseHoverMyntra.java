package HandlingMouseoptions;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverMyntra {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	     WebElement parent= driver.findElement(By.className("desktop-navLinks"));
	List<WebElement> navmenu = parent.findElements(By.className("desktop-navContent"));
	Actions action = new Actions(driver);
	for(WebElement target:navmenu)
	{
		action.moveToElement(target).pause(2000).build().perform();
	}
	}
}
