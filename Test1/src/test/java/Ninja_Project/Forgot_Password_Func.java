package Ninja_Project;

import javax.security.auth.kerberos.KeyTab;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forgot_Password_Func {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Workspace\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//ul[@class='list-inline']//li[@class='dropdown']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		
		String forgotpassword_msg = driver.findElement(By.xpath("//div[@class='form-group']//a[normalize-space()='Forgotten Password']")).getText();
		
		System.out.println("Forgot Password Link is Existed: " + forgotpassword_msg);
		
		driver.findElement(By.xpath("//div[@class='form-group']//a[normalize-space()='Forgotten Password']")).click();
		
		String forgotlink = driver.getCurrentUrl();
		
		System.out.println("Forgot Password Title Printed, means link is working: " + forgotlink);
		
		// - -----------------------------------------------------------------------------------------------------------------------
		
		
		// Fill details of login and password using TAB Keyboard Option
		
		driver.findElement(By.id("input-email")).sendKeys("testserver@gmail.com");
		
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys("test@123");
		
		
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		
		driver.switchTo().activeElement().click();
		
		String logintext = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).getText();
		
		System.out.println("Print Page Name: " + logintext);
		
		
	//	--------------------------------------------------------------------------------------------------------------------------------------
		
		// Verify placeholder text is avaialble 
		
		String email_placeholder = driver.findElement(By.id("input-email")).getAttribute("placeholder");
		
		System.out.println("Email Place holder: " + email_placeholder);
		
		String password_placeholder = driver.findElement(By.id("input-password")).getAttribute("placeholder");
		
		System.out.println("Password Place holder: " + password_placeholder);
		
	}

}
