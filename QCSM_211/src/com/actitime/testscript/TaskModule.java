package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {
	@Test (priority=3)
	//apoch time  from jan 1 1970
	public void deletetask() {
		Reporter.log("delete customer");
	}
	@Test(priority=1,invocationCount=1,enabled=true)
	//@Test(priority=1,invocationCount=1,enabled=true)
	public void createtask()
	{
		Reporter.log("create customer");
	}
	@Test(priority=2)
    public void modifytask()
    {
	Reporter.log("modify customer");
    }

}
