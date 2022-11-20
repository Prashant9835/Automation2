package com.tdc.lms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyCartPage {
WebDriver driver;	
	
	public MyCartPage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(id="Courses")
	WebElement coursesButton;
	
	@FindBy(xpath="//button[text()='All']")
	WebElement allCoursesDesignButton;
	
	@FindBy(xpath="//button[text()='Interior']")
	WebElement interiorDesignButton;
	
	@FindBy(xpath="//button[text()='Fashion']")
	WebElement fashionDesignButton;
	
	@FindBy(xpath="//button[text()='Jewellery']")
	WebElement jewelleryDesignButton;
	
	@FindBy(xpath="//button[text()='Photography']")
	WebElement photographyDesignButton;
	
	@FindBy(xpath="//button[text()='Wedding Decor']")
	WebElement weddingDecorDesignButton;
		
	@FindBy(xpath="//button[text()='Beauty & Make up']")
	WebElement beautynMakeUpDesignButton;
	
	//@FindBy(css=".deskTop-size")
	@FindBy(css=".hgytgr")
	List<WebElement> totalCourses;
	
//	@FindBy(css=".bYlswo")
//	List<WebElement> totalCourses1;
	
	@FindBy(xpath="//div[text()='Checkout']")
	WebElement checkOutButton;
	
	@FindBy(css="input[name='address1']")
	WebElement fillAddress1;
	
	@FindBy(css="input[name='address2']")
	WebElement fillAddress2;
	
	@FindBy(css="select[name='COUNTRY']")
	WebElement staticDropdown1;
	
	@FindBy(css="select[name='rcrs-region']")
	WebElement staticDropdown2;
	
	@FindBy(css="input[name='city']")
	WebElement fillCity;
	
	@FindBy(css="input[name='pincode']")
	WebElement fillPincode;
	
	@FindBy(xpath="//div[text()='Proceed to payment']")
	WebElement paymentButton;
	
	@FindBy(xpath = "//div/button[@class='Snackbar__Button-sc-dpphhk-2 fLclwk']")
	WebElement popUp;
	
	@FindBy(xpath= "//button[@method='card']")
	WebElement cardPayment;
	
	By addToCart = By.cssSelector("button[class*='lib-card-btn']:last-of-type");
//	By viewMore = By.cssSelector(".guIkAX");
//	By addToCart1 = By.cssSelector("..gGMVPb");
	
	public void clickOnCourses() throws InterruptedException {
		//Thread.sleep(25000);
		coursesButton.click();
		Thread.sleep(3000);
	}
	
	public void clickOnAllCourses() throws InterruptedException {
		allCoursesDesignButton.click();
		Thread.sleep(3000);
	}
	
	public void clickOnInteriorDesignCourses() throws InterruptedException {
		interiorDesignButton.click();
		Thread.sleep(3000);
	}
	
	public void clickOnFashionDesignCourses() throws InterruptedException {
		fashionDesignButton.click();
		Thread.sleep(3000);
	}
	
	public void clickOnJewelleryDesignCourses() throws InterruptedException {
		jewelleryDesignButton.click();
		Thread.sleep(3000);
	}
	
	public void clickOnPhotographyDesignCourses() throws InterruptedException {
		photographyDesignButton.click();
		Thread.sleep(3000);
	}
	
	public void clickOnWeddingDecorDesignCourses() throws InterruptedException {
		weddingDecorDesignButton.click();
		Thread.sleep(3000);
	}
	
	public void clickOnBeautynMakeUpDesignCoourses() throws InterruptedException {
		beautynMakeUpDesignButton.click();
		Thread.sleep(3000);
	}
	
	public void checkout() throws InterruptedException {
		checkOutButton.click();
		Thread.sleep(3000);
	}
	
	public void fillBillingAddress1(String address1 , String address2) throws InterruptedException {
		fillAddress1.clear();
		Thread.sleep(3000);
		fillAddress1.sendKeys(address1);
		fillAddress2.clear();
		Thread.sleep(3000);
		fillAddress2.sendKeys(address2);		
	}
	
	public void fillStaticDropdowns(String country , String region) throws InterruptedException {
		staticDropdown1.click();
		Select Dropdown1 = new Select(staticDropdown1);
		Dropdown1.selectByVisibleText(country);
		Thread.sleep(3000);
		
		staticDropdown2.click();
		Select Dropdown2 = new Select(staticDropdown2);
		Dropdown2.selectByVisibleText(region);
		Thread.sleep(3000);		
	}
	
	public void fillBillingAddress2(String city , String pincode) throws InterruptedException {
		fillCity.clear();
		Thread.sleep(3000);
		fillCity.sendKeys(city);
		Thread.sleep(3000);
		fillPincode.clear();
		Thread.sleep(3000);
		fillPincode.sendKeys(pincode);
		Thread.sleep(3000);				
	}
	
	public void clickOnPaymentButton() throws InterruptedException {
		paymentButton.click();
		Thread.sleep(5000);
	}	
	
	public List<WebElement> getCoursesList() {
		return totalCourses;
	}
	
//	public List<WebElement> getCoursesList1() {
//		return totalCourses1;
//	}
	
	public WebElement getCourseByName(String courseName) {
		WebElement course = getCoursesList().stream().filter(courses -> courses.findElement(By.xpath("//h2")).getText().equals(courseName)).findFirst().orElse(null);
		return course;
	}
	
//	public WebElement getCourseByName1(String courseName) {
//		WebElement course = getCoursesList1().stream().filter(courses -> courses.findElement(By.xpath("//*[@id='__next']/div/body/div[5]/div[2]/div/div[1]/div/div/div[2]/div[1]/p[1]")).getText().equals(courseName)).findFirst().orElse(null);
//		return course;
//	}
	
//	public WebElement getCoursesByAuthorName(String authorName) {
//		WebElement allcoursesbyauthor = getCoursesList().stream().filter(coursesbyauthor -> coursesbyauthor.findElement(By.cssSelector(".cgVovu p")).getText().equals(authorName)).findFirst().orElse(null);
//		return allcoursesbyauthor;
//	}
	
//	public void viewMore(String authorName) throws InterruptedException {
//		WebElement courses = getCoursesByAuthorName(authorName);
//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//		 Actions act = new Actions(driver);
//		 act.scrollByAmount(-200, 400);
//		 act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/body/div[5]/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[1]/p")));
//		 Thread.sleep(5000);
//		courses.findElement(viewMore).click();
//	}
	
//	public WebElement getCourseByName1(String courseName) {
//		WebElement course = getCoursesList().stream().filter(courses -> courses.findElement(By.xpath("//h2")).getText().equals(courseName)).findFirst().orElse(course.findElement(By.xpath("//button[@class='right-arrow']")).click());
//		return course;
//	}
	
	public void addCourseToCart(String courseName) throws InterruptedException {
		WebElement course = getCourseByName(courseName);
		course.findElement(addToCart).click();
		Thread.sleep(9500);
	}
	
//	public void addCourseToCart1(String courseName) throws InterruptedException {
//		WebElement course = getCourseByName(courseName);
//		course.findElement(addToCart1).click();
//		Thread.sleep(9500);
//	}
	
	public void closePopUp() {
		popUp.click();
	}
	
	public void cardPayment() {
		driver.switchTo().defaultContent();
	}
}
