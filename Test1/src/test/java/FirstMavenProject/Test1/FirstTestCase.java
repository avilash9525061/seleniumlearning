package FirstMavenProject.Test1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Workspace\\Drivers\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        
        // Capture title of webpage and print
        String title = driver.getTitle();
        System.out.println("Page Title:" + title);
        
        // Capture Url of webpage
        
        System.out.println("URL:" + driver.getCurrentUrl());
        
        //Capture page source
        
        //System.out.println("Page Source:" + driver.getPageSource());
       
        
        //close browser
        
        driver.close();


	}

}
