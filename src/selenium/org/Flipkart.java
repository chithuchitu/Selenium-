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

public class Flipkart {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		Robot r = new Robot();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement cancel = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		cancel.click();
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("iphones");
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\KEERTHI\\eclipse-workspace\\Selenium_Training\\Screenshot\\flp.png");
		FileUtils.copyFile(src, f);

		// r.keyPress(KeyEvent.VK_TAB);
		// r.keyRelease(KeyEvent.VK_TAB);
		// r.keyPress(KeyEvent.VK_ENTER);
		// r.keyRelease(KeyEvent.VK_ENTER);
		// Thread.sleep(3000);
		// WebElement product = driver.findElement(By.xpath("//a[text()='MILTON AQUA
		// 1000 950 ml Bottle']"));
		// a.contextClick(product).click().perform();
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		// r.keyPress(KeyEvent.VK_ENTER);
		// r.keyRelease(KeyEvent.VK_ENTER);

	}

}
