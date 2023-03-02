package Pavan;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SCRENSHOT {
	public static void main(String[] args) throws IOException, Exception {
		  System.setProperty("WebDriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				driver.get("https://www.goibibo.com/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				WebElement ele=driver.findElement(By.cssSelector("div.sc-bYoBSM.jmHUba p"));
				File source=ele.getScreenshotAs(OutputType.FILE);
				File dest=new File("./screenshot/img1.png");
				FileUtils.copyFile(source, dest, false);
				TakesScreenshot takesscrnshots = (TakesScreenshot) driver;
					File soursefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					File destfile = new File("./screenshot/img.png");
		          FileUtils.copyFile(soursefile,destfile,false);
		          System.out.println("screenshot saved successfully");
				
		
				
				
				
	}

	
		
}
