package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfWebElements {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).clear();
		Thread.sleep(2000);
		String login=driver.findElement(By.name("login")).toString();
		 System.out.println("login text is:"+login);
		 String tag= driver.findElement(By.xpath("//img[@alt='Facebook']")).getTagName();
		 System.out.println("tag name of alt attribute is:"+tag);
		 String att=driver.findElement(By.linkText("Forgotten password?")).getAttribute("href");
		 System.out.println("name of the attribute is:"+att);
		 driver.quit();
	}

}
