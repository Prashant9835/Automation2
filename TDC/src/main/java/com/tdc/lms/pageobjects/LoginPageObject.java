package com.tdc.lms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tdc.lms.pages.LoginPage;

public class LoginPageObject {
	private LoginPage loginPage = null;
	
	public LoginPageObject(WebDriver driver) {

		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	public LoginPage getLoginPage() {
		return this.loginPage;
	}
}
