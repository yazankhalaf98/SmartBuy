package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SignupPage;
import utils.DriverFactory;
import utils.TestDataGenerator;

public class UserTests {
	
	
WebDriver driver;
SignupPage signupPage;
String firstName;
String username;
String password = "Test@1234";

	
	
	   @BeforeTest
	    public void setup() {
	        driver = DriverFactory.getDriver();
	        driver.get("https://smartbuy-me.com/ar/account/register");
	        signupPage = new SignupPage(driver);
	    }
	   
	   
	   @Test(priority = 1)
	    public void testSignup() throws InterruptedException {
	        firstName = TestDataGenerator.getRandomFirstName();
	        String lastName = TestDataGenerator.getRandomLastName();
	        username = TestDataGenerator.getRandomUsername(firstName, lastName);
	        String email = TestDataGenerator.getEmail(firstName, lastName);

	        signupPage.Fillform(firstName, lastName, email, password);
	      
	        driver. findElement(By.xpath("//button[@class='form__submit button button--primary button--full']")).click();
	    }
	   
	  @Test(priority = 2)
	   public void Login() throws InterruptedException
	  
	   
	   {
		   Thread.sleep(3000);
		   
		   driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--23554635530550__header\"]/section/header/div/div/div[2]/div[3]/div/a[2]")) .click();
		   
		   Thread.sleep(2000);
		   WebElement logout= driver.findElement(By.cssSelector(".card__linklist-item.link"));
		   logout.click();
		   Thread.sleep(2000);
		   driver.findElement(By.className("Vtl-Button__Text")).click();
		

	   }
		   
		   
		   
	   }




	    