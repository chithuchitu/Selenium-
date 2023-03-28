package selenium.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		 
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	 // JS Executor
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Thread.sleep(3000);
	WebElement scrlDwn = driver.findElement(By.xpath("//h2[contains(text(),'Java ')]"));
	Thread.sleep(3000);
	js.executeScript("arguments[0].scrollIntoView(true)",scrlDwn);
	Thread.sleep(4000);
	TakesScreenshot ts = (TakesScreenshot)driver;
	File  src = ts.getScreenshotAs(OutputType.FILE);
	File f = new File("C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\Screenshot\\java.png");
	FileUtils.copyFile(src, f);
	
	
	
	
	
	
	
	//WebElement scrlDwn = driver.findElement(By.xpath("(//h2[contains(text(),'Interview ')]"));
	//Thread.sleep(3000);
	//js.executeScript("arguments[0].scrollIntoView(true)",scrlDwn);
	//Thread.sleep(4000);
	
	
	
	
	
	
	
	
	
	//WebElement scrlUp = driver.findElement(By.xpath("//h3[text()='Online Classroom']"));
	//Thread.sleep(3000);
	//js.executeScript("arguments[0].scrollIntoView(false)",scrlUp);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	

}
