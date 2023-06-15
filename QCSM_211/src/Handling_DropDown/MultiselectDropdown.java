package Handling_DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdown {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///E:/basicselenium/basic_selenium/select.html");
		WebElement rcbDropdown=driver.findElement(By.id("rcb"));
		Select selectRCB=new Select(rcbDropdown);
		selectRCB.selectByIndex(0);
		selectRCB.selectByValue("s");
		selectRCB.selectByVisibleText("Hasranga");
		selectRCB.deselectByVisibleText("Virat");
		selectRCB.deselectByIndex(4);
		selectRCB.deselectByValue("w");
		//selectRCB.deselectAll();
}
}
