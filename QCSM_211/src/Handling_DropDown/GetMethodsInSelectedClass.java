package Handling_DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetMethodsInSelectedClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///E:/basicselenium/basic_selenium/select.html");
		WebElement rcbDropdown=driver.findElement(By.id("rcb"));
	Select selectRCB=new Select(rcbDropdown);
	selectRCB.selectByIndex(0);
	//Return type of getfirstselectedoption is webelement
	//If we make use of this method for dropdown where no option are selected it will throw NSEE
	WebElement we=selectRCB.getFirstSelectedOption();
	System.out.println(we.getText());
	//Return type of getallselected option is List<WenElement>
	//If we make use of this method for dropdown where no options are selected it will return an empty list
	List<WebElement> alloption=selectRCB.getAllSelectedOptions();
	for(WebElement option:alloption)
	{
		System.out.println(option.getText());
	}
	}
}
