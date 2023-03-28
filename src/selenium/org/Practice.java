package selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException, AWTException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();  	
	        driver.get("https://netbanking.hdfcbank.com/netbanking/");
	        List<WebElement> frames = driver.findElements(By.tagName("frameset"));
	        System.out.println("Total No.of Frames:"+frames.size());
	        // switch into frame using id
	       driver.switchTo().frame("login_page");
	        
	  
            
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123");
	        Thread.sleep(4000);
	        
	        Actions a= new Actions(driver);
	      
			Thread.sleep(3000);
			
		//	 pass value using JS instead of send keys
			WebElement clk = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
			a.moveToElement(clk).click().perform();
		//	js.executeScript("arguments[0].click",clk);
			
			WebElement login = driver.findElement(By.xpath("//a[@onclick='return fLogon();']"));
			a.moveToElement(login).click().perform();
			 
	       Thread.sleep(4000);
	        
	        Alert al = driver.switchTo().alert();
	        al.accept();
	       
	       
	        
	        
	        


	}

}
