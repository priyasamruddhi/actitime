package Handling_DropDown;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class selectAllDropDownLis {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://www.facebook.com/signup");
        WebElement selectAllDays = driver.findElement(By.id("day"));
        Select selectDay = new Select(selectAllDays);
        List<WebElement> listDay = selectDay.getOptions();
        for(int i = 0; i<= listDay.size(); i++){
            selectDay.selectByIndex(i);
        }
        WebElement selectAllMonths = driver.findElement(By.id("month"));
        Select selectMonth = new Select(selectAllMonths);
        List<WebElement> listMonth = selectMonth.getOptions();
        for(int i = 0; i<= listMonth.size(); i++){
            selectMonth.selectByIndex(i);
        }
        WebElement selectAllYears = driver.findElement(By.id("year"));
        Select selectYear = new Select(selectAllYears);
        List<WebElement> listYear = selectYear.getOptions();
        for (int i=0;i<=listYear.size();i++)
        {
            selectYear.selectByIndex(i);
        }
    }

}
