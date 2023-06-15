package Handling_MultipleEle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingNavigation {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		List<WebElement> navlink=driver.findElements(By.className("desktop-main"));
		for(int i=0;i<navlink.size();i++)
		{
			WebElement link= navlink.get(i);
			System.out.println(link.getText());
			
		}
			
		
	}
}
