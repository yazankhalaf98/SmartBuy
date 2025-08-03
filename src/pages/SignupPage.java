package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
	
	 WebDriver driver;
	    Random rand = new Random(); 

	    public SignupPage(WebDriver thedriver) {
	        this.driver = thedriver;
	    }
	    

	    
	    By firstname = By.id("customer[first_name]");
	    By lastname = By.id("customer[last_name]");
	    By email = By.id("customer[email]");
	    By Password = By.id("customer[password]");
	    
	    
	    public void  Fillform(  String f, String l , String mail ,  String password) { 
	    	
	    	driver.findElement(firstname).sendKeys(f);
	        driver.findElement(lastname).sendKeys(l);
	        driver.findElement(email).sendKeys(mail);
	        driver.findElement(Password).sendKeys(password);
	    	
	    	
	    	
	    }


}

		
