package selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 

public class Day10_Q1 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\driver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
	 	 
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		 Thread.sleep(3000);
		 search.sendKeys("iphone");
		 WebElement srch = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		 srch.click();
		 Thread.sleep(2000);
		WebElement prod = driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (128GB) - Purple']"));
		Actions a= new Actions(driver);
		Robot robot = new Robot();
		a.moveToElement(prod).contextClick().perform();
	   robot.keyPress(KeyEvent.VK_DOWN);
  	   robot.keyRelease(KeyEvent.VK_DOWN);
  	   robot.keyPress(KeyEvent.VK_DOWN);
  	   robot.keyRelease(KeyEvent.VK_DOWN);
  	   robot.keyPress(KeyEvent.VK_ENTER);
  	   robot.keyRelease(KeyEvent.VK_ENTER);
		String parentId = driver.getWindowHandle();
		 System.out.println(parentId);
		 Set<String> allId = driver.getWindowHandles();
		 System.out.println(allId);
		 		 
		 for  (String eachId : allId) {
			 driver.switchTo().window(eachId);
			 			 if(!parentId.equals(eachId))
			 {
				 System.out.println("switched");
			 }
		}
		
		 Thread.sleep(3000);			  
         WebElement cart = driver.findElement(By.xpath("//input[@type='button']"));
         cart.click();
          WebElement cost = driver.findElement(By.xpath("(//span[text()='49,900'])[5]"));
         System.out.println(cost.getText());
         
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
