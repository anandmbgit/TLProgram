package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties property;
	
	public Base() {
		
	try {
		property=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir") + "/src/test/java/config.properties");
		property.load(fis);
	    
	    }catch(IOException e) {
		
	 }
	}
	
	public static void setup() {
		
    String browsername=property.getProperty("browser");		
	if(browsername.equals("chrome")){
	 WebDriverManager.chromedriver().setup();	
	 //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
	 driver=new ChromeDriver();
	}
	else if(browsername.equals("firefox")){
	  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/src/test/resources/drivers/firefoxdriver.exe");	
	  driver=new FirefoxDriver();
	
	  }
	
	driver.manage().window().maximize();
	driver.get(property.getProperty("url"));
	}
	
	
	public static void closeBrowser() {
		
		driver.close();
	}
}
