package Dev;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettingtitle 
{

	public static void main(String[] args) throws NoAlertPresentException, InterruptedException 
	{
		{
		//  System.out.println("djfjfdjfg");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			String baseUrl = "https://www.facebook.com";
			driver.get(baseUrl);
			
			// System.out.println("Page title is : " + driver.getTitle());
			
//			WebElement username = driver.findElement(By.name("email"));
//			WebElement password = driver.findElement(By.name("pass"));
//			username.sendKeys("killernaree@gmail.com");
//			password.sendKeys("kkillerr");
//			WebElement login = driver.findElement(By.name("login")); 
//			
//			login.click();
//			Thread.sleep(5000);
//			
//			// Getting Title 
//			
			String title = driver.getTitle();
			System.out.println("Title: " +title);
			
			if(title.equals("Facebook � log in or sign up"))
				System.out.println("Pass");
			else
				System.out.println("Fail");
			
		}
	}
}

//getPageSource - Assignment 