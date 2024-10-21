package Ninja_Project;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinksValidity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		driver.get("http://www.deadlinkcity.com/");
		
		List <WebElement> Linklist = driver.findElements(By.tagName("a"));
		
		for(WebElement element:Linklist)
		{
			String url = element.getAttribute("href");
			
			try {
				URL urllink = new URL(url);
			}
			
			catch(MalformedURLException e)
			{
				
			}
		}
		
		
		
		
		
		

	}

}
