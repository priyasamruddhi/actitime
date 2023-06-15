package Handling_MultipleEle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbugattiAutoSuggesion {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Bugatti");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Bugatti']")).click();
		//driver.findElement(By.id("gsr")).click();
		Thread.sleep(1000);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for (WebElement link : allLinks) {
			System.out.println(link.getText());
		}
		//driver.quit();
		

	}

}
