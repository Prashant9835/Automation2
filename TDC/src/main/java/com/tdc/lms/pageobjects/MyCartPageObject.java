package com.tdc.lms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tdc.lms.pages.MyCartPage;

public class MyCartPageObject {
private MyCartPage myCartPage = null;
	
	public MyCartPageObject(WebDriver driver) {

		myCartPage = PageFactory.initElements(driver, MyCartPage.class);
	}

	public MyCartPage getMyCartPage() {
		return this.myCartPage;
	}
}
