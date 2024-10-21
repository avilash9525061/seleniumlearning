package Ninja_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Element;

public class LoginCode_withCorrectinput {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String currWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currWindowHandle);
		
		//driver.findElement(By.cssSelector("div#top-links.list-inline.dropdown")).click();
		
		driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("testserver@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@123");
		
		driver.findElement(By.cssSelector("input[value=Login]")).click();

		
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		
		//----------------------------------------------------------------------------------------------------
		
		// User Login with Invalid Credential	
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("testpradeep@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@123");
		
		driver.findElement(By.cssSelector("input[value=Login]")).click();
		
		String output_element = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		
		System.out.println(output_element);
		
		//----------------------------------------------------------------------------------------------------
		
		// Verify Login without username and password, error message should appear
		
		driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
		
		driver.findElement(By.cssSelector("input[value=Login]")).click();
		
		
		String output_element1 = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		
		System.out.println(output_element1);
		
	}

}
