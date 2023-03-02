package FRAMEWORKS;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testsPRCTC2 extends prctc2 {
	
	@Test
	public void login() throws IOException {
		WebDriver driver=intializerDRIVER();
		driver.get(prop.getProperty("URL"));
	}
	

	
	
}
