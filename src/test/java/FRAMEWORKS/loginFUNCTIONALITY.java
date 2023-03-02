 package FRAMEWORKS;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameworkonPOM.ACCOUNTPAGE;
import frameworkonPOM.HOMEPAGE;
import frameworkonPOM.OPENPAGE;

public class loginFUNCTIONALITY extends base {

	public loginFUNCTIONALITY() throws FileNotFoundException {
		super();

	}

	public WebDriver driver;
   ACCOUNTPAGE accountpage;
	@AfterMethod
	public  void teardown() {
		driver.quit();
	}

	@BeforeMethod
	public void setup() {

		driver = initilizationsetup(prop.getProperty("browsername"));
		HOMEPAGE homepage = new HOMEPAGE(driver);
		ACCOUNTPAGE accountpage =HOMEPAGE.navigatetologin();
		//HOMEPAGE.clickonmyaccount();
		 //accountpage= HOMEPAGE.clicklogin();
//	driver.findElement(By.xpath("//span[text()='My Account']")).click();
//	driver.findElement(By.xpath("//a[text()='Login']")).click();
	}

	@Test(priority = 1, dataProvider = "suppliestestdata")
	public void loginwithvalidcredentials(String email, String password) {
		//ACCOUNTPAGE accountpage = new ACCOUNTPAGE(driver);
//		accountpage.email(email);
//		accountpage.password(password);
//		 OPENPAGE openpage = accountpage.login();
		 OPENPAGE openpage= accountpage.login(email, password);
		//OPENPAGE openpage = new OPENPAGE(driver);
		openpage.getdisplayedstatusedityouraccountinformation();
//		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("email"));
//		driver.findElement(By.id("\"input-email\"")).sendKeys(prop.getProperty("password"));
//		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
//	    driver.findElement(By.linkText("Edit your account information")).isDisplayed();

	}

	@Test(priority = 2)
	public void loginwithinvalidcredentails() {
//		ACCOUNTPAGE accountpage = new ACCOUNTPAGE(driver);
//		accountpage.email(utilities.generatetimestamp());
//		accountpage.password(dataprop.getProperty("invalidpassword"));
//		accountpage.login();
		OPENPAGE openpage=accountpage.login(utilities.generatetimestamp(), dataprop.getProperty("invalidpassword"));
		//driver.findElement(By.id("input-email")).sendKeys(utilities.generatetimestamp());
		//driver.findElement(By.id("input-password")).sendKeys(dataprop.getProperty("invalidpassword"));
		//driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		String actualmessege =accountpage.retrivepasswordandemail();           //driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String expectedmessege = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualmessege.contains(expectedmessege), "expected messege not displayed");

	}

	@Test(priority = 3)
	public void loginwithoutcresentials() {
//		ACCOUNTPAGE accountpage = new ACCOUNTPAGE(driver);
//		accountpage.email("");
//		accountpage.password("");
//		accountpage.login();
		OPENPAGE openpage =accountpage.login("" ,"");
//		driver.findElement(By.id("input-email")).sendKeys("");
//		driver.findElement(By.id("input-password")).sendKeys("");
//		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		String actualmessege = accountpage.retrivepasswordandemail();          //driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String ecpectedmessege = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualmessege.contains(ecpectedmessege), "excepted not deplayed");

	}

	@Test(priority = 4)
	public void validgmailinvalipassword() {
//		ACCOUNTPAGE accountpage = new ACCOUNTPAGE(driver);
//		accountpage.email(prop.getProperty("email"));
//		accountpage.password(dataprop.getProperty("invalidpassword"));
//		accountpage.login();
		OPENPAGE openpage =accountpage.login(prop.getProperty("email") ,dataprop.getProperty("invalidpassword"));
//		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("email"));
//		driver.findElement(By.id("input-password")).sendKeys(dataprop.getProperty("invalidpassword"));
//		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		String actualmessege =   accountpage.retrivepasswordandemail();             //  driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String ecpectedmessege = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualmessege.contains(ecpectedmessege), "excepted not deplayed");

	}

	@Test(priority = 5)
	public void validpasswordinvalidgmail() {
//		ACCOUNTPAGE accountpage = new ACCOUNTPAGE(driver);
//		accountpage.email(prop.getProperty(utilities.generatetimestamp()));
//		accountpage.password(prop.getProperty("password"));
//		accountpage.login();
		OPENPAGE openpage =accountpage.login(prop.getProperty(utilities.generatetimestamp()) ,prop.getProperty("password"));

//		driver.findElement(By.id("input-email")).sendKeys(utilities.generatetimestamp());
//		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
//		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		String actualmessege =  accountpage.retrivepasswordandemail();                 //driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String ecpectedmessege = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualmessege.contains(ecpectedmessege), "excepted not deplayed");

	}

	@DataProvider
	public Object[][] suppliestestdata() {                  // THIS DATA WILL STORED ON EXCEL FILES
		Object[][] data = /*utilities.readdatafromexcel();*/    {{"amotooricap9@gmail.com","12345"},
															 {"amotooricap1@gmail.com","123"}};

		return data;
	}

}
