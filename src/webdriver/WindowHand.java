package webdriver;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///Users/ppalanisamy/Desktop/SELENIUM/Source/Selenium_Automation/src/webdriver/WindowPopup.html");
		
		String sMainWinHandle = driver.getWindowHandle();

		WebElement gLink = driver.findElement(By.linkText("Google"));
		WebElement yLink = driver.findElement(By.linkText("Yahoo"));
		
		// google //ID: gs_htif0
		//yahoo  // ID: UHSearchBox
				
		try{
			
			Set <String> winHandles;

			System.out.println("Clicking Google .... Don't distrub ...");

		gLink.click();
		
		winHandles = driver.getWindowHandles();
				
		for (String handle: winHandles)
		{
			driver.switchTo().window(handle);
			System.out.println("Current Window Title = "+driver.getTitle());
			Thread.sleep(1000);			
		}

		driver.close();

		System.out.println("Switching to Main .... Don't distrub ...");
		driver.switchTo().window(sMainWinHandle);
		System.out.println("Clicking Yahoo .... Don't distrub ...");
		yLink.click();
		
		winHandles = driver.getWindowHandles();
				
		for (String handle: winHandles)
		{
			driver.switchTo().window(handle);
			System.out.println("Current Window Title = "+driver.getTitle());
		}

		
		}
		catch ( Exception e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println("\nDone");
		
	}

}
