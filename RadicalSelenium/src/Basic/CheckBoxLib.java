package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CheckBoxLib {
	// below by : put : /** + press Enter
	/**
	 * 
	 * @param driver
	 * @param userInput
	 * @param Locator
	 */
	@Test
	public void checkboxtest(WebDriver driver, boolean userInput, String Locator){
		
		boolean currentstate = driver.findElement(By.xpath(Locator)).isSelected();
		
		if(userInput){
			if(currentstate == true){
				System.out.println("Already Checked");
			}else{
				driver.findElement(By.xpath(Locator)).click();
			}
			
		}
		
		if(!userInput){
			if(currentstate == true){
				driver.findElement(By.xpath(Locator)).click();
			}else{
				System.out.println("Already Unchecked");
			}
		}
		
				
		
	}

}
