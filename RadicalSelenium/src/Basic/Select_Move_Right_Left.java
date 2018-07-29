package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Select_Move_Right_Left {
	
	@Test
	public void select_move() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demos.telerik.com/aspnet-ajax/listbox/examples/overview/defaultvb.aspx");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[contains(text(),'Canada')]")).click();
		
		driver.findElement(By.xpath("//button[@title='To Right']")).click();
		
		driver.findElement(By.xpath("//li[contains(text(),'China')]")).click();
		
		driver.findElement(By.xpath("//button[@title='To Right']")).click();
		
		// below XPATH is NOT selecting INDIA country as expected, tried with different XPATHs as well, still the issue exists, XPATH has ONE node only
		
	driver.findElement(By.xpath("//li[contains(text(),'India')]")).click();
		
		driver.findElement(By.xpath("//button[@title='To Right']")).click();
	}

}
