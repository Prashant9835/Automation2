package com.tdc.lms.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tdc.lms.base.BaseTests;
import com.tdc.lms.pageobjects.LoginPageObject;
import com.tdc.lms.pages.LoginPage;

public class LoginPageTest extends BaseTests {
	LoginPage loginPage;
	
	@BeforeClass
	public void launchLoginPage() {
		loginPage = new LoginPageObject(driver.get()).getLoginPage();		
		loginPage.launchWebsite();
		loginPage.clickOnLogin();
	}
	
	@Test(priority=0, description = "Invalid login Test scenario with invalid Email")
	public void invalidEmail() throws InterruptedException, IOException {
		loginPage.applicationLogin("gp20@rediffmail.com","qwerty12345");
		Assert.assertEquals(loginPage.errorMessage.getText(),"There is no user record corresponding to this identifier.The user may have been deleted. (auth/user-not-found).");
	}
	
	@Test(priority=1, description = "Valid Login Test scenario")
	public void login() throws InterruptedException, IOException {
		loginPage.applicationLogin("gp2008@rediffmail.com","qwerty12345");
		Assert.assertEquals(loginPage.successMessage.getText(),"Logged In Successfully!");		
		loginPage.closePopUp();
		//LoginPage.signOut();
	}	
	
	
  }