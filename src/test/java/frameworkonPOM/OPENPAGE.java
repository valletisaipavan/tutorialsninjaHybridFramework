package frameworkonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OPENPAGE {
WebDriver driver;
	
	@FindBy(linkText="Edit your account information")
	private static WebElement openpageedityouraccount;
	
	@FindBy(xpath="//a[text()='Success']")
	private WebElement success;
	public OPENPAGE(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,OPENPAGE.class);
	}
	public static boolean getdisplayedstatusedityouraccountinformation() {
		boolean displayedstatus =openpageedityouraccount.isDisplayed();
		  return displayedstatus;
}
	public boolean successfield() {
		boolean displaystatus = success.isDisplayed();
		return displaystatus;
	}
}

