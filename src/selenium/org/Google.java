package selenium.org;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {

	
		public static void main(String[] args) throws AWTException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			 Actions a = new Actions(driver);
			 Robot r = new Robot();
			driver.get("https://www.google.co.in/webhp");
			driver.manage().window().maximize();
		
			WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
			search.sendKeys("velmurugan");
			a.doubleClick(search).perform();
			     r.keyPress(KeyEvent.VK_CONTROL);
			     r.keyPress(KeyEvent.VK_X);
			     r.keyRelease(KeyEvent.VK_CONTROL);
			     r.keyRelease(KeyEvent.VK_X);
			    
			     

	}

}
