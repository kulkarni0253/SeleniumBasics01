package Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyAlertandConfirmation { 
	@Test
	public void AlertChcek() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		
		//Alert-Code
		
		Alert obj = driver.switchTo().alert();
		String s = obj.getText();
		Assert.assertEquals(s, "I am an alert box!");
		obj.accept();
		
		//a[contains(text(),'Alert with OK & Cancel')]
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[text()= 'click the button to display a confirm box ']")).click();
		
		Thread.sleep(4000);
		Alert obj1 = driver.switchTo().alert();
		String s1 = obj1.getText();
		Assert.assertEquals(s1, "Press a Button !");
		
		obj.dismiss();
		
		
		
		
		
	}

}
