package Pavan;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ASSERTION {
	@Test
	public void Testgoogle() throws Exception {
		WebDriver driver = new ChromeDriver();
		System.setProperty("WebDriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		// webDrivermanage.chromedriver().setup();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		String expectedTitle = "HYR Tutorials - Google Search";
		String actualTittle = driver.getTitle();
		assertEquals(actualTittle, expectedTitle);
		// Assert.assertNull(actualTittle);
		// System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void Testfb() throws Exception {
		WebDriver driver = new ChromeDriver();
		// webDrivermanage.chromedriver().setup();
		System.setProperty("WebDriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");   
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("pavan",Keys.ENTER);
		Thread.sleep(2000);
		
		SoftAssert softassert = new SoftAssert();		
				

		//title assertion
		String actualtitle =driver.getTitle();
		String exceptedtitle = "Log in to Facebook";
		softassert.assertNotEquals(actualtitle,exceptedtitle,"get title Missmatch");
		Thread.sleep(2000);
		
		//URL
		String actualurl =driver.getCurrentUrl();
		String exceptedurl = "https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjcxODYxNDMxLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		softassert.assertEquals(actualurl,exceptedurl,"get url");
		Thread.sleep(2000);
		//text
		String actualtext =driver.findElement(By.id("email")).getAttribute("value");
		String exceptedtext = "pavan";
		softassert.assertEquals(actualtext,exceptedtext,"get text");
		Thread.sleep(2000);
		//border
		String actualborder =driver.findElement(By.id("email")).getCssValue("border");
		String exceptedborder = "1px solid rgb(240, 40, 73)";
		softassert.assertEquals(actualborder,exceptedborder,"get border");
		Thread.sleep(2000);
		//error message
		String actualerror =driver.findElement(By.xpath("//div[@id='email_container']/child::div[2]")).getText();
		String exceptederror = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		softassert.assertEquals(actualerror,exceptederror,"get error");
		
		
		
		//System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
		softassert.assertAll();
	}
}
