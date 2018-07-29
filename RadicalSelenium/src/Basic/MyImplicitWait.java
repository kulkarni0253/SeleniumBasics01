package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyImplicitWait {
	
	@Test
	public void test(){
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.google.com/");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("i'm waiting");
	
	System.out.println("Script Running");
	
	
	}
}
