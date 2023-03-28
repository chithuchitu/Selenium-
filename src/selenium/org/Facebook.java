package selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 Actions a = new Actions(driver);
		 Robot r = new Robot();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("chithra");
		a.doubleClick(email).perform();
	     r.keyPress(KeyEvent.VK_CONTROL);
	     r.keyPress(KeyEvent.VK_X);
	     r.keyRelease(KeyEvent.VK_CONTROL);
	     r.keyRelease(KeyEvent.VK_X);
	     r.keyPress(KeyEvent.VK_TAB);
	     r.keyRelease(KeyEvent.VK_TAB);
	     r.keyPress(KeyEvent.VK_CONTROL);
	     r.keyPress(KeyEvent.VK_V);
	     r.keyRelease(KeyEvent.VK_CONTROL);
	     r.keyRelease(KeyEvent.VK_V);
	     
	      
	     

	}

}
