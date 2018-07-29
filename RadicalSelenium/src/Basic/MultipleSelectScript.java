package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleSelectScript {
	
	@Test
	public void testMultiSelect() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		
		WebElement ele = driver.findElement(By.name("cars"));
		Select sel = new Select(ele);
		sel.selectByIndex(0);
		sel.selectByValue("opel");
		sel.selectByVisibleText("Audi");
		
		Thread.sleep(3000);
		sel.deselectByIndex(0);
		Thread.sleep(3000);
		
		List<WebElement> selcars = sel.getAllSelectedOptions();
		
		for (WebElement webElement : selcars) {
			System.out.println("selected Cars = "+webElement.getText());
		}
		
		List<WebElement> allcars = sel.getOptions();
		for (WebElement webElement : allcars) {
			System.out.println("all cars = "+webElement.getText());
		}		
		
	}

}
