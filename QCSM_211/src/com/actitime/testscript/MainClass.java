package com.actitime.testscript;

import java.io.IOException;

public class MainClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException { 
		// TODO Auto-generated method stub

		FileLib fl=new FileLib();
		String data = fl.readPropertyData("username");
		System.out.println(data);
	}

}
