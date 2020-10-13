package TEST;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import demo.Log4jDemo;

public class TestNG_Demo3 {

	WebDriver driver = null;
	public static String browserName=null; 
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	// should run before test
	
	@BeforeTest
	public void setUpTest(){
		
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		if (browserName.equalsIgnoreCase("chrome")){
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		}
		else if (browserName.equalsIgnoreCase("firefox"))
			
			{
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\nedaz\\workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();	
			
			}
		
		
		logger.info("Browser started");
	
	}
	
	// current test
	@Test
	public void googleSearch(){
		
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		/*if (browserName.equalsIgnoreCase("chrome")){
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		}
		else if (browserName.equalsIgnoreCase("firefox"))
			
			{
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\nedaz\\workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();	
			
			}*/
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		logger.info("Browser 2 started");
		// goto google.com
		driver.get("https://google.com");
		logger.info("Navigated to google.com");
		// enter text in search text box
		
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		
		// click on search button
		
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		

		
	}
	
	// should run after test
	@AfterTest
	public void tearDownTest(){
		//close browser
		
		driver.close();
		driver.quit();
		System.out.println("test completed successfully");
	}
	
}
