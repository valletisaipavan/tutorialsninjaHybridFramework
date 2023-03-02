package FRAMEWORKS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class prctc2 {
WebDriver driver;
Properties prop;
	public WebDriver intializerDRIVER() throws IOException {
		File file =new File("E:\\java\\src\\test\\java\\FRAMEWORKS\\fileexcel");
		 prop = new Properties();
		FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
		
		String browsername = "chrome";
		if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver","E:\\Automation\\geckodriver-v0.32.0-win32\\firefoxdriver.exe");
			 driver = new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webDriver.Chrome.driver","E:\\Automation\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	  
	}

}
