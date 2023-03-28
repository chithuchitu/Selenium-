package selenium.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class Day8_Q1 {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 Thread.sleep(2000);
         driver.get("https://bazaar.shopclues.com/");
         driver.manage().window().maximize();
		 WebElement prod = driver.findElement(By.id("autocomplete"));
		prod.sendKeys("Iphone");
		WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));
		search.click();
		Thread.sleep(4000);
		WebElement pro = driver.findElement(By.xpath("//h2[contains(text(),'Apple Iphone 6 64 Gb')]"));
		pro.click();
		// to fetch parent window
		String parentId = driver.getWindowHandle();
		 System.out.println(parentId);
		 Set<String> allId = driver.getWindowHandles();
		 System.out.println(allId);
		 for  (String eachId : allId) {
			 driver.switchTo().window(eachId);
			 if(!parentId.equals(eachId))
			 {
				 System.out.println("Successfully switched");
			 }
			  Thread.sleep(2000);
			 WebElement cart = driver.findElement(By.xpath("//button[text()='Add To Cart']"));
			 cart.click();
			
		}
		
		
		 
	}

}
