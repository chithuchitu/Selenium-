package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Executor {

	public static void main(String[] args) throws InterruptedException {
		 
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	
		 // JS Executor
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		Thread.sleep(3000);
		
		// pass value using JS instead of send keys
		WebElement username = driver.findElement(By.name("username"));
		js.executeScript("arguments[0].setAttribute('value','chithra')",username);
		
		 // instead of get attribute
		Object s = js.executeScript("return arguments[0].getAttribute('value, args)",username);
		System.out.println(s);
		
		
		
		
		
		
		

	}

}
