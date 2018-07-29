package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyBasicScript {
		@Test
		public void automationtestingreg() throws InterruptedException{
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
			driver.get("http://demo.automationtesting.in/Register.html");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder ='First Name']")).sendKeys("Harshal");
			
			driver.findElement(By.xpath("//div//textarea[@ng-model='Adress']")).sendKeys("Dadar");
			
			driver.findElement(By.xpath("//div//input[@value='Male']")).click();
			
			//driver.findElement(By.xpath("")).click();
			
			boolean userInput = true;
			String Locator = "//input[@id='checkbox1']";
			
			CheckBoxLib checklib = new CheckBoxLib();
			checklib.checkboxtest(driver, userInput, Locator);
			
			//combox - option1
//			driver.findElement(By.xpath("//select[@id='Skills']")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//select[@id='Skills']/option[contains[text(), 'Android'']]")).click();
			
			//combox-option2
			//driver.findElement(By.xpath("//select[@id='Skills']/option[contains[text(), 'Android'']]")).click();
			
			//combox option3
			WebElement element = 	driver.findElement(By.xpath("//select[@id='Skills']"));
			Select obj = new Select(element);
			obj.selectByVisibleText("Android"); 
	
			Select country = new Select(driver.findElement(By.id("countries")));
			List<WebElement> list = country.getOptions();
			System.out.println(" no of countries are ="+list.size()); 
			for(int i = 0 ; i<list.size(); i++){
				System.out.println(list.get(i).getText());
			}
			
			String countrys[] = { "Select Country",
					"Afghanistan",
					"Åland Islands",
					"Albania",
					"Algeria",
					"American Samoa",
					"Andorra",
					"Angola",
					"Anguilla",
					"Antarctica",
					"Antigua and Barbuda",
					"Argentina",
					"Armeni"};
		
				for(int i = 0 ; i<13; i++){
					Assert.assertEquals(countrys[i], list.get(i).getText());
				}
			
				System.out.println("Assert Verification is DONE, countries as expected present in DD");
			
			
			
			
			
			
//			if(c==false){
//				driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
//			}else{
//				System.out.println("This Checkbox is checked already");
//			}
//			
			//div//textarea[@ng-model='Adress']
			//div//input[@value='Male']
			//input[@id='checkbox1']
			//input[@id='checkbox2']
			//input[@id='checkbox3']
			//input[@type='email']
			//input[@type='tel']
			
			
			
			
		
		
	}
		

}
