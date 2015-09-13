package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriver_ActionsEx {

//	public static final String sURL = "http://ccqol.mint.com/CCBank2/greetings.jsp";	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	//	WebDriver driver = CCBankLogin.Login();

		
	//	WebElement acctID = driver.findElement(By.xpath("//*/table/tbody/tr/td[1]"));
		
	/*	System.out.println(acctID.getText());
		
		WebElement logoutLink = driver.findElement(By.linkText("Log Out"));
		
		logoutLink.click();

		driver.findElement(By.name("Login")).click();
	
	*/
 
		WebDriver driver = new FirefoxDriver ();
		
		driver.get("http://ccqol.mint.com/CCBank2/login.jsp?Login=Login");
		
		WebElement loginTxt = driver.findElement(By.name("id"));
		WebElement pwdTxt = driver.findElement(By.name("password"));

		
		Actions builder = new Actions (driver);

		
		loginTxt.sendKeys("afdafsdfsd");

		Thread.sleep(2000);

		loginTxt.clear();

		Thread.sleep(2000);

		Action action = builder.moveToElement(loginTxt).doubleClick().build();
		
		action.perform();
		
		Thread.sleep(20000);
		
		

	}

}
