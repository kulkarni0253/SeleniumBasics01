package Basic;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstScriptChrome {
	
//	@Test
//	public void test1() throws InterruptedException{
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\chromedriver_win32_B39\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.seleniumhq.org");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//div[@ id='header']//ul//li[@id='menu_about']")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("q")).sendKeys("abcdefg");
//		Thread.sleep(2000);
//		}
//	@Test
//	public void test2() throws InterruptedException{
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\chromedriver_win32_B39\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.seleniumhq.org");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//div[@ id='header']//ul//li[@id='menu_about']")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("q")).sendKeys("dkdhfkdjk");
//		Thread.sleep(2000);
//		
//	}
	
	@Test
	public void test3() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumhq.org");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//div[@ id='header']//ul//li[@id='menu_about']")).click();
//		Thread.sleep(2000);
		
		boolean result = true;
		String msg = null;
		try{
			driver.findElement(By.xpath("//div[@ id='header']//ul//li[@id='menu_about']"));
		}catch(Exception E){
			result = false;
			msg = " about tab is  missing   ";
		}
		
		Thread.sleep(2000);
		try{
			driver.findElement(By.xpath("//a[@title='Selenium Projects']1"));
		}catch(Exception E){
			result = false;
			msg = msg +  "   Projects is Missing  ";
		}
			Assert.assertTrue(result, msg);
	}


}
