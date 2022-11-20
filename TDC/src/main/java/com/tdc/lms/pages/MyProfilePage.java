package com.tdc.lms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage {
	WebDriver driver;
	
	public MyProfilePage(WebDriver driver){
		this.driver = driver;				
	}
			
	@FindBy(xpath="//li[@class='Header__ListData-sc-1gri2dd-12 gJkSCk ListData']/div/img[@class='Header__ImageTag-sc-1gri2dd-1 iqFXzR ImageTag']")
	WebElement profile;
	
	@FindBy(xpath="//div[contains(@style,'border-bottom-left-radius')] //div[@class='item-wrapper'] //a[text()='My Courses']")
	WebElement myCoursesLink;
	
	@FindBy(xpath="//div/div/div/a[text()='Bookmarked Articles']")
	WebElement bookmarkedArticlesLink;
	
	@FindBy(xpath="//div/div/div/a[text()='Bookmarked Blogs']")
	WebElement bookamrkedBlogsLink;
	
	@FindBy(xpath="//div[@class='item-wrapper'] //a[text()='My Profile']")
	WebElement ownProfileLink;
	
	@FindBy(xpath="//div[contains(@style,'border-bottom-left-radius')] //div[@class='item-wrapper'] //a[text()='Account']")
	WebElement accountLink;
	
	@FindBy(xpath="//img[@class='Header__ImageTag-sc-1gri2dd-1 iqFXzR ImageTag']")
	WebElement cartLink;
	
	public void myCourses() throws InterruptedException {
		profile.click();
		Thread.sleep(2000);
		myCoursesLink.click();
		Thread.sleep(2000);
	}
	
	public void bookmarkedArticles() throws InterruptedException {
		profile.click();
		Thread.sleep(2000);
		bookmarkedArticlesLink.click();
		Thread.sleep(2000);
		
	}
		
	public void bookmarkedBlogs() throws InterruptedException {
		profile.click();
		Thread.sleep(2000);
		bookamrkedBlogsLink.click();
		Thread.sleep(2000);
	}
	
	public void ownProfile() throws InterruptedException {
		profile.click();
		Thread.sleep(2000);
		ownProfileLink.click();	
		Thread.sleep(2000);
	}
	
	public void ownAccount() throws InterruptedException {
		profile.click();
		Thread.sleep(2000);
		accountLink.click();
		Thread.sleep(2000);
	}
	
	public void myCart() throws InterruptedException {
		cartLink.click();
		Thread.sleep(2000);
		
	}
	
	
	
	
}
