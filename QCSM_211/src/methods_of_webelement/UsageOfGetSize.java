package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		int emailHight=driver.findElement(By.id("email")).getSize().getHeight();
//		System.out.println(emailHight);
//		int emailWidth= driver.findElement(By.id("email")).getSize().getWidth();
//		System.out.println(emailWidth);
//		int passwordHight=driver.findElement(By.id("passContainer")).getSize().getHeight();
//		int passwordWidth= driver.findElement(By.id("passContainer")).getSize().getWidth();
		
		WebElement emailTextField=driver.findElement(By.id("email"));
		WebElement passwordTextField=driver.findElement(By.id("passContainer"));
		int emailHight=emailTextField.getSize().getHeight();
		int emailWidth= emailTextField.getSize().getWidth();
		int passwordHight=passwordTextField.getSize().getHeight();
		int passwordWidth= passwordTextField.getSize().getWidth();
		
		
		if(emailHight==passwordHight && emailWidth==passwordWidth)
		{
			System.out.println("both email and password textbox size are same");
		}
			else
				System.out.println("both email and password textbox size  not are same");
			
		
		driver.quit();
		
		
	}

}
