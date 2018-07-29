package Advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyAttachment {
	
	@Test
	public void test() throws InterruptedException, AWTException {

		//ctrl+shift+F -- to make some part of code more presentable.
		// input -- attribute > type ==== directly file name can be given
		// CANNOT MINIMISE THE PROJECT, WHILE EXECUTION AS CTRL+V CAN HAPPEN ANYWHERE

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	//	driver.manage().window().maximize();

		driver.get("http://www.freefileconvert.com/");

		driver.findElement(By.id("first_file")).click();
		Thread.sleep(5000);
		StringSelection ss = new StringSelection("C:\\Users\\HarshalKulkarni\\Desktop\\harshal.txt");
		// upload your file using RobotClass
		// attach your path where file is located.
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		Thread.sleep(6000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		// driver.findElement(By.id("first_file")).sendKeys("C:\\Users\\HarshalKulkarni\\Desktop\\harshal.txt");

		// driver.findElement(By.xpath("//input[@id = 'first_file']")).click();

	}

}
