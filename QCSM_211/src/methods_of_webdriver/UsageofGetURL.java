package methods_of_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetURL {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		String expectedURL="https://accounts.google.com/";
		String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		if(actualURL.contains(expectedURL))
		{
			System.out.println("pass");
		}
			else
			{
				System.out.println("fail");
		}

	}
}
