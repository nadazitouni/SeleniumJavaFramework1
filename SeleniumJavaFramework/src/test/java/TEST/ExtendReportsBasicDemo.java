package TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsBasicDemo {
	
	private static WebDriver driver = null;
	
	public static void main (String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test1","this is test to validate google search functionality");
		
        
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		   // log(Status, details)
        test1.log(Status.INFO, "starting test case");
		
		driver.get("https://google.com");
		
		test1.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		
		test1.pass("Entered text in Searchbox");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		test1.pass("click in search button");
		
		driver.close();
		driver.quit();
		test1.pass("close the browser");
	
		test1.info("test completed");
		

        

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test2 = extent.createTest("Google Search Test2","this is test to validate google search functionality");
		
        
		String projectPath1 = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath1+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		   // log(Status, details)
        test2.log(Status.INFO, "starting test case");
		
		driver.get("https://google.com");
		
		test1.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		
		test2.pass("Entered text in Searchbox");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		test2.fail("click in search button");
		
		driver.close();
		driver.quit();
		test2.pass("close the browser");
	
		test2.info("test completed");
		
        // calling flush writes everything to the log file
        extent.flush();
	}

}
