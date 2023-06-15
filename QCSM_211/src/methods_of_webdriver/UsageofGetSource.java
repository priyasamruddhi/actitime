package methods_of_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetSource {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		String pgSrc=driver.getPageSource();
		System.out.println(pgSrc);
		String pgtt=driver.getTitle();
		System.out.println(pgtt);
		String pgurl=driver.getCurrentUrl();
		System.out.println(pgurl);
		String pgwh=driver.getWindowHandle();
		System.out.println(pgwh);
		
	}

}
