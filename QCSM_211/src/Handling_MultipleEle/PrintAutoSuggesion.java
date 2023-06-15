package Handling_MultipleEle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggesion {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> suggesion=driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		for(WebElement list:suggesion)
		{
			String text=list.getText();
			System.out.println(text);
		}
		driver.quit();
		

}
}