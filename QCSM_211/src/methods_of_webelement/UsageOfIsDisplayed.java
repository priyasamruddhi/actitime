package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDisplayed {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement link=driver.findElement(By.linkText("Careers"));
		if(link.isDisplayed())
		{
		System.out.println("career is present in the web page");
		}
		else
		{
			System.out.println("career is not present in the web page");	
		}
		WebElement link1=driver.findElement(By.xpath("//button[@name='login']"));
		if(link1.isEnabled())
		{
		System.out.println("login button  is enabled in the web page");
		}
		else
		{
			System.out.println("login button  is not enabled in the web page");
		}
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement link2=driver.findElement(By.xpath("//label[text()='Female']"));
		if(link2.isSelected())
		{
		System.out.println("Female radio button  is selected in the web page");
		}
		else
		{
			System.out.println("Female radio button  is not selected in the web page");
		}
		driver.quit();
		

}
}