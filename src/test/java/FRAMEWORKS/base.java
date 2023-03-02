package FRAMEWORKS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	WebDriver driver;
	 public Properties prop;
 public Properties dataprop;
 
	public base () throws FileNotFoundException {

		prop = new Properties();
		File file = new File("E:\\java\\src\\test\\java\\FRAMEWORKS\\fileexcel");
		
		dataprop = new Properties();
		File file1 = new File("E:\\java\\src\\test\\java\\FRAMEWORKS\\dataproperties");
		FileInputStream fis1 = new FileInputStream(file1);
				try {
					dataprop.load(fis1);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
		FileInputStream fis = new FileInputStream(file1);
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public WebDriver initilizationsetup(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {

			//System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\Chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("Firefox")) {
			//System.setProperty("webdriver.firefox.driver", "E:\\Automation\\firefoxdriver_win32\\firefoxdriver.exe");
			driver = new FirefoxDriver();
		} 
	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(utilities.implicit_wait_time));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(utilities.page_wait_time));
		driver.get(prop.getProperty("URL"));
		return driver;
	}

}
