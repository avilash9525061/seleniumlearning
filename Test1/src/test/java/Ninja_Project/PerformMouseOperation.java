package Ninja_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformMouseOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
//		WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
//		
//		Actions act = new Actions(driver);
//		
//		act.contextClick(button).build().perform();
		
//		-------------------------------------------------
		//Double Click
		
		WebElement button = driver.findElement(By.xpath("//button[@id ='doubleClickBtn']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(button).build().perform();
	}

}
