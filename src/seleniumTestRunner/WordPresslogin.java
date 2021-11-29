package seleniumTestRunner;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WordPresslogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wordpress.com/log-in");
//		driver.get("https://wordpress.com/stats/day/testingpractise176423519.wordpress.com");
		driver.findElement(By.xpath("//input[@class='form-text-input'][@type='text']")).sendKeys("bhanu12reddy");
		driver.findElement(By.cssSelector("button[type='submit']")).submit();
		WebElement ELE = driver.findElement(By.cssSelector("#password"));
		
		waitfor.waitforelementvisible(driver, ELE, 1).sendKeys("sareddy@123");
		driver.findElement(By.xpath("//*[@type='submit']")).submit();
		Thread.sleep(10000);
		
		driver.quit();
	

	}

}
