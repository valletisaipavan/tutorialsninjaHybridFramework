 package FRAMEWORKS;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import frameworkonPOM.ACCOUNTPAGE;

public class searchFUNCTIONALITY  extends base {
	
	public searchFUNCTIONALITY() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	public WebDriver driver;
	Properties prop;
	ACCOUNTPAGE accountpage;
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	@BeforeMethod
	public void setup() {
		driver= initilizationsetup(prop.getProperty("browsername")); 
	}
@Test
	public void searchvalidproduct()  {
	//ACCOUNTPAGE accountpage = new ACCOUNTPAGE(driver) ;
	accountpage.texttypefield(dataprop.getProperty("validproduct"));
		accountpage.searchbuttonfield();
		Assert.assertTrue(accountpage.productdisplayedfield());
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys(dataprop.getProperty("validproduct"));
		//driver.findElement(By.xpath("//span/button[@type='button']")).click();
	
		   //     Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	
	}
	@Test
	public void searchinvalidproduct() {
		//ACCOUNTPAGE accountpage = new ACCOUNTPAGE(driver) ;
		accountpage.texttypefield(dataprop.getProperty("validproduct"));
			accountpage.searchbuttonfield();
			Assert.assertTrue(accountpage.invaliddisplayedfield());
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(dataprop.getProperty("invalidproduct"));
	//	driver.findElement(By.xpath("//span/button[@type='button']")).click();
		//Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']/h2")).isDisplayed(),"it is not displayed");
		
			}
	@Test
	public void searchwithoutanyproduct() {
		//ACCOUNTPAGE accountpage = new ACCOUNTPAGE(driver) ;
		accountpage.texttypefield(dataprop.getProperty("validproduct"));
			accountpage.searchbuttonfield();
//			Assert.assertTrue(accountpage.invaliddisplayedfield());
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");
//		driver.findElement(By.xpath("//span/button[@type='button']")).click();
//		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']/h2")).isDisplayed());
	}
	
	
	
	
	
	
	
	
	
	
}
