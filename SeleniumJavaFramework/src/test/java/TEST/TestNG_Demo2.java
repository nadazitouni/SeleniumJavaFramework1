package TEST;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demo.Log4jDemo;


public class TestNG_Demo2 {
	
	WebDriver driver = null;
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	@BeforeTest
	public void setUpTest(){
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("Browser1 started");
		
	}
	
	
	@Test
	public static void googleSearch(){
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("Browser 2 started");
		// goto google.com
		driver.get("https://google.com");
		
		logger.info("go into google.com");
		// enter text in search text box
		
		driver.findElement(By.id("q")).sendKeys("automation step by step");
		
		logger.info("enter text in search box");
		// click on search button
		
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		logger.info("enter text in search box");

		}
	
	@AfterTest
	public void tearDownTest(){
		
		//close browser
		
		driver.close();
		driver.quit();
		System.out.println("test completed successfully");
	}
	
}
