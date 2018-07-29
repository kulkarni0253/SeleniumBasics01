package Basic;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindow {
	
	@Test
	public void test(){
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	//driver.manage().window().maximize();
		
	driver.get("https://www.wiziq.com/tutorial/810773-selenium-presentation-updated#");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//span[text()='Login with Facebook']")).click();
	
	String BaseWin = driver.getWindowHandle();
	Set<String> allwin = driver.getWindowHandles();
	
	String Childwin = null;
	
	for (String win : allwin) {
		
		if(!win.equals(BaseWin)){
			Childwin = win;
		}
		
	}
	
	System.out.println("ChildWin: "+Childwin);
	
	driver.switchTo().window(Childwin);
	
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("kulkarni.h.k.28@gmail.com");
	
	//driver.quit();
	
	
	
	}

}
