package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyIFrame {
	
	@Test
	public void My_IFrame() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.com/iframe-practice-page/");
		Thread.sleep(15000);
		// Iframes details are present in HTML mode only
		
		driver.switchTo().frame("IF2");
				
		driver.findElement(By.xpath("//a[@id='ui-id-2']")).click();
		
		driver.switchTo().defaultContent();

	}
}
