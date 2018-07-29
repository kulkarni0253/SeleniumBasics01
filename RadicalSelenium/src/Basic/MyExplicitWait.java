package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyExplicitWait {
	
	@Test
	public void test(){
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.google.com/");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebDriverWait  obj = new WebDriverWait(driver, 30);
	
	WebElement myEle = obj.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='lst-ibx']")));
	
//	WebElement myEle = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='lst-ib']")));
	
	// which-ever time is greater that will be considered for execution
	
	myEle.sendKeys("I'm still waiting ;-)");
	
	
	}
	

}
