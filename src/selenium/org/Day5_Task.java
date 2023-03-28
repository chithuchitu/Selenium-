package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5_Task {

	public static void main(String[] args) {

  System.setProperty("webdriver.chrome.driver","C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium\\src\\Driver\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
      
      driver.get("http://demo.guru99.com/test/drag_drop.html");		
      driver.manage().window().maximize();
    
	//  drag.  bank   		
    	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
     
     //  drop.		
     WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
     		
     //Using Action 		
     Actions act=new Actions(driver);					

   //Drag and drop.		
     act.dragAndDrop(From, To).build().perform();
     
      WebElement from1 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
      
      WebElement to1 = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
       Actions a = new Actions(driver);
       a.dragAndDrop(from1, to1).build().perform();
        
       // drag and drop sales
        WebElement saldrag = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
        WebElement saldrop = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
        Actions a1 = new Actions(driver);
        a1.dragAndDrop(saldrag, saldrop).build().perform();
        
        // drag and drop sales amt
        WebElement amtdrag = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
        WebElement amtdrop = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
        Actions a2 = new Actions(driver);
        a2.dragAndDrop(amtdrag, amtdrop).build().perform();
        
        
       
      
     
    
    
    
    
    
    
    
    
    
    
	}

}
