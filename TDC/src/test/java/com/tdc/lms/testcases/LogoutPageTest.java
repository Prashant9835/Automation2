package com.tdc.lms.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tdc.lms.base.BaseTests;
import com.tdc.lms.pageobjects.LogoutPageObject;
import com.tdc.lms.pages.LogoutPage;

public class LogoutPageTest extends BaseTests{
	LogoutPage logoutPage;
	//LoginPage loginPage;
	
	@BeforeClass
	public void launchLogoutPage() {
		//loginPage = new LoginPageObject(driver.get()).getLoginPage();
		logoutPage = new LogoutPageObject(driver.get()).getLogoutPage();		

	}
	
	@Test(priority=2)
	public void logOut() throws InterruptedException {
		logoutPage.signOut();
	}

}
