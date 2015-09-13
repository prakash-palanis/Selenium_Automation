package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SendKeysEx {

	public static final String sURL = "http://ccqol.mint.com/CCBank2/greetings.jsp";	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteWebDriver driver = new FirefoxDriver();
		
		driver.get(sURL);

		driver.findElement(By.name("Login")).click();;
		
		try
		{
			Thread.sleep(5000);
		}
		
		catch (Exception e)
		{
			e.printStackTrace();	
		}
		
		driver.quit();

	}

}
