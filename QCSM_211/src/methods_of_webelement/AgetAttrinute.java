package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgetAttrinute {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.actitime.com/login.do");
    driver.findElement(By.id("keepLoggedInCheckBox")).click();
    WebElement link=driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']"));
    String s= link.getAttribute("for");
    System.out.println("check box is clicked and name of the check box is:"+s);
    
	}

}
