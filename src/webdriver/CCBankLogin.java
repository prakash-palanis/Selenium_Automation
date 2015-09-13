package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

public class CCBankLogin {

	public static final String sURL = "http://ccqol.mint.com/CCBank2/login.jsp?Login=Login";	
	
	public static WebDriver Login ()
	{
		 	WebDriver driver = new FirefoxDriver();	
			driver.get(sURL);
			
			WebElement loginTxt = driver.findElement(By.name("id"));
			WebElement pwdTxt = driver.findElement(By.name("password"));
			WebElement submitBtn = driver.findElement(By.name("Login"));
			
			
			loginTxt.clear();
			loginTxt.sendKeys("webdriver");
			
			pwdTxt.clear();
			pwdTxt.sendKeys("quicken");
		
			submitBtn.click();
			
			return driver;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver myDriver = CCBankLogin.Login();
		
		myDriver.quit();

	}

}
