package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx {

	public static void main(String[] args) {

		String sURL = "http://investing.quicken.com";
		
		WebDriver driver = new FirefoxDriver ();
				
		try
		{
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.get(sURL);
		}
		catch (TimeoutException pgldTimeout)
		{
			System.out.println("Page didn't load in 5 secs ...");	
		}

		int i, iMaxTry = 5;

		i = 0;

		while (i < iMaxTry){

			try{

				WebDriverWait wait = new WebDriverWait(driver,60);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("glogin"))));
			}
			catch (Exception e)
			{
				i++;
				System.out.println("Try #" + i);
				driver.navigate().refresh();
			}
		}
		System.out.println("Done");
	}

}
