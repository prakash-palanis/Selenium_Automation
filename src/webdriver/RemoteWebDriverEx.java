package webdriver;

import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class RemoteWebDriverEx {

	public static void main(String[] args) {

		RemoteWebDriver driver  = null;
				
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setBrowserName("internet explorer");
//		capabilities.setBrowserName("firefox");
//		capabilities.setBrowserName("chrome");
		
		try
		{	
			URL rURL = new URL("http://192.168.0.104:4444/wd/hub");
			driver = new RemoteWebDriver(rURL,capabilities);
			
			System.out.println("capabilities.getBrowserName() =" + capabilities.getBrowserName());
			driver.get("http://www.apple.com");
			driver.quit();
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	
		
	}

}
