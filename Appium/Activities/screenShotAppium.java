package AppiumActivities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class screenShotAppium {
	    AppiumDriver<MobileElement> driver = null;

	    @BeforeClass
	    public void beforeClass() throws MalformedURLException {
	        // Set the Desired Capabilities
	    	DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "MyTestEmulator");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("automationName", "UiAutomator2");
	        caps.setCapability("appPackage", "com.android.calculator2");
	        caps.setCapability("appActivity", ".Calculator");
	        caps.setCapability("noReset", true);
	        // Instantiate Appium Driver
	        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer,caps);
	    }

	    @Test
	    public void mainTest() throws IOException {
	        File screenShotName;
	        // Take screenshot
	        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	        // This specifies the location the screenshot will be saved
	        screenShotName = new File("src/test/resources/screenshot.jpg");

	        // This will copy the screenshot to the file created
	        FileUtils.copyFile(scrFile, screenShotName);

	        //Set filepath for image
	        String filePath = "../"+screenShotName.toString();
	        
	        //Set image HTML in the report
	        String path = "<img src='"+ filePath +"'/>";
	        
	        //Show image in report
	        Reporter.log(path);
	    }

	    @AfterClass
	    public void afterClass() {
	        driver.quit();
	    }
	}