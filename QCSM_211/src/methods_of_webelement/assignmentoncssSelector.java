package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentoncssSelector {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.actitime.com/login.do");
    String color=driver.findElement(By.linkText("Login")).getCssValue("color");
    System.out.println(color);
    String fontfamily=driver.findElement(By.linkText("Login")).getCssValue("font-family");
    System.out.println(fontfamily);
    driver.quit();
}
}
