package Pavan;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;

	@Parameters("url")
	@Test // (priority=2)
	public void FBloginvalidcridentials(String URL) throws InterruptedException {
		driver.get(URL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Pavanzack143@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Saipavan@1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div/span[contains(text(),'Pavan Activates')]")).getText(),
				"Pavan Activates");
	}
	@Parameters("url")
	@Test // (priority=1)
	public void FBloginwithinvalidcredentais(String URL) throws Exception {
		driver.get(URL);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Pavanzack143@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("");
		driver.findElement(By.xpath("//button[@name='login']")).click();

		Assert.assertTrue(
				driver.findElement(By.xpath("//div[@class='_9ay7']/a[text()='Forgotten password?']")).isDisplayed());

	}

	@BeforeMethod 
	public void beforeMethod() {
		System.setProperty("webDriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}

}
