package Ninja_Project;

import java.util.List;

import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButtton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		
		
		
		List < WebElement> radio = driver.findElements(By.xpath("//input[@type = 'radio']"));
		
		System.out.println("Radio Button Count: " + radio.size());
		
		for (WebElement el:radio)
		{
			System.out.println(el.getText());
		}
		
		//String buttoncount = WebElement.

	}

}
