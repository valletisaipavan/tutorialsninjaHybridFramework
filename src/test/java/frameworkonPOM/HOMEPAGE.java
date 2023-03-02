package frameworkonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HOMEPAGE {
	 static WebDriver driver;
	// objects
	@FindBy(xpath = "//span[text()='My Account']")
	private static WebElement myaccountdropmenu;

	@FindBy(xpath = "//a[text()='Login']")
	private static WebElement login;
	
	@FindBy(xpath="//li/a[text()='Register']")
	private static WebElement register;

	public HOMEPAGE(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// actions
	public static void clickonmyaccount() {
		myaccountdropmenu.click();
	}

	public static ACCOUNTPAGE clicklogin() {
		login.click();
		return new  ACCOUNTPAGE(driver);
	}
	public static  ACCOUNTPAGE navigatetologin() {
		myaccountdropmenu.click();
		login.click();
		return new  ACCOUNTPAGE(driver);
	}
	
	
	
	public static REGISTERPAGE register() {
		 register.click();
		 return new REGISTERPAGE(driver);
	}
	
	
	
	
	
	
	
	
}
