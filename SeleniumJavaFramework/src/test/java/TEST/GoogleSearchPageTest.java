package TEST;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPagesObjects;


public class GoogleSearchPageTest {
	
	private static WebDriver driver = null; 
	
	public static void main (String[] args){
		
		googleSearchTest();
		
	}
	
	public static void googleSearchTest(){
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPagesObjects searchPageObj = new GoogleSearchPagesObjects(driver);
		
		driver.get("https://google.com");
		searchPageObj.setTextInSearchBox("A B C D");
		searchPageObj.clickSearchButton();
		driver.close();
	}
}
