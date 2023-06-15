package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLocation {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextField=driver.findElement(By.id("email"));
		WebElement passwordTextField=driver.findElement(By.id("passContainer"));
		int emailHight=emailTextField.getSize().getHeight();
		int emailWidth= emailTextField.getSize().getWidth();
		int passwordHight=passwordTextField.getSize().getHeight();
		int passwordWidth= passwordTextField.getSize().getWidth();
		int emailloc=emailTextField.getLocation().getX();
		int passwordloc=passwordTextField.getLocation().getX();
		if(emailloc==passwordloc && emailWidth==passwordWidth)
		{
			System.out.println("both email and password textbox location are same");
		}
			else
				System.out.println("both email and password textbox location  not are same");
		driver.quit();
	}
}
