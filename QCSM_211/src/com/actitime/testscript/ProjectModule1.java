package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectModule1 {
	@BeforeMethod
	public void before()
	{
	System.out.println("before execution");
	}
	@AfterTest
	public void after()
	{
		System.out.println("after all test method execution");
	}
	@Test (priority=3)
	//apoch time  from jan 1 1970
	public void deleteproject() {
		Reporter.log("delete customer");
	}
	@Test(priority=1,invocationCount=1,enabled=true)
	//@Test(priority=1,invocationCount=1,enabled=true)
	public void createproject()
	{
		Reporter.log("create customer");
	}
	@Test(priority=2)
    public void modifyproject()
    {
	Reporter.log("modify customer");
    }

}
