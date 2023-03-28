package selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day10_Q11 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Actions a = new Actions(driver);
		Robot r = new Robot();
	    WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Hp Laptop");
	    r.keyPress(KeyEvent.VK_TAB);
	    r.keyRelease(KeyEvent.VK_TAB);
	    r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
      	Thread.sleep(3000);
      	WebElement product = driver.findElement(By.xpath("(//div[contains(text(),'HP Core i3 11th Gen ')])[1]"));
 		a.click(product).click().perform();
		Thread.sleep(3000);
	    Set<String> allId = driver.getWindowHandles();
        List<String> l = new LinkedList<>();
        l.addAll(allId);
        driver.switchTo().window(l.get(1));
        driver.getCurrentUrl();
        System.out.println("Success");
        WebElement cost = driver.findElement(By.xpath("(//div[text()='₹37,990'])[1]"));
        System.out.println("The Cost of laptops is :" +cost.getText());
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
