package selenium.org;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hdfc {
	static Alert al;
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\driver");
			  driver = new ChromeDriver();  	
	        driver.get("https://netbanking.hdfcbank.com/netbanking/");
	        List<WebElement> frames = driver.findElements(By.tagName("frameset"));
	        System.out.println("Total No.of Frames:"+frames.size());
	        // switch into frame using id
	          driver.switchTo().frame("login_page");
	        
	  
          
	        Actions a= new Actions(driver);
	      
			Thread.sleep(3000);
			
		//	 pass value using JS instead of send keys
			WebElement clk = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
			a.moveToElement(clk).click().perform();
		 
	       Thread.sleep(4000);


	         driver.switchTo().alert();
	        String s = al.getText();
	        System.out.println(s);
	        al.accept();
	       
	       
	        
	        
	        


	}

}
