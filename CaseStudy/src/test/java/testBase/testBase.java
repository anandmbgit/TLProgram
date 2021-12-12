package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase {

	public static WebDriver driver;
	public static Properties property;
	
	public testBase() {
		
	try {
		property=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir") + "/src/test/java/config.properties");
		property.load(fis);
	    
	    }catch(IOException e) {
		
	 }
	}
	
	
	/* Setup method- to open the required browser */
	 	
	public static void setup() {
		
    String browsername=property.getProperty("browser");		
	if(browsername.equals("chrome")){
	WebDriverManager.chromedriver().setup();
	// System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
	 driver=new ChromeDriver();
	}
	else if(browsername.equals("firefox")){
	  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/src/test/resources/drivers/firefoxdriver.exe");	
	  driver=new FirefoxDriver();
	
	  }
	
	driver.manage().window().maximize();
	driver.get(property.getProperty("url"));
	}
	
	
	public static void switchtoOtherWindow() {
		
		String mainWindowHandle = driver.getWindowHandle();
	     Set<String> allWindowHandles = driver.getWindowHandles();
	     Iterator<String> iterator = allWindowHandles.iterator();
	     while (iterator.hasNext()) {
	         String ChildWindow = iterator.next();
	             if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
	             driver.switchTo().window(ChildWindow);}
	     } 
	     
	     
	}
	
	public void clickButton(WebElement ele) {
   	 WebDriverWait wait=new WebDriverWait(driver,20);
   	 wait.until(ExpectedConditions.elementToBeClickable(ele));
   	 ele.click();
	}
	
	public void select_Checkbox(WebElement element) {
		try {
            if (element.isSelected()) {
               System.out.println("Checkbox: " + element + "is already selected");
            }
            else {
            	
                element.click();
            }
        } catch (Exception e) {
        	System.out.println("Unable to select the checkbox: " + element);
        }
		
	}
	
	public void select_RadioButton(WebElement element) {
		try {
            if (element.isSelected()) {
               System.out.println("RadioButton: " + element + "is already selected");
            }
            else {
            	
                element.click();
            }
        } catch (Exception e) {
        	System.out.println("Unable to select the radio button: " + element);
        }
		
	}
	
	public void deSelect_Checkbox(WebElement element) {
		try {
            if (element.isSelected()) {
            	element.click();
            } else {
            	System.out.println("Checkbox: "+element+"is already deselected");
            }
        } catch (Exception e) {
        	System.out.println("Unable to deselect checkbox: "+element);
        }
    }		
	
	public void javaScriptEx_Click(WebElement element) throws Exception {
		try {
			if (element.isEnabled() && element.isDisplayed()) {
				System.out.println("Clicking on element using java script executor click");

				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			} else {
				System.out.println("Unable to click on element");
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document "+ e.getStackTrace());
	
		}
	}
	
	public void select(By locator, String value) {
        
		//Select select = new Select(locator);
		//select.selectByVisibleText(value);
         
		new Select (driver.findElement(locator)).selectByVisibleText(value); 
		

	}
	
	public boolean isElementPresent(By by) {

		try {

			driver.findElement(by);
			return true;

		} catch (NoSuchElementException e) {

			return false;

		}

	}
	
	public static void enterText(By locator, String value) {
		WebElement textbox = driver.findElement(locator);
		textbox.clear();
		textbox.sendKeys(value);
		}
	
    public static void closeBrowser() {
		
		driver.close();
	}
}
