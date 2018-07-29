package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class MyFirstScriptIE {

		@Test
		public void test1() throws InterruptedException{
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\IEDriverServer_x64_3.12.0\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			
			driver.get("https://www.seleniumhq.org");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//li[@id='menu_projects']/a")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath(".//*[@id='q']")).sendKeys("abcdefg");
			Thread.sleep(2000);
			}

	}


