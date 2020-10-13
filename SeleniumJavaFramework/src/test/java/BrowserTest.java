

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args){
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\nedaz\\workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver","C:\\Users\\nedaz\\workspace\\SeleniumJavaFramework\\drivers\\iedriver\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
	
		int count = listOfInputElements.size();
		
		System.out.println ("count of input elements: " +count);
		//WebElement textBox = driver.findElement(By.xpath("//input[@name='q']"));
		//textBox.sendKeys("automation step by step");
		
		
		/*try {
			
			Thread.sleep(3000);
		} catch (InterruptedException e){
			//TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//driver.close();
		//driver.quit();
		
	}
}
