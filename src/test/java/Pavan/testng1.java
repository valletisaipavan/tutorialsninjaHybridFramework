package Pavan;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testng1 {

	
	@Test
	public void testgoogle() throws Exception {
		System.setProperty("WebDriver.Chrome.driver","E:\\Automation\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("hyr tutorials",Keys.ENTER);
Assert.assertEquals(driver.findElement(By.xpath("(//div/cite[@class='iUh30 tjvcx'])[1]")).getText(),"https://www.hyrtutorials.com");
		
		
		
//Assert.assertTrue(driver.findElement(By.linkText("https://www.hyrtutorials.com")).isDisplayed());
//String exceptedtitle = "hyr tutorials - Google Search";
//String actualtitle = driver.getTitle();
//Assert.assertEquals(actualtitle, exceptedtitle);
////System.out.println(driver.getTitle());
Thread.sleep(2000);
driver.close();
	}
	
	
	@Test
	public void testfacebook() throws InterruptedException {
	System.setProperty("webDriver.chrome.driver","E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pavan");
			System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.close();
		
		
		 
		
		
		
		
		
	

}}
