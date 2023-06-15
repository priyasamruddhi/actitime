package methods_of_webdriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsageofPositionandSize {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	}
	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Point point=new Point(0,0);
		driver.manage().window().setPosition(point);
		Dimension d=new Dimension(600,700);
		driver.manage().window().setSize(d);
		System.out.println(d);
				
	}

}
