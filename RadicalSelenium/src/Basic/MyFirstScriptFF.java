package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstScriptFF {
	
	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.seleniumhq.org");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@ id='header']//ul//li[@id='menu_about']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='q']")).sendKeys("abcdefg");
		Thread.sleep(2000);
		
		
		
	}
	

}
