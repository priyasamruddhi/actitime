package Popups;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AClaender_popup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/");
		driver.findElement(By.xpath("//a[text()='Renew']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(Keys.ENTER + "12345");
		//driver.findElement(By.id("dob")).click();
		//driver.findElement(By.xpath("//input[@class='form-control']")).click();
		//driver.findElement(By.id("alternative_number")).click();
		//driver.findElement(By.id("alternative_number")).sendKeys("9876543210");
		Thread.sleep(2000);
	//	driver.findElement(By.id("dob")).click();
	//	driver.findElement(By.xpath("//a[text()='1']")).click();
		
		 WebElement selectAllDays = driver.findElement(By.className("ui-datepicker-month"));
		Select selectDay = new Select(selectAllDays);
        List<WebElement> listDay = selectDay.getOptions();
        for(int i = 0; i<= listDay.size(); i++){
       // selectDay.selectByIndex(i));
        	System.out.println(selectDay.getFirstSelectedOption().getText());
        }
       
        WebElement selectAllYears = driver.findElement(By.className("ui-datepicker-year"));
        Select selectYear = new Select(selectAllYears);
        List<WebElement> listYear = selectYear.getOptions();
        for (int i=0;i<=listYear.size();i++)
        {
        	System.out.println(selectYear.getFirstSelectedOption().getText());
        }
		
		
	}

}