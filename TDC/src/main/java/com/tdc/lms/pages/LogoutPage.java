package com.tdc.lms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LogoutPage {
	WebDriver driver;	
	
	public LogoutPage(WebDriver driver){
		this.driver = driver;
	}
	
	
	@FindBy(xpath="//li[@class='Header__ListData-sc-1gri2dd-12 gJkSCk ListData']/div/img[@class='Header__ImageTag-sc-1gri2dd-1 iqFXzR ImageTag']")
	WebElement profile;
	
	@FindBy(xpath="//div[@class='item-wrapper']/div/a[text()='Sign Out']")
	WebElement logOut;
		
	public void signOut() throws InterruptedException {
		profile.click();
		Thread.sleep(3000);
		logOut.click();
	}
			

}
