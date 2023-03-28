package selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\driver\\chromedriver.exe");
			
			 WebDriver driver = new ChromeDriver();
			  Actions a = new Actions(driver);
			  Robot r = new Robot();
			  
			  
			 driver.get("https://www.snapdeal.com/");
			 driver.manage().window().maximize();
			 Thread.sleep(3000);
			 WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Bhawna ')]"));
			 a.contextClick(text).click().perform();
			 r.keyPress(KeyEvent.VK_DOWN);
			 r.keyRelease(KeyEvent.VK_DOWN);
			 r.keyPress(KeyEvent.VK_DOWN);
			 r.keyRelease(KeyEvent.VK_DOWN);
						
	          r.keyPress(KeyEvent.VK_ENTER);
	          r.keyRelease(KeyEvent.VK_ENTER);
	   
		 

		}
}
