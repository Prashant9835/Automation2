package com.tdc.lms.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import com.beust.jcommander.Parameters;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTests {
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
			
	@BeforeTest(alwaysRun = true)
	@Parameters({"browserName"})
	public void initializeDriver(String browserName ) throws IOException  {
		
		//properties class
	//	Properties prop = new Properties();                              
	//	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\tdc\\\\lms\\resources\\GlobalData.properties");
	//	prop.load(fis);
	//	String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver.set(new EdgeDriver());
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver.set(new InternetExplorerDriver());
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
		}
		else if(browserName.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			driver.set(new SafariDriver());
		}
		
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get().manage().window().maximize();
	}
	
	//@AfterSuite  	  	  	 			 	
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.get().quit();
	}	  	 	

}