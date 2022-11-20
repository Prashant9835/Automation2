package com.tdc.lms.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tdc.lms.base.BaseTests;
import com.tdc.lms.pageobjects.LoginPageObject;
import com.tdc.lms.pageobjects.MyCartPageObject;
import com.tdc.lms.pages.LoginPage;
import com.tdc.lms.pages.MyCartPage;

public class MyCartPageTest extends BaseTests {

	LoginPage loginPage;
	MyCartPage myCart;
	
	@BeforeClass
	public void launchMyCart() {
		System.out.println("User is already logged in.................");
		loginPage = new LoginPageObject(driver.get()).getLoginPage();
		myCart = new MyCartPageObject(driver.get()).getMyCartPage();		
	}
	
//	@Test(priority=0, description = "Valid Login Test scenario")
//	public void login() throws InterruptedException, IOException {
//		loginPage.launchWebsite();
//		loginPage.clickOnLogin();
//		loginPage.applicationLogin("gp2008@rediffmail.com","qwerty12345");
//		Assert.assertEquals(loginPage.successMessage.getText(),"Logged In Successfully!");		
//		loginPage.closePopUp();
//		//LoginPage.signOut();
//	}
	
	@Test(priority=1)
	public void clickCourses() throws InterruptedException {
		myCart.clickOnCourses();
	}
	
	@Test(priority=2)
	public void clickInterior() throws InterruptedException {
		myCart.clickOnInteriorDesignCourses();
	}
	
	@Test(priority=3)
	public void courseIteration() {
		myCart.getCoursesList();
	}
	
	@Test(priority=4)
	public void selectCourseByName() {
		myCart.getCourseByName("RESIDENTIAL DESIGN");
	}
	
	@Test(priority=5)
	public void addToCart() throws InterruptedException {
		myCart.addCourseToCart("RESIDENTIAL DESIGN");
	}
	
	@Test(priority=6)
	public void clickOnPopUp() {
		loginPage.closePopUp();
	}
	
	@Test(priority=7)
	public void clickCheckout() throws InterruptedException {
		myCart.checkout();
	}
	
	@Test(priority=8)
	public void fillBillingDetails() throws InterruptedException {
		myCart.fillBillingAddress1("Bharat","India");
		myCart.fillStaticDropdowns("India", "Telangana");
		myCart.fillBillingAddress2("Hyderabad", "500081");
	}
	
	@Test(priority=9)
	public void proceedPayment() throws InterruptedException {
		myCart.clickOnPaymentButton();
	}
	
	
}
