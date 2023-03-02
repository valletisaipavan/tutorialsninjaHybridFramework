package FRAMEWORKS;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extendreport {

	public  static ExtentReports generateextendreports() {
		ExtentReports extendreport =  new ExtentReports();
		File extendreportfile = new File(System.getProperty("user.dir")+"\\test-output\\ExtendReports\\extendreports.html");
		ExtentSparkReporter sparkrepotar = new ExtentSparkReporter(extendreportfile);

		sparkrepotar.config().setTheme(Theme.DARK);
		sparkrepotar.config().setReportName("tutorialsninja automation");
		sparkrepotar.config().setDocumentTitle("TN automation");
		sparkrepotar.config().setTimeStampFormat("dd/MM/YY hh:mm:ss");
		extendreport.attachReporter(sparkrepotar);
		
		Properties configprop = new Properties();
		File file = new File("E:\\java\\src\\test\\java\\FRAMEWORKS\\fileexcel");
		
		try{
			FileInputStream fis = new FileInputStream(file);
				configprop.load(fis);
		}catch(Throwable e) {
			e.printStackTrace();
		}
	
		extendreport.setSystemInfo("applicationurl","configprop.getproperty(URL)" );
		extendreport.setSystemInfo("browsername","configprop.getproperty(browsername)");
		extendreport.setSystemInfo("email",System.getProperty("email"));
		extendreport.setSystemInfo("windows",System.getProperty("os.name"));
		extendreport.setSystemInfo("username",System.getProperty("user.home"));
		extendreport.setSystemInfo("version",System.getProperty("java.version"));
		return extendreport;
	}
}
