package com.tdc.lms.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

//import com.beust.jcommander.Parameter;
import com.tdc.lms.base.BaseTests;
import com.tdc.lms.pageobjects.LoginPageObject;
import com.tdc.lms.pageobjects.MyCartPageObject;
import com.tdc.lms.pages.LoginPage;
import com.tdc.lms.pages.MyCartPage;

public class MyCartPageTest2 extends BaseTests {

	LoginPage loginPage;
	MyCartPage myCart;
	
	@BeforeClass
	public void launchMyCart() {
		System.out.println("User is already logged in.................");
		loginPage = new LoginPageObject(driver.get()).getLoginPage();
		myCart = new MyCartPageObject(driver.get()).getMyCartPage();		
	}
	
	@Test(priority=0, description = "Valid Login Test scenario")
	public void login() throws InterruptedException, IOException {
		loginPage.launchWebsite();
		loginPage.clickOnLogin();
		loginPage.applicationLogin("gp2008@rediffmail.com","qwerty12345");
		Assert.assertEquals(loginPage.successMessage.getText(),"Logged In Successfully!");		
		loginPage.closePopUp();
		//LoginPage.signOut();
	}
	
	
	@Test(priority=1)
	public void clickCourses() throws InterruptedException {
		myCart.clickOnCourses();			
	//	myCart.getCourseByName(courseName);
	}
	
	
	
	@Test(priority=2)	
	public void courseIteration() {
		myCart.getCoursesList();
	}
	
	@Test(priority=3)
	@Parameters("courseName")
	public void selectCourseByName(String courseName) {
		myCart.getCourseByName(courseName);
	}
	
	@Test(priority=4)
	@Parameters("courseName")
	public void addToCart(String courseName) throws InterruptedException {
		myCart.addCourseToCart(courseName);
	}
	
	@Test(priority=5)
	public void clickOnPopUp() {
		loginPage.closePopUp();
	}
	
	@Test(priority=6)
	public void clickCheckout() throws InterruptedException {
		myCart.checkout();
	}
	
	@Test(priority=7)
	public void fillBillingDetails() throws InterruptedException {
		myCart.fillBillingAddress1("Bharat","India");
		myCart.fillStaticDropdowns("India", "Telangana");
		myCart.fillBillingAddress2("Hyderabad", "500081");
	}
	
	@Test(priority=8)
	public void proceedPayment() throws InterruptedException {
		myCart.clickOnPaymentButton();
	}
	
	
}