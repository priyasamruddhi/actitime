package Handling_MultipleEle;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionToMultipleElement {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("D://html/demo.html");
     List<WebElement> alllinks= driver.findElements(By.tagName("a"));
     // System.out.println(alllinks);
     int count=alllinks.size();
     System.out.println(count);
     for(int i=0;i<count;i++)
     {
     WebElement link=alllinks.get(i);
     String text=link.getText();
     System.out.println(text);
     }

}
}