package webdriver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class ChromeDriverServiceEx {

	
	public static void main (String [] args)
	{
		ChromeDriverService.Builder builder = new ChromeDriverService.Builder();
		
		File file = new File ("/Users/ppalanisamy/Desktop/SELENIUM/libs/chromedriver");
		
		ChromeDriverService  chromeSvc = builder.usingDriverExecutable(file).usingPort(55555).build();
		
		try
		{
			if ( ! (chromeSvc.isRunning())){
				System.out.println("Starting chromeSvc.start() as chromeSvc is NOT RUNNING ");
				chromeSvc.start();
			}
			else
				System.out.println("Skipping chromeSvc.start() as chromeSvc is already running");


			WebDriver driver = new ChromeDriver(chromeSvc);

			Navigation nav = driver.navigate();

			nav.to("http://www.yahoo.com");
			
			Thread.sleep(3000);
			
			driver.quit();
			if ( chromeSvc.isRunning() ) chromeSvc.stop();
			
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}		
	}
}
