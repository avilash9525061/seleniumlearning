package Ninja_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Eclipse Workspace\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/upload-download");
		
		
		
		
		//driver.findElement(By.xpath("//input[@id = 'uploadFile']")).sendKeys("C:\\Users\\admin\\Desktop\\story.txt");
		WebElement button = driver.findElement(By.xpath("//input[@id = 'uploadFile']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		
		act.moveToElement(button).click().perform();
		

	}

}
