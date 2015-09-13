package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebElementEx {

	public static final String sURL = "http://ccqol.mint.com/CCBank2/greetings.jsp";	

		
	
	public static void main (String [] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver ();
		
		WebElement loginBtn;
		
		WebElement loginTxt;
		
		WebElement passwordTxt;
		
		try
		{
			driver.get(sURL);
			
			System.out.println("driver.findElement(By.name('Login')).getLocation()"+driver.findElement(By.name("Login")).getLocation());
			System.out.println(driver.findElement(By.name("Login")).getCssValue("font-family"));
			System.out.println(driver.findElement(By.name("Login")).getSize().toString());
			System.out.println(driver.findElement(By.name("Login")).getTagName());
			
			loginBtn = driver.findElement(By.name("Login"));
			
			loginBtn.click();
			
			loginTxt = driver.findElement(By.name("id"));
			
			loginTxt.sendKeys("-------------------");
			
			
			loginTxt.sendKeys(Keys.SHIFT,Keys.ARROW_LEFT,Keys.ARROW_LEFT,Keys.ARROW_LEFT,Keys.ARROW_LEFT,Keys.ARROW_LEFT);
			
			Thread.sleep(2000);
			
			loginTxt.sendKeys(Keys.SHIFT + "A");
			
		/*	loginTxt.clear();
			
			loginTxt.sendKeys("webdriver");
			
			passwordTxt = driver.findElement(By.name("password"));
			
			passwordTxt.clear();
			
			passwordTxt.sendKeys("quicken");
		*/
		}
		
		finally
		{
			try
			{
				Thread.sleep(4000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			//driver.quit();
		}
	}
	
}
