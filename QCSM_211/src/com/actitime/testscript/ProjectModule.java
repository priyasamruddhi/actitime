package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test(priority=1,enabled=true)
	public void createproject()
	{
		Reporter.log("create project");
	}

}
