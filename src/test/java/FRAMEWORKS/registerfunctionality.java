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

import frameworkonPOM.HOMEPAGE;
import frameworkonPOM.OPENPAGE;
import frameworkonPOM.REGISTERPAGE;

public class registerfunctionality extends base {
	
	public registerfunctionality() throws FileNotFoundException {
		super();
	
	}
REGISTERPAGE registerpage;
	public WebDriver driver;
	OPENPAGE openpage;
	@BeforeMethod
	public void setup() {
			
		
		driver= initilizationsetup(prop.getProperty("browsername")); 
		HOMEPAGE homepage = new HOMEPAGE(driver) ;
		homepage.clickonmyaccount();
		 REGISTERPAGE registerpage= homepage.register();
		//driver.findElement(By.xpath("//span[text()='My Account']")).click();
		//driver.findElement(By.xpath("//li/a[text()='Register']")).click();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void registermandetory() {
    //  REGISTERPAGE registerpage = new REGISTERPAGE(driver);
//      registerpage.firstnamefield(dataprop.getProperty("firstname"));
//      registerpage.lastnamefields(dataprop.getProperty("lastname"));
//      registerpage.emailfields(utilities.generatetimestamp());
//      registerpage.telephonefield(dataprop.getProperty("telephonenumber"));
//      registerpage.passwordfield("123456");
//      registerpage.confirmpasswordfield("123456");
//      registerpage.agreebuttonfield();
//      OPENPAGE openpage = registerpage.checkbutton();
      openpage=registerpage.navigateregister(dataprop.getProperty("firstname"), dataprop.getProperty("lastname"), utilities.generatetimestamp(), dataprop.getProperty("telephonenumber"),
    		 "123456", "123456");
     // OPENPAGE openpage = new OPENPAGE(driver);
      openpage.successfield();
		//driver.findElement(By.id("input-firstname")).sendKeys(dataprop.getProperty("firstname"));
	//	driver.findElement(By.id("input-lastname")).sendKeys(dataprop.getProperty("lastname"));

	//	driver.findElement(By.id("input-email")).sendKeys(utilities.generatetimestamp());
		//driver.findElement(By.id("input-telephone")).sendKeys(dataprop.getProperty("telephonenumber"));
	//	driver.findElement(By.id("input-password")).sendKeys("123456");
	//	driver.findElement(By.id("input-confirm")).sendKeys("123456");
	//	driver.findElement(By.xpath("//input[@name='agree']")).click();
	//	driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		//Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Success']")).isDisplayed());

	}

	@Test(priority = 2)
	public void registerallfields() {
		  // REGISTERPAGE registerpage = new REGISTERPAGE(driver);
//		      registerpage.firstnamefield(dataprop.getProperty("firstname"));
//		      registerpage.lastnamefields(dataprop.getProperty("lastname"));
//		      registerpage.emailfields(utilities.generatetimestamp());
//		      registerpage.telephonefield(dataprop.getProperty("telephonenumber"));
//		      registerpage.passwordfield("123456");
//		      registerpage.confirmpasswordfield("123456");
//		      registerpage.agreebuttonfield();
//		      registerpage.checkbutton();
		      openpage=registerpage.navigateregister(dataprop.getProperty("firstname"), dataprop.getProperty("lastname"), utilities.generatetimestamp(), dataprop.getProperty("telephonenumber"),
		     		 "123456", "123456");
		     // OPENPAGE openpage = new OPENPAGE(driver);
		      openpage.successfield();
//		driver.findElement(By.id("input-firstname")).sendKeys(dataprop.getProperty("firstname"));
//		driver.findElement(By.id("input-lastname")).sendKeys(dataprop.getProperty("lastname"));
//
//		driver.findElement(By.id("input-email")).sendKeys(utilities.generatetimestamp());
//		driver.findElement(By.id("input-telephone")).sendKeys(dataprop.getProperty("telephonenumber"));
//		driver.findElement(By.id("input-password")).sendKeys("123456");
//		driver.findElement(By.id("input-confirm")).sendKeys("123456");
//		driver.findElement(By.xpath("(//div[@class='col-sm-10']/label/input)[1]")).click();
//		driver.findElement(By.xpath("//input[@name='agree']")).click();
//		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		//driver.findElement(By.xpath("//a[text()='Success']")).isDisplayed();

	}

}
