package Handling_MultipleEle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadingTime {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	//driver.get("https://www.facebook.com/");//load within 2 seconds.
	//driver.get("https://www.myntra.com/");//load within 5 seconds.
	//driver.get("https://www.ajio.com/");//load within 10 seconds.
	//driver.get("https://www.wikipedia.com/");//load within 5 seconds.
	driver.get("https://www.jiocinema.com/");//load within 5 seconds.
	driver.quit();
	}
}
