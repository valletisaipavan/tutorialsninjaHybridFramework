package MYRUNNER;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features",glue="stepDefnations",publish=true,
		plugin={"pretty","html:target/Cucumber_Report/Cucumberreport.html"
				,"json:target/Cucumber_Report/Cucumberreport.json",
				"junit:target/Cucumber_Report/Cucumberreport.XML"})
public class RUNNERfiles {
}


	

 