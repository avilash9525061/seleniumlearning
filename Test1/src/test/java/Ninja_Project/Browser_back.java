package Ninja_Project;
import java.io.File;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;



public class Browser_back {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space() = 'Login']")).click();

		
		
		
		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("testserver@gmail.com");
//		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("test@123");
//		
//		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.back();
		
		
		
		//------------------------------------------------------------------------------
		// Copy text of password field
//		driver .findElement(By.xpath("//input[@id = 'input-email']")).sendKeys(Keys.CONTROL, "C");
//		
//		driver .findElement(By.xpath("//input[@id = 'input-password']")).sendKeys(Keys.CONTROL, "C");
		
		
		// -------------------------------------------------------------------------------------------------------
		// Verify Change new password functionality
		
//		Thread.sleep(2000);
//	
//		driver.findElement(By.xpath("//a[normalize-space() = 'Change your password']")).click();
//		
//		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("test@1234");
//		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("test@1234");
//		
//		driver.findElement(By.xpath("//input[@value = 'Continue']")).click();
//		
//		Thread.sleep(4000);
//		
//		driver.findElement(By.xpath("//a[@title='My Account']")).click();
//		
//		driver.findElement(By.xpath("//a[normalize-space() = 'Logout']")).click();
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//a[@title='My Account']")).click();
//		
//		driver.findElement(By.xpath("//a[normalize-space() = 'Login']")).click();
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("testserver@gmail.com");
//		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("test@123");
//		
//		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
//		
		
		//-----------------------------------------------------------------------------------------------------------------------------------------------
		// Verify Browser Close & Reopen functionality
		
//		Thread.sleep(3000);
//		
//		File cookie = new File("cookies.data");
//		saveCookies(driver, cookie);
//		
//		driver.quit();
//		
//		
//	
//		driver.get("https://tutorialsninja.com/demo/");
//		driver.manage().window().maximize();
//		
//		
//		
//		}
//
//	private static void saveCookies(WebDriver driver, File cookie) {
//		// TODO Auto-generated method stub
		
		
		
		//----------------------------------------------
		// List Webpage all elements
		
		List<WebElement> list = driver.findElements(By.xpath("//*"));
		
		System.out.println(list.size());
		
		for(WebElement el:list)
		{
			System.out.println(el.getText());
		}
			
		
		
	}

}
