package selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\driver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		  Actions a = new Actions(driver);
		  
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 WebElement first = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[18]/a/div"));
		 a.moveToElement(first).click().perform();
		 TakesScreenshot ts = (TakesScreenshot)driver;
			File  src = ts.getScreenshotAs(OutputType.FILE);
			File f = new File("C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\Screenshot\\amz.png");
			FileUtils.copyFile(src, f);
			
			
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		// WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
		// mail.sendKeys("chithra");
		/// a.doubleClick(mail).perform();
		//  Robot r = new Robot();
		  
    	// r.keyPress(KeyEvent.VK_CONTROL);
    	// r.keyPress(KeyEvent.VK_X);
    	// r.keyRelease(KeyEvent.VK_CONTROL);
    	// r.keyRelease(KeyEvent.VK_X);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	//	 WebElement prime = driver.findElement(By.xpath("//*[@id=\"nav-link-amazonprime\"]/span[1]"));
	//	 a.moveToElement(prime).click().perform();
		// WebElement fast = driver.findElement(By.xpath("//*[@id=\"multiasins-img-link\"]"));
	//	a.doubleClick(fast).perform();
		//      

		 
		 

	}

}
