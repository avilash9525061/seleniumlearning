package FirstMavenProject.Test1;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_XPath_Locator_CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	 // Open web page
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		//Switch to product page
		String currWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currWindowHandle);
		
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		
		// tag[attribute=substring]
		
		driver.findElement(By.cssSelector("button[name$=light]")).click();
		
		
	}

}
