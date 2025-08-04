package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SignupPage;
import utils.DriverFactory;
import utils.TestData;
import utils.TestDataGenerator;

public class UserTests {
	
	
WebDriver driver;
SignupPage signupPage;
String firstName;
String lastName;
String email ;
String password ;
;

	
	
	   @BeforeTest
	    public void setup() {
	        driver = DriverFactory.getDriver();
	        driver.get("https://smartbuy-me.com/ar/account/register");
	        signupPage = new SignupPage(driver);
	    }
	   
	   
	   @Test(priority = 1)
	    public void testSignup() throws InterruptedException {
		   
		   JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollTo(0,150)");
	        firstName = TestData.getRandomFirstName();
	        lastName = TestData.getRandomLastName();
	
	         email = TestData.getEmail(firstName, lastName);
	         password = TestData.getRandomPass();

	        signupPage.Fillform(firstName, lastName, email, password);
	      
	        driver. findElement(By.xpath("//button[@class='form__submit button button--primary button--full']")).click();
	    }
	   
	  @Test(priority = 2)
	   public void LoginPage() throws InterruptedException
	  
	   
	   {
		   Thread.sleep(2000);
	        driver.get("https://smartbuy-me.com/ar/account/login");
			 
			   JavascriptExecutor js = (JavascriptExecutor) driver;

				js.executeScript("window.scrollTo(0,200)");
				  Thread.sleep(2000);

		   driver.findElement(By.id("customer[email]")).sendKeys(email);
		   driver.findElement(By.id("customer[password]")).sendKeys(password);
			  Thread.sleep(2000);

			  driver.findElement(By.cssSelector(".form__submit.button.button--primary.button--full")).click();
		  
		

	   }
		   
	  @AfterTest
	    public void teardown() {
	        DriverFactory.quitDriver();
	    }  
		   
	   }




	    