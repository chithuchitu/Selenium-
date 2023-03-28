package selenium.org;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adacitin {
	
	
	

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://adactinhotelapp.com/");
	    driver.findElement(By.name("username")).sendKeys("Shahishahii");
	    driver.findElement(By.name("password")).sendKeys("Shahi@123");
	    WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
	    login.click();
	    Thread.sleep(3000);
	    WebElement room1 = driver.findElement(By.name("adult_room"));
        Select s = new Select(room1);
        s.selectByIndex(2);
	    System.out.println("\n No. of options available in Adult Room type");
	    System.out.println("========================");
	    // To fetch all options
	    List<WebElement> option = s.getOptions();
	   
	    for (int i = 0; i < option.size(); i++) {
	    	 
	    		WebElement op = option.get(i);
	    		System.out.println(op.getText());
	    		
				
			}
			
	
	    }
	    
	}


