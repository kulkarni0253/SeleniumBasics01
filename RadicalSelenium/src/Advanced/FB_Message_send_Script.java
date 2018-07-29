package Advanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FB_Message_send_Script {
	
	@Test
	public void test4() throws InterruptedException{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\chromedriver_win32_B39\\chromedriver.exe");
		  WebDriver driver =new ChromeDriver(options);
		
//		FirefoxOptions options = new FirefoxOptions();
//		options.addArguments("--disable-notifications");
//		
//		FirefoxProfile ffprofile = new FirefoxProfile();
//		ffprofile.setPreference("dom.webnotifications.enabled", false);
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\geckodriver-v0.18.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver(ffprofile);
		  driver.manage().window().maximize();
//		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8655794327");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("kulkarnisvjti@5");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys("Harshal Kulkarni");
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _4w98 _4jy3 _517h _51sy _4w97']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Harshal Kulkarni')]")).click();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//li[@data-id='100022511921704']//div[@class='_55lr']")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div/a/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'See All in Messenger')]")).click();
	Thread.sleep(5000);
	
	Set<String> allwin = driver.getWindowHandles();
	System.out.println(allwin);
//	driver.findElement(By.xpath(".//*[@id='js_4m']")).click();
//	Thread.sleep(9000);
//	driver.findElement(By.xpath(".//*[@id='js_98']/div/div/table/tbody/tr[5]/td[6]/div/div")).click();
//	Thread.sleep(9000);
//	driver.findElement(By.xpath(".//*[@id='js_18g']")).click();
//	
	
	
	
	
	
//   driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div/div/div[2]/span/div[2]/div[2]/div[2]/div[1]/div/div[1]/div/div[1]/div/div/div/div/div/div")).sendKeys("aare kahi");
//	
//	driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/div/div/div[2]/span/div[2]/div[2]/div[2]/div[1]/div/div[1]/div/div[1]/div/div/div/div/div/div")).sendKeys("HI");
//	WebElement text = driver.findElement(By.xpath("//div[@data-offset-key='d8035-0-0']//div[@class='_1mf _1mj']"));
//	Thread.sleep(4000);
//	text.sendKeys("Kiti mehnatt lagle mahit aahe tula message send karayla..hushhh");
	
	
		Thread.sleep(10000);
		
		driver.quit();
		
		
//		Alert alert = driver.switchTo().alert();
//		driver.switchTo().alert();
//		alert.dismiss();
//		
	}

}
