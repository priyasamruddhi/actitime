package Handling_MultipleEle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AprintGoogleAutoSuggesion {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> autosuggesion=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		for(int i=0;i<autosuggesion.size();i++)
		{
			WebElement value=autosuggesion.get(i);
			String text=value.getText();
			System.out.println(text);
		}

	}

}
