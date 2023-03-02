package Pavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;

public class DPovider { 
	@Test  (dataProvider = "pavan", dataProviderClass=dprovider2.class)
	public void login(String email, String password) {
		System.setProperty("WebDriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("email");
		driver.findElement(By.id("input-password")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	//	Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		driver.quit();
	}

/*	@DataProvider(name="pavan")
	public String[][] datasuppliers() {
		String[][] data = { { "amotooricap9@gmail.com", "12345" }, { "amotooricap1@gmail.com", "12345" }};
				 
         return data;
	
	}*/
}
