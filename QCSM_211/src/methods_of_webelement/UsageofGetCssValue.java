package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetCssValue {
static
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String coloroflink=driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
	System.out.println(coloroflink);
	String coloroflink1=driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
	System.out.println(coloroflink1);
	String coloroflink2=driver.findElement(By.linkText("Forgotten password?")).getCssValue("cursor");
	System.out.println(coloroflink2);
	String heading=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getCssValue("font-family");
	System.out.println(heading);
	driver.quit();
	
}
}