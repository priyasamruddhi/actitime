package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
   driver.findElement(By.linkText("Create new account")).click();
   Thread.sleep(2000);
   //driver.findElement(By.xpath("//div[text()='Gender']"));
  WebElement female= driver.findElement(By.xpath("//label[text()='Female']"));
  WebElement male= driver.findElement(By.xpath("//label[text()='Male']"));
  WebElement custom= driver.findElement(By.xpath("//label[text()='Custom']"));
int f=female.getLocation().getY();
int m=male.getLocation().getY();
int c=custom.getLocation().getY();
if(f==m && m==c)
{
	System.out.println("location of all genders are same");
}
	else
		System.out.println("location of all genders are not same");	
   driver.quit();
	}
}
