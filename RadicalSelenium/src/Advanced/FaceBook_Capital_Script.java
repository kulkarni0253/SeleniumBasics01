package Advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FaceBook_Capital_Script {
	
	@Test
	public void CapitalLetters(){
		
		//more than one action, build required ; if one operation, directly perform can be used.
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		
		WebElement emailTxtBox = driver.findElement(By.id("email"));
		Actions myAction=new Actions(driver);
		
		
		Actions obj = myAction.moveToElement(emailTxtBox)
				.click()
		        .keyDown(emailTxtBox,Keys.SHIFT)
		           .sendKeys("harshal");
		
		obj.build().perform();
		
		
		
	}

}
