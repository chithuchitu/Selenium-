package selenium.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {

	 

		public static void main(String[] args) throws InterruptedException {
			   System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();  		
				driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
			    
				WebElement username = driver.findElement(By.xpath(" //input[@title='Login using User ID and password']"));
			    Thread.sleep(3000);
				username.sendKeys("chithra");
			     username.click();
			     Thread.sleep(4000);
			     driver.findElement(By.xpath("//input[@value='Login']")).click();
			     
			   
				
				Alert al = driver.switchTo().alert();
				 Thread.sleep(5000);
				al.accept();
				
				
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
				
			  //a[text()='CONTINUE']
			    
			    
			    
			    
			//	JavascriptExecutor js = (JavascriptExecutor)driver;
				//WebElement button = driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
				//js.executeScript("arguments[0].click",button);
			//	Thread.sleep(2000);
			//	WebElement login = driver.findElement(By.xpath("//input[@title='Login']"));
			//	js.executeScript("arguments[0].click",login);
				 
			//	Alert al = driver.switchTo().alert();
			   // al.accept();
				

	}

}
