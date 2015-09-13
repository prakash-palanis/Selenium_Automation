package webdriver;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TakesScreenShotEx {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver = new FirefoxDriver();
		
		try{

		    driver.get("http://www.mint.com/");
		    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    System.out.println(scrFile.getAbsolutePath());
		    
		    File screenshotFile = new File (scrFile.getAbsolutePath() + ".screenshot.png"); 		    
		    Files.copy(scrFile.toPath(), screenshotFile.toPath());
		    System.out.println(screenshotFile.getAbsolutePath());


		}

		finally
		{
			//driver.quit();
		}
		
	}

}
