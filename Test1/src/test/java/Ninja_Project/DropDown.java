package Ninja_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://myudyogaadhar.org/");
		
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("office_state"));
		
		Select dropdown = new Select(element);
		
		//dropdown.selectByVisibleText("BIHAR");
		//dropdown.selectByValue("CHANDIGARH");
		dropdown.selectByIndex(2);
		
		if (dropdown.isMultiple())
				{
					System.out.println("Dropdown is multiple option accesible");
				}
		else
		{
			System.out.println("Dropdown is multiple option not accesible");
		}
		
		List<WebElement> alldropdownoptions = dropdown.getOptions();
		
		
	}

}
