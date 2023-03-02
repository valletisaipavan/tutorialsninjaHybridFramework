package precticeSECTION;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceselnm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webDriver.Chrome.driver","E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);

			driver.findElement(By.xpath("//button[@onclick='newBrowserWindow()']")).click();
		Set<String> set= driver.getWindowHandles();
			Iterator<String> itr=set.iterator();
			String parentwindow=itr.next();
			String childwindow=itr.next();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().window(childwindow);
	driver.findElement(By.id("//input[@id='firstName']")).sendKeys("pavan");
				
				
				driver.close();
			}
			
			
			
			
	

}
