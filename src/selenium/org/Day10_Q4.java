package selenium.org;

import java.awt.AWTException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_Q4 {
	
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\driver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
	 		  
		 driver.get("http://greenstech.in/selenium-course-content.html");
		 driver.manage().window().maximize();
		 WebElement sel = driver.findElement(By.xpath("(//h2[contains(text(),'Test ')])[2]"));
		 sel.click();
		 Thread.sleep(2000);
		 WebElement day = driver.findElement(By.xpath("//*[@id=\"collapse303\"]/div/div/ul/li[10]/a"));
		 day.click();
		 Set<String> allId = driver.getWindowHandles();
         List<String> l = new LinkedList<>();
         l.addAll(allId);
         driver.switchTo().window(l.get(1));
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
	
	
	

}
