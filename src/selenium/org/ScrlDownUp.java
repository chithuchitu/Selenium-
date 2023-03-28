package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrlDownUp {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get(" http://toolsqa.com/");
	//		driver.manage().window().maximize();
			//JS Executor
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
		    //Scroll Down
			WebElement scrlDwn = driver.findElement(By.xpath("//a[text()='Latest Articles']"));

			js.executeScript("arguments[0].scrollIntoView(true)",scrlDwn);
			 Thread.sleep(4000);
		
		
		
		
 
	}

}
