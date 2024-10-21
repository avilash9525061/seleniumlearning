package Ninja_Project;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_User_Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Eclipse Workspace\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
	    //driver.manage().timeouts().implicitlyWait(TimeUnit.SECONDS,20);
		Thread.sleep(3000);
		
		
		String currWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currWindowHandle);
		
		//driver.findElement(By.cssSelector("div#top-links.list-inline.dropdown")).click();
		
		driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("input-firstname")).sendKeys("Pradeep");
		driver.findElement(By.id("input-lastname")).sendKeys("Kumar");
		
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys(''.join(random.choices(string.ascii_lowercase + string.digits, k=8)) + "@example.com");
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("testserver1@example.com");
		
		driver.findElement(By.id("input-telephone")).sendKeys("7501603756");
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		driver.findElement(By.id("input-confirm")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@type='checkbox' and @name = 'agree']")).click();
		
		
		driver.findElement(By.cssSelector("input.btn")).click();
		
		

		
	}

}
