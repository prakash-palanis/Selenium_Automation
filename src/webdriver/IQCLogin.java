package webdriver;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

class IQC_IAM_ID
{
	private String loginID;
	private String password;
	
	IQC_IAM_ID ()
	{
		loginID = "beta2@QW2016.com";
		password = "quicken";
	}

	public String getLoginID() {
		return loginID;
	}

	public String getPassword() {
		return password;
	}
	
	
}

public class IQCLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		IQC_IAM_ID betaIAM = new IQC_IAM_ID ();

		WebDriver driver = new FirefoxDriver();
		
		String sURL = "";
		
		sURL = "https://login.quicken.com/login";
		
		driver.get(sURL);
		
		System.out.println("Loaded page ... " + sURL);
		
		driver.findElement(By.name("glogin")).sendKeys(betaIAM.getLoginID());		
		driver.findElement(By.name("password")).sendKeys(betaIAM.getPassword());
		driver.findElement(By.id("Button1")).click();
		
		System.out.println("Page submitted ... ");
										
		driver.close();
*/
		
/*		HtmlUnitDriver hd = new HtmlUnitDriver();
		
		hd.get("http://www.quicken.com");
		
		System.out.println(hd.getCurrentUrl());
		System.out.println(hd.getTitle());
		
//		System.out.println(hd.manage().window().getSize());
		
//		System.out.println(hd.getBrowserVersion());
		
//		System.out.println(hd.getPageSource());
		
		System.out.println(hd.getWindowHandle());
		
		hd.quit();
*/
		
	}

}
