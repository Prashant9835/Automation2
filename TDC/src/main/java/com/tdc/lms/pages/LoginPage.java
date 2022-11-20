package com.tdc.lms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	WebDriver driver;	
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath = "//div/ul/li/h5[text()='Login']")
	WebElement loginButton;
	
	@FindBy(xpath = "//input[@placeholder='Email Address ']")
	WebElement userName;
	
	@FindBy(xpath = "(//input[@placeholder='Password'])[1]")
	WebElement password;
	
	@FindBy(xpath ="//div[@class='new-login-style__BtnDiv-sc-h1irvq-11 gVSCJW']/button")
	WebElement submit;
	
	@FindBy(xpath = "//div/button[@class='Snackbar__Button-sc-dpphhk-2 fLclwk']")
	WebElement popUp;
	
	@FindBy(xpath = "//p[text()='Logged In Successfully!']")
	public WebElement successMessage;
	
	@FindBy(xpath="//p[text()='There is no user record corresponding to this identifier. The user may have been deleted. (auth/user-not-found).']")
 	public WebElement errorMessage;
	
	@FindBy(xpath="//li[@class='Header__ListData-sc-1gri2dd-12 gJkSCk ListData']/div/img[@class='Header__ImageTag-sc-1gri2dd-1 iqFXzR ImageTag']")
	public WebElement profile;
	
	@FindBy(xpath="//div[@class='item-wrapper']/div/a[text()='Sign Out']")
	WebElement logOut;
	
		
	public void applicationLogin(String email,String passcode) throws InterruptedException {
		userName.clear();
		password.clear();
		userName.sendKeys(email);
		password.sendKeys(passcode);
		submit.click();
		Thread.sleep(3000);			
	}
	
	public void closePopUp() {
		popUp.click();
	}
	
	public void launchWebsite() {
		driver.get("https://thedesignersclass.com/");
	}
	
	public void signOut() throws InterruptedException {
		profile.click();
		Thread.sleep(3000);
		logOut.click();
	}
			
	public void clickOnLogin() {
		loginButton.click();
	}

}
