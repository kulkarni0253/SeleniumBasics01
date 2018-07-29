package Advanced;

import java.awt.AWTException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class MyDownload {
	
	@Test
	public void test() throws InterruptedException, AWTException {

		//ctrl+shift+F -- to make some part of code more presentable.

		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		
		 FirefoxProfile fprofile = new FirefoxProfile();//Create object of FirefoxProfile  to access Its properties.
		  fprofile.setPreference("browser.download.dir", "C:\\XYZ");//Set Location to store files after downloading.
		  fprofile.setPreference("browser.download.folderList", 2);//Set Preference to not show file download confirmation dialogue using  types Of different file extension types.
		  
		  fprofile.setPreference("browser.helperApps.neverAsk.saveToDisk", 
		    "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;"//types Of MS Excel File.
		    + "application/pdf;" //types Of PDF File.
		    + "application/vnd.openxmlformats-officedocument.wordprocessingml.document;" //types Of MS doc File.
		    + "text/plain;" //types Of text File.
		    + "text/csv"); //types Of CSV File.
		  fprofile.setPreference( "browser.download.manager.showWhenStarting", false );
		  fprofile.setPreference( "pdfjs.disabled", true );
		  
		  cap.setCapability(FirefoxDriver.PROFILE, fprofile);
		  //cap.setCapability("marionette", true);
		  WebDriver driver = new FirefoxDriver(cap);  //Pass fprofile parameter In webdriver to use preferences to download file.
	
	//	driver.manage().window().maximize();

		driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
		//  driver.get("http://mip-sit-web.azurewebsites.net/ReportViewer/ViewReport?reportPath=%2FNationalGrid.MipReports%2FReport%20Explorer%2FEntry%20Capacity%20-%20Daily%20Reports%2FAfter%20Day%2FEntry%20Capacity%20Availability%20Report%20(NORD07)&gasDate=2018-06-18&filterParameterType=GasDay&selectedNodeId=2cee0c9c-079b-4eb9-a3bb-416f3480d00b");
		  
	//	driver.findElement(By.xpath("//img[@src='/Content/Images/csv.png']")).click();
	
		driver.findElement(By.xpath("//a[contains(text(), 'Download CSV File')]")).click();
		
		
		
	}
	@Test
	public void tes1t() throws InterruptedException, AWTException {

		//ctrl+shift+F -- to make some part of code more presentable.

		
	//	System.setProperty("webdriver.gecko.driver",
		//		"C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HarshalKulkarni\\Desktop\\Selenium_files\\3rd June\\chromedriver_win32_B39\\chromedriver.exe");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	       chromePrefs.put("profile.default_content_settings.popups", 0);
	       chromePrefs.put("download.default_directory", "C:\\XYZ");
	       ChromeOptions options = new ChromeOptions();
	       HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
	       options.setExperimentalOption("prefs", chromePrefs);
	       options.addArguments("--test-type");
	       options.addArguments("--disable-extensions"); //to disable browser extension popup
	  
	       DesiredCapabilities cap = DesiredCapabilities.chrome();
	       cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
	       cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	       cap.setCapability(ChromeOptions.CAPABILITY, options);
	       WebDriver driver = new ChromeDriver(cap); 
		  //cap.setCapability("marionette", true);
		//  WebDriver driver = new FirefoxDriver(cap);  //Pass fprofile parameter In webdriver to use preferences to download file.
	
		driver.manage().window().maximize();

	//	driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
		  driver.get("http://mip-sit-web.azurewebsites.net/ReportViewer/ViewReport?reportPath=%2FNationalGrid.MipReports%2FReport%20Explorer%2FEntry%20Capacity%20-%20Daily%20Reports%2FAfter%20Day%2FEntry%20Capacity%20Availability%20Report%20(NORD07)&gasDate=2018-06-18&filterParameterType=GasDay&selectedNodeId=2cee0c9c-079b-4eb9-a3bb-416f3480d00b");
		  
		driver.findElement(By.xpath("//img[@src='/Content/Images/csv.png']")).click();
	
	//	driver.findElement(By.xpath("//a[contains(text(), 'Download CSV File')]")).click();
	
	
	}

}
