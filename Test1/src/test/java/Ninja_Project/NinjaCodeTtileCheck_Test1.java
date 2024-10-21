package Ninja_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class NinjaCodeTtileCheck_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		String title = driver.getTitle();
		
		//String expected_title = "Your Store1" ; 
		
		//assert title == expected_title;
		
		
		System.out.println(title);
	}

}
