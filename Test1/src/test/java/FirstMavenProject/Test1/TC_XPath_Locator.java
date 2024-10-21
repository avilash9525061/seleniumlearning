package FirstMavenProject.Test1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class TC_XPath_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Eclipse Workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		
		String title = driver.getTitle();
	    System.out.println("Page Title:" + title);
	    
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		
		//Switch to product page
		String currWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currWindowHandle);
		
		//									
		//driver.findElement(By.linkText(List<A>ce Labs Bolt T-Shirt")).click();
		List <WebElement> elementlist = (List<WebElement>) driver.findElements(By.partialLinkText("Sauce"));
		
		System.out.println("Element Size:" + elementlist.size());
		
		
	}

}
