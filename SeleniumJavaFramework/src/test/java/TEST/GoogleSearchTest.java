package TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	static WebDriver driver = null;
	public static void main (String[] args){
		googleSearch();
	}
	
	public static void googleSearch(){
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// goto google.com
		driver.get("https://google.com");
		
		
	
		// enter text in search text box
		GoogleSearchPage.textbox_serach(driver).sendKeys("automation step by step");
		
		//driver.findElement(By.name("q")).sendKeys("automation step by step");
		
		// click on search button
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		//close browser
		
		driver.close();
		System.out.println("test completed successfully");
		
	}
}
