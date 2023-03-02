package Pavan;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dependsonmethods {
	
	WebDriver driver ;
	@Test
	public void login() {
		
	
	
		System.setProperty("WebDriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	
		driver.findElement(By.id("input-email")).sendKeys("amotooricap9@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	}
	
	@Test(dependsOnMethods= {"login"},alwaysRun=true)
	public void addproductwishlist() throws InterruptedException {
	driver.findElement(By.xpath("//input[@class='form-control input-lg']")).sendKeys("HP",Keys.ENTER);
	driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();
	Thread.sleep(2000);
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	WebElement wishlist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("wish list")));
//	wishlist.click();
	
	driver.findElement(By.xpath("//a[text()='wish list']")).click();
	 Assert.assertTrue(driver.getTitle().equals("My Wish List"));
	

	}
	
	
	@Test(dependsOnMethods= {"addproductwishlist"},alwaysRun=true)
	public void removewishlist() {
		driver.findElement(By.xpath("//a[@class='btn btn-danger']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[text()='Your wish list is empty.']")).getText().equals("Your wish list is empty."));
		driver.quit();
	 
		
	}}
