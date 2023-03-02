package frameworkonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class REGISTERPAGE {

	 WebDriver driver;
	@FindBy(id = "input-firstname")
	private WebElement frstname;
	@FindBy(id = "input-lastname")
	private WebElement lstname;
	@FindBy(id = "input-email")
	private WebElement email;
	@FindBy(id = "input-telephone")
	private WebElement telphone;
	@FindBy(id = "input-password")
	private WebElement password;
	@FindBy(id = "input-confirm")
	private WebElement confirmpassword;
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement agreebutton;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement checkbutton;

	public REGISTERPAGE(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void firstnamefield(String frstnme) {
		frstname.sendKeys(frstnme);
	}

	public void lastnamefields(String lstnme) {
		lstname.sendKeys(lstnme);
	}

	public void emailfields(String emil) {
		email.sendKeys(emil);
	}

	public void telephonefield(String telphon) {
		telphone.sendKeys(telphon);
	}

	public void passwordfield(String passwod) {
		password.sendKeys("passwod");
	}

	public void confirmpasswordfield(String confimpass) {
		confirmpassword.sendKeys("confimpass");
	}

	public void agreebuttonfield() {
		agreebutton.click();
	}

	public OPENPAGE checkbutton() {
		checkbutton.click();
		return OPENPAGE(driver);
	}

	private OPENPAGE OPENPAGE(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public OPENPAGE navigateregister(String frstnme, String lstnme , String emil , String telphon , String passwod , String confimpass ) {
		frstname.sendKeys(frstnme);
		lstname.sendKeys(lstnme);
		email.sendKeys(emil);
		telphone.sendKeys(telphon);
		password.sendKeys("passwod");
		confirmpassword.sendKeys("confimpass");
		agreebutton.click();
		checkbutton.click();
		return OPENPAGE(driver);
	}

}
