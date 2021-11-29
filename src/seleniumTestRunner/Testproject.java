package seleniumTestRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testproject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.gmail.com/");
		Thread.sleep(3000);
//		Driver.findElement(By.name("q")).sendKeys("gmail",Keys.ENTER);
//		Thread.sleep(3000);
//		Driver.findElement(By.xpath("(//*[@class=\"LC20lb DKV0Md\"])[1]")).click();
//		Thread.sleep(3000);
//		Driver.findElement(By.linkText("Sign in")).click();
//		Thread.sleep(10000);
		int x = Driver.manage().getCookies().size();
		System.out.println(x);
		Driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("bhanu@vaidhyamegha.com");
		Thread.sleep(3000);
		
		
		Driver.close();

	}

}
