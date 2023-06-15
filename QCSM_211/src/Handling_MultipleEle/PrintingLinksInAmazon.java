package Handling_MultipleEle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingLinksInAmazon {
static
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	/* List<WebElement> alllinks=driver.findElements(By.tagName("a"));
	 System.out.println(alllinks.size());
	 for(int i=0;i<alllinks.size();i++)
	 {
//		 WebElement link=alllinks.get(i);
//		 String text=link.getText();
//		 System.out.println(text);
		 
		 System.out.println(alllinks.get(i).getText());
	 }
	*/
	List<WebElement> alllinks=driver.findElements(By.xpath("//a"));
	System.out.println(alllinks.size());
	for(WebElement link:alllinks)
	{
		String text=link.getText();
		System.out.println(text);
		
	}
	
}
}
