package webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertJS {

	public static void main(String[] args) throws Exception{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///Users/ppalanisamy/Desktop/SELENIUM/Source/Selenium_Automation/src/webdriver/AlertPopup.html");
		
		String sMainWinHandle = driver.getWindowHandle();
		System.out.println("Current Window Title = "+driver.getTitle());

		driver.findElement(By.name("try")).click();
		
		try
		{
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		}
		catch (NoAlertPresentException npex)
		{
			System.out.println("No Alert ...");
		}
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
