package Handling_MultipleEle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AFlipkartItemNameandPrice {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> phonename=driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]"));
		List<WebElement> phoneprice= driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]/../../div[2]/div[1]/div[1]/div[1]"));
		for(int i=0;i<phonename.size();i++)
		{
			String phonenametext=phonename.get(i).getText();
			String phonenameprice=phoneprice.get(i).getText();
			System.out.println(phonenametext+"=======>"+phonenameprice);
					
		}
	}

}
