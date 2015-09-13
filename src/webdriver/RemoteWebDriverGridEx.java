package webdriver;

import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class RemoteWebDriverGridEx {

	public static void main(String[] args) {

		RemoteWebDriver driver, macDriver;
				
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
//		capabilities.setBrowserName("firefox");
//		capabilities.setBrowserName("chrome");
		
		try
		{	
			URL rURL = new URL("http://localhost:43210/wd/hub");

			
			/*capabilities.setBrowserName("internet explorer");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(rURL,capabilities);
			
			System.out.println("capabilities.getBrowserName() =" + capabilities.getBrowserName());
			driver.get("http://www.apple.com");
			Thread.sleep(5000);
			driver.quit();

			Thread.sleep(2000);*/
			
			capabilities.setBrowserName("internet explorer");
			capabilities.setPlatform(Platform.MAC);
			macDriver = new RemoteWebDriver(rURL,capabilities);
			
			System.out.println("capabilities.getBrowserName() =" + capabilities.getBrowserName());
			macDriver.get("http://www.ibm.com");
			Thread.sleep(5000);
			macDriver.quit();

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	
		
	}

}
