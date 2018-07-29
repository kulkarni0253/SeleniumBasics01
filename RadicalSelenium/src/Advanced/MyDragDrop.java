package Advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyDragDrop {
	

	@Test
	public  void myDragDrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  System.out.println("Launching Browser");
		  driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		  //Implicit wait for the browser to launch
		  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  //Identifying the elements to perform action 
		  Thread.sleep(4000);
		  WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
		  WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));
		  
		  Actions act = new Actions(driver);
		  act.dragAndDrop(draggable, droppable).build().perform();
		  
		  
		  
		  
		  
		  
		  
//		  Actions myAction = new Actions(driver);
//		  //Performing Drag and Drop operation 
//		  myAction.dragAndDrop(draggable, droppable).perform();
//		  System.out.println("Successfully completed the Drag-Drop operation");
		  
		 }


}
