package com.CRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseClass{
	
	@BeforeClass
	public void pageSetUp()
	{
		hp.getStatusOfLink();
	}
	
	
  @Test
  public void validateLogin() {
	  
	  String Url=lp.doLogin("test@gmail.com","test123");
	  Assert.assertTrue(Url.contains("customers"),"Test Fail:Login Fail");
	  System.out.println("Test Pass:Login Completed");
  }
}
