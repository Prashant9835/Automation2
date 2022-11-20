package com.tdc.lms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tdc.lms.pages.MyProfilePage;

public class MyProfilePageObject {
	private MyProfilePage profilePage = null;
	
	public MyProfilePageObject(WebDriver driver) {

		profilePage = PageFactory.initElements(driver, MyProfilePage.class);
	}

	public MyProfilePage getProfilePage() {
		return this.profilePage;
	}	
}
