package Popups;
import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingFileUploadPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("‪file:///E:/basicselenium/basic_selenium/Resume.html");
	    Thread.sleep(2000);
	    driver.findElement(By.tagName("button")).click();
	    File file=new File("./data/Resume.html");
	    String path=file.getAbsolutePath();
	    System.out.println(path);
	    //Set<String> allWh = driver.getWindowHandles();
	    driver.findElement(By.id("cv")).sendKeys(path);
	}
}
