package com.tdc.lms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tdc.lms.pages.LogoutPage;

public class LogoutPageObject {
	private LogoutPage logoutPage = null;
	
	public LogoutPageObject(WebDriver driver) {

		logoutPage = PageFactory.initElements(driver, LogoutPage.class);
	}

	public LogoutPage getLogoutPage() {
		return this.logoutPage;
	}
}
