package com.CRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;

public class HomePageTestCase {
  @Test(priority=1)
  public void verifyUrl() {
	  
	  HomePage hp=new HomePage();
	  String actUrl=hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"),"Test Fail:Url Not Matched");
	  System.out.println("Test Pass:Url Matched!");
  }
  
  @Test(priority=2)
  public void verifyTitle()
  {
	  String actTitle=hp.getTitle();
	  Assert.assertTrue(actTitle.contains("Customer"),"Test Fail:Title Not Matched");
	  System.out.println("Test Pass:Title Matched!");
  }
  @Test(priority=3)
  public void validateSignInLink()
  {
	  String nextPageUrl=hp.getStatusofLink();
	  Assert.assertTrue(nextPageUrl.contains("login"),"Test Fail:Login Page not Open");
	  System.out.println("Test Pass:Application Navigating to Login Page");
}
