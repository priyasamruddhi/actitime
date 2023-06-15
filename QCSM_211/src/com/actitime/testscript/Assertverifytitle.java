package com.actitime.testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertverifytitle {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	@Test
	public void verifytitle()
	{
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String expectedresult = "Google";
		String actualresult = driver.getTitle();
		//if else block not haning the power to fail test cases
		/*if(actualresult.equals(expectedresult))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		} */
		Assert.assertEquals(actualresult, expectedresult);
		driver.quit();
		
	}

}
