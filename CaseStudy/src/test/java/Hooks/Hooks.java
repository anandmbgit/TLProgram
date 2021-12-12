package Hooks;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import testBase.testBase;

public class Hooks extends testBase {

	@After(order=1)
	public void takeScreenshotOnFailure(Scenario scenario) {
		
		if(scenario.isFailed())	{
			TakesScreenshot ts=(TakesScreenshot) driver;
			byte[] src=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
	    	}	
	}
	
	@After(order=0)
	public void close() {
	//driver.quit();	
	}
}
