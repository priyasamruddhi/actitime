package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;
public class CustomerModule
{
	@Test (priority=3)
	//apoch time  from jan 1 1970
	public void deletecustomer() {
		Reporter.log("delete customer");
	}
	@Test(priority=1,invocationCount=1,enabled=true,dependsOnMethods="com.actitime.testscript.ProjectModule.createproject")
	//@Test(priority=1,invocationCount=1,enabled=true)
	public void createcustomer()
	{
		Reporter.log("create customer");
	}
	@Test(priority=2)
    public void modifycustomer()
    {
	Reporter.log("modify customer");
    }
}


