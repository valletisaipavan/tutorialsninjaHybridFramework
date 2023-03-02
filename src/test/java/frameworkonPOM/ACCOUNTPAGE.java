 package frameworkonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ACCOUNTPAGE {

	
	  static WebDriver driver;
	@FindBy(id="input-email")
	 private static WebElement enteremail;
	
	@FindBy(id="input-password")
private static	WebElement enterpassword;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private static  WebElement login;
	
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	private static WebElement emailisnotmatched;
	
	@FindBy(xpath="//input[@type='text']")
	public WebElement texttype;

	@FindBy(xpath="//span/button[@type='button']")
	public WebElement searchbutton;
	
	@FindBy(linkText="HP LP3065")
	WebElement productdisplayed;
	
	@FindBy(xpath="//div[@id='content']/h2")
	WebElement invaliddisplayed;
	
	public ACCOUNTPAGE(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, ACCOUNTPAGE.class);	
		}
	public void email(String emailtext) {
		enteremail.sendKeys();
	}
	public static void password(String passwordtext) {
		enterpassword.sendKeys();
	}
	public static OPENPAGE login() {
		login.click();
		return new OPENPAGE(driver);
	}
	public OPENPAGE login(String emailtext , String passwordtext) {
		enteremail.sendKeys(emailtext);
		enterpassword.sendKeys(passwordtext);
		login.click();
		return new OPENPAGE(driver);
	}
	
	
		public static String retrivepasswordandemail() {
			String warningtext = emailisnotmatched.getText();
			return warningtext;
		}
		public void texttypefield(String validproduct) {
			texttype.sendKeys(validproduct);
		}
		public void searchbuttonfield() {
			searchbutton.click();
			
			
		}
		
		
		public boolean productdisplayedfield() {
			boolean display=productdisplayed.isDisplayed();
			return display;
		}
		public boolean invaliddisplayedfield() {
			boolean invalidisplay= invaliddisplayed.isDisplayed();
			return invalidisplay;
		
	}
}

