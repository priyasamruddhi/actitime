package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfTagName {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement link=driver.findElement(By.id("pass"));
		
		String s=link.getTagName();
		System.out.println(s);
		
	}
}
