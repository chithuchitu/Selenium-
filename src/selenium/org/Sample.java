package selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

 
		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			 Actions a = new Actions(driver);
			 Robot r = new Robot();
			 driver.get("http://greenstech.in/selenium-course-content.html");
			 driver.manage().window().maximize();
			 WebElement first = driver.findElement(By.xpath("(//h2[contains(text(),'Selenium ')])[3]"));
			 first.click();
			 WebElement second = driver.findElement(By.xpath("//*[@id=\"collapse303\"]/div/div/ul/li[6]/a"));
			 a.contextClick(second).perform();
			 Thread.sleep(3000);
			 for (int i = 0; i < 6; i++) 
			 {
			 r.keyPress(KeyEvent.VK_DOWN);
			 r.keyRelease(KeyEvent.VK_DOWN);
						}
		      r.keyPress(KeyEvent.VK_ENTER);
		      r.keyRelease(KeyEvent.VK_ENTER);
		   
			 
			 
			 

	}

}
