package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnSendkeys {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.actitime.com/login.do");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("pwd")).sendKeys("manager");
    driver.findElement(By.id("keepLoggedInCheckBox")).click();
   String color= driver.findElement(By.className("atLogoImg")).getCssValue("color");
   System.out.println("color is"+color);
 int Height= driver.findElement(By.id("username")).getSize().getHeight();
 int Width= driver.findElement(By.id("username")).getSize().getWidth();
 int locx= driver.findElement(By.id("username")).getLocation().getX();
 System.out.println("height is"+Height);
 System.out.println("width is"+Width);
 System.out.println("locx is"+locx);
 String tagname= driver.findElement(By.className("atLogoImg")).getTagName();
 System.out.println(tagname);
 String att=driver.findElement(By.linkText("actiTIME Inc.")).getAttribute("href");
 System.out.println(att);
 driver.quit();
	}
}
