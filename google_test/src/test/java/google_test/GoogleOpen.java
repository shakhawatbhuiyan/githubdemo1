package google_test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleOpen {

	@Test

	public void GoogleOpen() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://techfios.com/test/billing/?ng=admin/");

		//WebElement element = driver.findElement(By.id("gb_70"));
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		

		driver.findElement(By.id("password")).sendKeys("abc123");

		driver.findElement(By.name("login")).click();

		driver.close();
		
		driver.quit();
	}
}
